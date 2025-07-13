package Entity;

import java.util.List;

public class Invoice {
    private int id;
    private int customerId;
    private int vehicleId;
    private int servicesId;

    public Invoice(int id,int customerId, int vehicleId, int servicesId) {
        this.id=id;
        this.customerId = customerId;
        this.vehicleId = vehicleId;
        this.servicesId = servicesId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public int getServicesId() {
        return servicesId;
    }

    /*public void setServicesId(int servicesId) {
        this.servicesId = servicesId;
    }
*/
    @Override
    public String toString() {
        return "Invoice [" +
                "id=" + id +
                ", customerId=" + customerId +
                ", vehicleId=" + vehicleId +
                ", servicesId=" + servicesId + "]";
    }
}
