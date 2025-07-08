import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ScrollInsensitive {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection= DriverManager.getConnection(
                    "jdbc:mysql://localHost:3306/student","root","RAU@kr#123$**"
            );
            Statement statement=connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                                                            ResultSet.CONCUR_READ_ONLY);
            String query="select * from std1";
            ResultSet resultSet=statement.executeQuery(query);

            System.out.println("------Scroll insensitive ,read only-----");

            resultSet.last();
            System.out.println("Last Row: "+resultSet.getString("stdName"));
            System.out.println("Last Row: "+resultSet.getInt("stdId"));
            System.out.println("Last Row: "+resultSet.getInt("stdRollNum"));

            resultSet.first();
            System.out.println("First Row: "+resultSet.getString("stdName"));
            System.out.println("First Row: "+resultSet.getInt("stdId"));
            System.out.println("First Row: "+resultSet.getInt("stdRollNum"));

            resultSet.absolute(2);
            System.out.println("Second Row: "+resultSet.getString("stdName"));
            System.out.println("Second Row: "+resultSet.getInt("stdId"));
            System.out.println("Second Row: "+resultSet.getInt("stdRollNum"));

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
