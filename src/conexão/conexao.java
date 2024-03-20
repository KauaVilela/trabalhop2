package conexão;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * conexao
 */
public class conexao {
    private static final String url = "jdbc:mysql://localhost:3306/trabalho";
    private static final String username = "root";
    private static final String password = "root";
    private static Connection conn;
    public static Connection getConexao(){
        try {
            if (conn == null) {
                conn = DriverManager.getConnection(url, username, password);
                return conn;
            } else {
                return conn;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    
}