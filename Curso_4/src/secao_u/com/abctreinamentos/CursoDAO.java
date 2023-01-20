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

public class CursoDAO {
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

    public static void inserir(Curso curso) throws SQLException{
        String sql = "insert into Cliente values ("+curso.getCdcurso()+", '"+curso.getNome()+"', '"+curso.getUrl()+"')";
        Statement statement = conexao.createStatement();
        statement.execute(sql);
        conexao.commit();
        
    }


    public static Curso consultar(int cdCurso) throws SQLException{
        String sql = "select * from Cliente where idCurso="+cdCurso+"";
        Statement statement = conexao.createStatement();
        ResultSet rs = statement.executeQuery(sql);
        Curso curso = null;
        while(rs.next()){
            curso = new Curso(rs.getInt(1), rs.getString(2), rs.getString(3));
        }
        return curso;
    }

    public static List<Curso> consultarTodos() throws SQLException {
        String sql = "select * from Curso";
        Statement statement = conexao.createStatement();
        ResultSet rs = statement.executeQuery(sql);
        List<Curso> cursos = new LinkedList<>();
        while(rs.next()){
            Curso curso = new Curso(rs.getInt(1), rs.getString(2), rs.getString(3));
            cursos.add(curso);
        }
        return cursos;
    }

    public static void alterar(Curso curso) throws SQLException{
        String sql = "update Cliente set nome='"+curso.getNome()+"', url='"+curso.getUrl()+"' where idCurso="+curso.getCdcurso();
        Statement statement = conexao.createStatement();
        statement.executeUpdate(sql);
        conexao.commit();

    }

    public static void excluir(int idCurso) throws SQLException{
        String sql = "delete from Cliente where idCurso="+idCurso+"";
        Statement statement = conexao.createStatement();
        statement.executeUpdate(sql);
        conexao.commit();


    }

    public static void main(String[] args) {
        try {
            conectar();
            Scanner entrada = new Scanner(System.in);
            int opcao = 0;
            int idCurso;
            String nome, url;
            while(opcao != 6){
                System.out.println("Sistema de Gerenciamento de Clientes");
                System.out.println("====================================");
                System.out.println("Digite [1] para consultar Todos Cursos");
                System.out.println("Digite [2] para consultar um Curso específico");
                System.out.println("Digite [3] para Cadastrar um Novo Curso");
                System.out.println("Digite [4] para Alterar um Curso");
                System.out.println("Digite [5] para Excluir um Curso");
                System.out.println("Digite [6] para Sair");
                opcao = entrada.nextInt();

                switch(opcao){
                    case 1:{//Consultar todos
                        System.out.println("[1] Consultar Todos Cursos");
                        List<Curso> cursos = CursoDAO.consultarTodos();
                        cursos.forEach(System.out::println);
                        break;
                    }
                    case 2:{
                        System.out.println("[2] consultar um Curso específico");

                        System.out.println("Favor informar o idCurso: ");
                        idCurso = entrada.nextInt();
                        Curso curso = CursoDAO.consultar(idCurso);
                        System.out.println(curso);
                        break;

                    }
                    case 3:{
                        System.out.println("[3] Cadastrar Novo Curso");
                        System.out.println("Favor informar o idCurso: ");
                        idCurso = entrada.nextInt();
                        entrada.nextLine();//esvasiar o buffer
                        System.out.println("Favor informar o Nome: ");
                        nome = entrada.next();
                        entrada.nextLine();
                        System.out.println("Favor informar o url: ");
                        url = entrada.next();
                        entrada.nextLine();
                        Curso curso = new Curso(idCurso, nome, url);
                        CursoDAO.inserir(curso);
                        break;
                        
                    }
                    case 4:{
                        System.out.println("[4] Alterar um Curso");
                        System.out.println("Favor informar o idCurso: ");
                        idCurso = entrada.nextInt();
                        entrada.nextLine();//esvasiar o buffer
                        System.out.println("Favor informar o Nome: ");
                        nome = entrada.next();
                        entrada.nextLine();
                        System.out.println("Favor informar o url: ");
                        url = entrada.next();
                        entrada.nextLine();
                        Curso curso = new Curso(idCurso, nome, url);
                        CursoDAO.alterar(curso);
                        break;
                    }
                    case 5:{
                        System.out.println("[5] Excluir um Curso");
                        System.out.println("Favor informar o cpf: ");
                        idCurso = entrada.nextInt();
                        ClienteDAO.excluir(idCurso);
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
