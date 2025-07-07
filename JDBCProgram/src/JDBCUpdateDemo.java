import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCUpdateDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection(
              "jdbc:mysql://localHost:3306/student",
              "root","RAU@kr#123$**"
            );

            Statement st=con.createStatement();
            String query="UPDATE person set firstName='Raushan' where personId=1";
            int up= st.executeUpdate(query);

            System.out.println("Updated First Name: "+up);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
