package secao_u;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ClienteApp {

    static String url = "jdbc:mysql://localhost:3306/cursojava";
    static String usuario = "wassabi";
    static String senha = "wassabi";
    static Connection conexao;

    public static void conectar() throws SQLException{
        conexao = DriverManager.getConnection(url, usuario, senha);
        conexao.setAutoCommit(false);
    }
    
    public static void desconectar() throws SQLException{
        conexao.close();
    }

    public static void inserir(long cpf, String nome, String email) throws SQLException{
        String sql = "insert into Cliente values ("+cpf+", '"+nome+"', '"+email+"')";
        Statement statement = conexao.createStatement();
        statement.execute(sql);
        conexao.commit();
        
    }

    public static void inserirPS(long cpf, String nome, String email) throws SQLException{
        String sql = "insert into Cliente values (?,?,?)";
        PreparedStatement statement = conexao.prepareStatement(sql);
        statement.setLong(1, cpf);
        statement.setString(2, nome);
        statement.setString(3, email);
        statement.executeUpdate();
        conexao.commit();
        
    }

    public static void consultar(long cpf) throws SQLException{
        String sql = "select * from Cliente where cpf="+cpf+"";
        Statement statement = conexao.createStatement();
        ResultSet rs = statement.executeQuery(sql);

        while(rs.next()){
            System.out.println("cpf: "+rs.getInt(1)+
            ", nome: "+rs.getString(2)+ ", email: "+rs.getString(3));

        }
    }

    public static void consultarTodos() throws SQLException {
        String sql = "select * from Cliente";
        Statement statement = conexao.createStatement();
        ResultSet rs = statement.executeQuery(sql);
        int contador = 0;
        
        while(rs.next()){
            System.out.println("cpf: "+rs.getInt(1)+
            ", nome: "+rs.getString(2)+ ", email: "+rs.getString(3));
            System.out.println("==============================");
            contador++;
        }
        System.out.println("Numero de Clientes listados é: "+contador);
    }

    public static void alterar(long cpf, String nome, String email) throws SQLException{
        String sql = "update Cliente set nome='"+nome+"', email='"+email+"' where cpf="+cpf;
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
                        consultarTodos();
                        break;
                    }
                    case 2:{
                        System.out.println("[2] Consultar um Cliente Específico");

                        System.out.println("Favor informar o cpf: ");
                        cpf = entrada.nextLong();
                        consultar(cpf);
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
                        inserirPS(cpf, nome, email);
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
                        alterar(cpf, nome, email);
                        break;
                    }
                    case 5:{
                        System.out.println("[5] Excluir um Cliente");
                        System.out.println("Favor informar o cpf: ");
                        cpf = entrada.nextLong();
                        excluir(cpf);
                        break;
                        
                    }
                    case 6:{
                        System.out.println("Encerrando o Sistema...");
                        break;
                    }
                }

            }
            entrada.close();
        } catch (Exception e) {
            e.getStackTrace();
        }

        
    }
}
