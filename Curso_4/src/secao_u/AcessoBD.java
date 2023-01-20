package secao_u;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DatabaseMetaData;

//import javax.swing.JOptionPane;

//import com.mysql.cj.jdbc.DatabaseMetaData;
//import com.mysql.cj.protocol.Resultset;
//import com.mysql.cj.xdevapi.Statement;

public class AcessoBD {

    static String url = "jdbc:mysql://localhost:3306/cursojava";
    static String usuario = "wassabi";
    static String senha = "wassabi";
    static Connection conexao;

    public static void conectar() throws SQLException{
        conexao = DriverManager.getConnection(url, usuario, senha);
        conexao.setAutoCommit(false);
    }

    public static void consultarCliente() throws SQLException{
        String consulta = "SELECT * FROM Cliente";
        Statement statement = conexao.createStatement();
        ResultSet rs = statement.executeQuery(consulta);

        while(rs.next()){
            System.out.println("cpf: "+rs.getInt(1)+
            ", nome: "+rs.getString(2)+ ", email: "+rs.getString(3));
           // JOptionPane.showMessageDialog(null, "cpf: "+rs.getInt(1)+
            //" nome: "+rs.getString(2)+ " email"+rs.getString(3));

        }
      
    }

    public static void mostrarMetaInfoBD() throws SQLException{

        DatabaseMetaData meta = conexao.getMetaData();
        String fabricanteBD = meta.getDatabaseProductName();
        String versaoBD = meta.getDatabaseProductVersion();
        //JOptionPane.showMessageDialog(null, fabricanteBD+" <===> "+versaoBD);
        System.out.println(fabricanteBD+" <===> "+versaoBD);
    }



    public static void main(String[] args) {
        try {
            conectar();
            mostrarMetaInfoBD();
            consultarCliente();
            conexao.close();
        } catch (SQLException e) {
            
            e.printStackTrace();
        }


        
    }
    
}
