import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCCreateTableDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection= DriverManager.getConnection(
              "jdbc:mysql://localHost:3306/student","root","RAU@kr#123$**"
            );

            Statement statement= connection.createStatement();
            String query="CREATE Table std1( stdName varchar(20) primary key, stdId int , stdRollNum int )";
            statement.executeUpdate(query);
            System.out.println("Create Table in Student Database");

        }
        catch (Exception s) {
            s.printStackTrace();
        }
    }
}
