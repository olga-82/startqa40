package datasetup;

public class CarDTO {
    String model;
    int id;

    public CarDTO() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CarDTO(String model, int id) {
        this.model = model;
        this.id = id;
    }
}
