package Services;

import Entity.Customer;
import Entity.Invoice;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BillingServices {
    public CustomerServices customerService = new CustomerServices();
    public InvoiceServices invoiceService = new InvoiceServices();

    //List<Integer>
    public void createInvoice(int customerId, int vehicleId, List<Integer> serviceIds) throws SQLException {
        for (int sids:serviceIds) {
            invoiceService.addInvoice(new Invoice(0, customerId, vehicleId,sids));
        }
        System.out.println("Invoice generated successfully...");
    }

    public void showAllInvoices() throws SQLException {
        List<Invoice> invoices = invoiceService.getAllInvoices();
        for (Invoice invoice : invoices) {
            System.out.println(invoice);
        }
    }
}
