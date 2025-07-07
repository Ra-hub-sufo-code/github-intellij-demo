import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class BDBCDemo {
    public static void main(String[] args) {
         /* 1. load the driver Class
         *  2. Get connection from DataBase
         *  3. create statement
         *  4. execute query
         * */
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student",
                            "root","RAU@kr#123$**");
            Statement statement=con.createStatement();
            String query="select * from Person";

            ResultSet rs =statement.executeQuery(query);
            System.out.println("......Read Data......");
            while (rs.next()){
                System.out.println(
                        rs.getInt("personId")+" | "+
                        rs.getString("firstName")+" | "+
                        rs.getString("lastName")
                );
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
