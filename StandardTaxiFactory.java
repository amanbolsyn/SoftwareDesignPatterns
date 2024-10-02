public class StandardTaxiFactory extends Factory {
    // Допишите код
    public Taxi createTaxi(String name, String license) {
        return new StandardTaxi(name, license);
    }
}
