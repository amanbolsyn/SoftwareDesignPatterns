public class PremiumTaxiFactory extends Factory {
    // Допишите код
    public Taxi createTaxi(String name, String license) {
        return new PremiumTaxi(name, license);
    }
}
