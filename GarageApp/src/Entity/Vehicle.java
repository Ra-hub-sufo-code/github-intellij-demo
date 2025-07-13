package Entity;

public class Vehicle {
    private int id;
    private int customerId;
    private String model;
    private String numberPlate;

    public Vehicle() {}

    public Vehicle(int customerId, String model, String numberPlate) {

        this.customerId = customerId;
        this.model = model;
        this.numberPlate = numberPlate;
    }

    public Vehicle(int id,int customerId, String model, String numberPlate){
        this(customerId,model,numberPlate);
        this.id = id;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Vehicle [" +
                "id=" + id +
                ", customerId=" + customerId +
                ", model='" + model +
                ", numberPlate='" + numberPlate +
                "]";
    }
}
