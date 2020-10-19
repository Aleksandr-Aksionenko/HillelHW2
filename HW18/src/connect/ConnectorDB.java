package connect;

import java.sql.*;
import java.util.Properties;

public class ConnectorDB {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/film";
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "root");
        properties.setProperty("useSSL", "false");
        return DriverManager.getConnection(url, properties);
    }
}