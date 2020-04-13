

package persistencia;
import java.sql.*;

public class Dao {
    
    protected Connection con;
    protected PreparedStatement stmt;
    protected ResultSet rs;
    
    private static final String URL = "jdbc:mysql://localhost:3306/empresa";
    private static final String USERNAME = "doug";
    private static final String PASSWORD = "123456";
    
    public void abrirConexao()throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
    }
    
    public void fecharConexao(){
        try {con.close();} catch (Exception e) {}
    }
    
}
