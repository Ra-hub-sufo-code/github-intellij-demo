import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCDropDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection= DriverManager.getConnection(
                    "jdbc:mysql://localHost:3306/student","root","RAU@kr#123$**"
            );
            Statement statement=connection.createStatement();
            String query="DROP TABLE std2";
            statement.executeUpdate(query);

            System.out.println("Drop Table successfully...");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
