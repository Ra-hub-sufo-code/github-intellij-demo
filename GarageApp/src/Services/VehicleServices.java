package Services;

import Configaration.DbConfig;
import Entity.Customer;
import Entity.Invoice;
import Entity.Vehicle;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class VehicleServices {

    public void addCustomerWithVehicle(String model,String numPlate) throws SQLException
    {
        //Vehicle vehicle=new Vehicle(customerId,model,numPlate);
        Connection con= DbConfig.getConnection();
        PreparedStatement preSta=
                con.prepareStatement("INSERT INTO vehicles(number_plate,model) VALUES (?,?)");
        preSta.setString(2,model);
        preSta.setString(1,model);
        preSta.executeUpdate();
        preSta.close();
        preSta.close();
    }

    public List<Vehicle> getAllVehicle() throws SQLException{
        List<Vehicle> list = new ArrayList<>();
        Connection con= DbConfig.getConnection();
        Statement st=con.createStatement();
        ResultSet rs= st.executeQuery("Select * from vehicles");
        while (rs.next()) {
            list.add(new Vehicle(rs.getInt("id"),
                    rs.getInt("customer_id"),
                    rs.getString("number_plate"),
                    rs.getString("model")));
        }
        return list;
    }

    public Customer getCustomerBaseOnNum(String number) throws SQLException{
        Customer customer=new Customer();
        Connection con= DbConfig.getConnection();
        Statement st=con.createStatement();
        ResultSet rs= st.executeQuery("Select * from customers where phone= "+number);
        while (rs.next()) {
            customer=new Customer(rs.getInt("id"),
                    rs.getString("name"),rs.getString("phone"));
        }
        return customer;
    }



}
