import java.sql.Connection;
import java.sql.DriverManager;

public class PreparedStatement {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection= DriverManager.getConnection(
                    "jdbc:mysql://localHost:3306/student","root","RAU@kr#123$**"
            );

            String query="INSERT INTO person(personId,age,firstName,lastName) values(?,?,?,?)";

            java.sql.PreparedStatement pre=connection.prepareStatement(query);

            pre.setInt(1,33);
            pre.setInt(2,23);
            pre.setString(3,"Rajiv");
            pre.setString(4,"Mad");

            pre.executeUpdate();
            System.out.println("Row Updated");

            connection.close();

        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
