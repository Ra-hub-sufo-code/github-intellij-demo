package Services;

import Configaration.DbConfig;
import Entity.Customer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerServices {

    public void addCustomer(Customer customer) throws SQLException {
        Connection con= DbConfig.getConnection();
        PreparedStatement preSta=
                con.prepareStatement("INSERT INTO customers(name,phone) VALUES (?,?)");
        preSta.setString(1,customer.getName());
        preSta.setString(2,customer.getPhone());
        preSta.executeUpdate();
        preSta.close();
        preSta.close();

    }

    public List<Customer> getAllCustomers() throws SQLException{
        List<Customer> list = new ArrayList<>();
        Connection con= DbConfig.getConnection();
        Statement st=con.createStatement();
        ResultSet rs= st.executeQuery("Select * from customers");
        while (rs.next()) {
            list.add(new Customer(rs.getInt("id"),
                    rs.getString("name"),rs.getString("phone")));
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
