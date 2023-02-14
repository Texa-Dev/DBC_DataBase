package pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbManager {
    public static String DB_NAME = "users";
    private final String url;
        private Connection connection;
        private Statement statement;
    public DbManager(String url) {
        this.url = url;
    }

    public void Connect(String login, String password) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
       connection= DriverManager.getConnection(url);
       statement=connection.createStatement();
    }

    public void Close() throws SQLException {
        statement.close();;
        connection.close();
    }
}
