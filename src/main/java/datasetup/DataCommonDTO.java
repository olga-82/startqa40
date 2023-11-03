package datasetup;

public class DataCommonDTO {
    UserDTO user;
    CarDTO[] cars;

    public DataCommonDTO() {
    }

    public DataCommonDTO(UserDTO user, CarDTO[] cars) {
        this.user = user;
        this.cars = cars;
    }

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }

    public CarDTO[] getCars() {
        return cars;
    }

    public void setCars(CarDTO[] cars) {
        this.cars = cars;
    }
}

