package Services;

import Configaration.DbConfig;
import Entity.Customer;
import Entity.Invoice;
import Entity.Vehicle;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class InvoiceServices {

    //Customer customer =new Customer();
    public void addInvoice(Invoice invoice) throws SQLException {
        Connection conn = DbConfig.getConnection();
        PreparedStatement ps =
                conn.prepareStatement("INSERT INTO invoice(customer_id,vehicles_id,services_id) values(?,?,?)");
        ps.setInt(1, invoice.getCustomerId());
        ps.setInt(2, invoice.getVehicleId());
            ps.setInt(3, invoice.getServicesId());
        ps.executeUpdate();
        ps.close();
        conn.close();
    }

    public List<Invoice> getAllInvoices() throws SQLException {
        List<Invoice> list = new ArrayList<>();
        Connection conn = DbConfig.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("SELECT * from invoice");
        while (rs.next()) {
            list.add(new Invoice(rs.getInt("id"),
                    rs.getInt("customer_id"),
                    rs.getInt("vehicles_id"), rs.getInt("services_id")));
        }
        return list;
    }
}
