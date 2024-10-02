public class Driver implements Prototype<Driver> {
    private String name;
    private String carModel;
    private String carMake;
    private String age;
    private String experience;

    public Driver(String name, String carModel) {
        this.name = name;
        this.carModel = carModel;
    }

    public Driver(String name, String carModel, String carMake) {
        this.name = name;
        this.carModel = carModel;
        this.carMake = carMake;
    }

    public Driver(String name, String carModel, String carMake, String age) {
        this.name = name;
        this.carModel = carModel;
        this.carMake = carMake;
        this.age = age;

    }


    //допишите код

    @Override
    public Driver clone() {
        Driver newDriver = new Driver(name, carModel, carMake, age);
        newDriver.experience = this.experience;
        return newDriver;
    }
}
