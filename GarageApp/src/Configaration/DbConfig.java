package Configaration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConfig {
    private static final String URL="jdbc:mysql://localHost:3306/garage";
    private static final String USER="root";
    private static final String PASS="RAU@kr#123$**";

    public static Connection getConnection() throws SQLException {
        /*try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/
        return  DriverManager.getConnection(URL,USER,PASS);
    }
}
