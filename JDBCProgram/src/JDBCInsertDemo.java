import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCInsertDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localHost:3306/student",
                     "root","RAU@kr#123$**"
            );

            Statement st=con.createStatement();
            String que="INSERT INTO person(personId,firstName,lastName) values(4,'Abhishek','Kumar')";

            int update= st.executeUpdate(que);
            System.out.println("Insert data: "+update);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
