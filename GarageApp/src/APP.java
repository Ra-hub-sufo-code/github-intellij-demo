import Entity.Customer;
import Services.BillingServices;
import Services.VehicleServices;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class APP {
    public static void main(String[] args) throws SQLException {
        Scanner sc =new Scanner(System.in);
        BillingServices service=new BillingServices();
        VehicleServices vehicleServices=new VehicleServices();

        while (true)
        {
            System.out.println("1. Add Customer with Vehicle \n2. Generate Invoice\n3. Show Invoice\n4. Exit");
            System.out.print("Enter your choice : ");
            int ch=sc.nextInt();
            switch (ch)
            {
                case 1:
                    System.out.print("Customer name: ");
                    String name = sc.next();
                    System.out.print("phone:");
                    String phone =sc.next();
                    service.customerService.addCustomer(new Customer(name,phone));
                    System.out.print("Enter Vehicle number: ");
                    String VehicleNum=sc.next();
                    System.out.print("Enter Vehicle model: ");
                    String model=sc.next();
                    Customer customersBasesOnNum = service.customerService.getCustomerBaseOnNum(phone);
                    System.out.println("Customer details: "+customersBasesOnNum);
                    vehicleServices.addCustomerWithVehicle(model,VehicleNum);
                    break;

                case 2:
                    System.out.print("Enter customer ID:");
                    int cid=sc.nextInt();
                    System.out.print("Enter vehicle Id:");
                    int vid = sc.nextInt();
                    System.out.println("Enter number of services:");
                    int n = sc.nextInt();
                    /*System.out.println("enter the service id:");
                    int sids=sc.nextInt();*/
                    List<Integer> sids=new ArrayList<>();
                    for (int i=0; i<n; i++){
                        System.out.println("enter the service id:");
                        sids.add(sc.nextInt());
                    }
                    service.createInvoice(cid,vid,sids);
                    break;
                case 3:
                    service.showAllInvoices();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Not a valid choice");
            }
        }
    }
}