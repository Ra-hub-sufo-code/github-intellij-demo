import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCInsertDataInStd1 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection= DriverManager.getConnection(
                    "jdbc:mysql://localHost:3306/student","root","RAU@kr#123$**"
            );

            Statement statement= connection.createStatement();

            String query2="insert into std1 values('Beauty',2,234) ";
            statement.executeUpdate(query2);
            System.out.println("Insert data in Student Database");
        }
        catch (Exception s) {
            s.printStackTrace();
        }
    }
}
