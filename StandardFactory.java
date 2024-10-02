public class StandardFactory extends Factory {
    // Допишите код
     public Taxi createTaxi(String name, String license) {
        return new StandardTaxi(new StandardDriver(name), license);
    }
}
