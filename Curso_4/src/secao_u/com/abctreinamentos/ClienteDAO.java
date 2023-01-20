package secao_u.com.abctreinamentos;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class ClienteDAO {

    static String url = "jdbc:mysql://localhost:3306/cursojava";
    static String usuario = "wassabi";
    static String senha = "wassabi";
    static Connection conexao;

    public static void conectar() throws SQLException{
        conexao = DriverManager.getConnection(url, usuario, senha);
        DatabaseMetaData meta = conexao.getMetaData();
        conexao.setAutoCommit(false);
        System.out.println("Conectado ao Banco de Dados"+meta.getDatabaseProductVersion());
    }
    
    public static void desconectar() throws SQLException{
        conexao.close();
    }

    public static void inserir(Cliente cliente) throws SQLException{
        String sql = "insert into Cliente values ("+cliente.getCpf()+", '"+cliente.getNome()+"', '"+cliente.getEmail()+"')";
        Statement statement = conexao.createStatement();
        statement.execute(sql);
        conexao.commit();
        
    }


    public static Cliente consultar(long cpf) throws SQLException{
        String sql = "select * from Cliente where cpf="+cpf+"";
        Statement statement = conexao.createStatement();
        ResultSet rs = statement.executeQuery(sql);
        Cliente cliente = null;
        while(rs.next()){
            cliente = new Cliente(rs.getInt(1), rs.getString(2), rs.getString(3));
        }
        return cliente;
    }

    public static List<Cliente> consultarTodos() throws SQLException {
        String sql = "select * from Cliente";
        Statement statement = conexao.createStatement();
        ResultSet rs = statement.executeQuery(sql);
        List<Cliente> clientes = new LinkedList<>();
        while(rs.next()){
            Cliente cliente = new Cliente(rs.getInt(1), rs.getString(2), rs.getString(3));
            clientes.add(cliente);
        }
        return clientes;
    }

    public static void alterar(Cliente cliente) throws SQLException{
        String sql = "update Cliente set nome='"+cliente.getNome()+"', email='"+cliente.getEmail()+"' where cpf="+cliente.getCpf();
        Statement statement = conexao.createStatement();
        statement.executeUpdate(sql);
        conexao.commit();

    }

    public static void excluir(long cpf) throws SQLException{
        String sql = "delete from Cliente where cpf="+cpf+"";
        Statement statement = conexao.createStatement();
        statement.executeUpdate(sql);
        conexao.commit();


    }

    public static void main(String[] args) {
        try {
            conectar();
            Scanner entrada = new Scanner(System.in);
            int opcao = 0;
            long cpf;
            String nome, email;
            while(opcao != 6){
                System.out.println("Sistema de Gerenciamento de Clientes");
                System.out.println("====================================");
                System.out.println("Digite [1] para consultar Todos Clientes");
                System.out.println("Digite [2] para consultar um Cliente específico");
                System.out.println("Digite [3] para Cadastrar um Novo Cliente");
                System.out.println("Digite [4] para Alterar um Clientes");
                System.out.println("Digite [5] para Excluir um Cliente");
                System.out.println("Digite [6] para Sair");
                opcao = entrada.nextInt();

                switch(opcao){
                    case 1:{//Consultar todos
                        System.out.println("[1] Consultar Todos");
                        List<Cliente> clientes = ClienteDAO.consultarTodos();
                        clientes.forEach(System.out::println);
                        break;
                    }
                    case 2:{
                        System.out.println("[2] Consultar um Cliente Específico");

                        System.out.println("Favor informar o cpf: ");
                        cpf = entrada.nextLong();
                        Cliente cliente = ClienteDAO.consultar(cpf);
                        System.out.println(cliente);
                        break;

                    }
                    case 3:{
                        System.out.println("[3] Cadastrar Novo Cliente");
                        System.out.println("Favor informar o cpf: ");
                        cpf = entrada.nextLong();
                        entrada.nextLine();//esvasiar o buffer
                        System.out.println("Favor informar o Nome: ");
                        nome = entrada.next();
                        entrada.nextLine();
                        System.out.println("Favor informar o email: ");
                        email = entrada.next();
                        entrada.nextLine();
                        Cliente cliente = new Cliente(cpf, nome, email);
                        ClienteDAO.inserir(cliente);
                        break;
                        
                    }
                    case 4:{
                        System.out.println("[4] Alterar um Cliente");
                        System.out.println("Favor informar o cpf: ");
                        cpf = entrada.nextLong();
                        entrada.nextLine();//esvasiar o buffer
                        System.out.println("Favor informar o Nome: ");
                        nome = entrada.next();
                        entrada.nextLine();
                        System.out.println("Favor informar o email: ");
                        email = entrada.next();
                        entrada.nextLine();
                        Cliente cliente = new Cliente(cpf, nome, email);
                        ClienteDAO.alterar(cliente);
                        break;
                    }
                    case 5:{
                        System.out.println("[5] Excluir um Cliente");
                        System.out.println("Favor informar o cpf: ");
                        cpf = entrada.nextLong();
                        ClienteDAO.excluir(cpf);
                        break;
                        
                    }
                    case 6:{
                        System.out.println("Encerrando o Sistema...");
                        break;
                    }
                }

            }
            entrada.close();
            desconectar();
        } catch (Exception e) {
            e.getStackTrace();
        }

        
    }
}
