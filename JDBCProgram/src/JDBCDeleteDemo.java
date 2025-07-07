import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCDeleteDemo {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection= DriverManager.getConnection(
              "jdbc:mysql://localHost:3306/student",
              "root","RAU@kr#123$**"
            );

            Statement statement= connection.createStatement();
            String query="DELETE From person where personId=3";
            statement.executeUpdate(query);
            System.out.println("Delete data");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
