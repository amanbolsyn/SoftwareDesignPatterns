public class PremiumFactory extends Factory {
    // Допишите код
        public Taxi createTaxi(String name, String license) {
        return new PremiumTaxi(new PremiumDriver(name), license);
    }
}
