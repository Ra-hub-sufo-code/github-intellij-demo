import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeletePreparedStatement {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection= DriverManager.getConnection(
                    "jdbc:mysql://localHost:3306/student","root","RAU@kr#123$**"
            );

            String query="DELETE FROM Person where personId=?";
            PreparedStatement pre=connection.prepareStatement(query);
            pre.setInt(1,2);

            pre.executeUpdate();
            System.out.println("Delete data....");

            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
