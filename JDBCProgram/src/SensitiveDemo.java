import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SensitiveDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection= DriverManager.getConnection(
                    "jdbc:mysql://localHost:3306/student","root","RAU@kr#123$**"
            );
            Statement statement=connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            String query="select * from person";
            ResultSet resultSet=statement.executeQuery(query);

            System.out.println("Fetch data in not Live update mode.....");
            Thread.sleep(10000);
            while (resultSet.next()){
                        System.out.println(
                                resultSet.getInt("personId")+" | "+
                                        resultSet.getInt("age")+" | "+
                                        resultSet.getString("firstName")+" | "+
                                        resultSet.getString("lastName")
                        );
            }
            connection.close();

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
