import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectPreparedStatement {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection= DriverManager.getConnection(
                    "jdbc:mysql://localHost:3306/student","root","RAU@kr#123$**"
            );

            String query ="SELECT * FROM Person";
            PreparedStatement pre=connection.prepareStatement(query);

            ResultSet rs= pre.executeQuery();
            while (rs.next()){
                System.out.println(rs.getInt("personId")+" | "+
                                    rs.getInt("age")+" | "+
                                    rs.getString("firstName")+" | "+
                                    rs.getString("lastName"));
            }
            connection.close();

        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
