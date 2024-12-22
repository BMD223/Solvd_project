public class ComplexEnums {
    public static void main(String[] args) {
        for (Day day : Day.values()) {
            System.out.println(day.getDisplayName() + ": " + day.getDescription());
        }
        for (Directions direction : Directions.values()) {
            direction.whereAmIHeading();
        }
        for (Planet planet : Planet.values()) {
            System.out.printf("Planet: %s, Mass: %f, Radius: %f%n", planet, planet.getMass(), planet.getRadius());
        }
        for (Currency currency : Currency.values()) {
            System.out.printf("Currency: %s, Symbol: %s, Country: %s%n", currency, currency.getSymbol(), currency.getCountry());
        }
        for (VehicleType vehicle : VehicleType.values()) {
            System.out.printf("Vehicle: %s, Wheels: %d, Max Speed: %d%n", vehicle, vehicle.getWheels(), vehicle.getMaxSpeed());
        }
    }

    enum Day {
        MONDAY("Monday", "Start of the work week"),
        TUESDAY("Tuesday", "Second day of the work week"),
        WEDNESDAY("Wednesday", "Midweek"),
        THURSDAY("Thursday", "Almost the weekend"),
        FRIDAY("Friday", "End of the work week"),
        SATURDAY("Saturday", "Weekend!"),
        SUNDAY("Sunday", "Rest day");

        private final String displayName;
        private final String description;

        Day(String displayName, String description) {
            this.displayName = displayName;
            this.description = description;
        }

        public String getDisplayName() {
            return displayName;
        }

        public String getDescription() {
            return description;
        }
    }

    enum Directions{
        SOUTH("South", 1, 0),
        NORTH("North", -1, 0),
        EAST("East", 0, 1),
        WEST("West", 0, -1);

        private final String destination;
        private final int vertical;
        private final int horizontal;

        Directions(String destination, int vertical, int horizontal) {
            this.destination = destination;
            this.vertical = vertical;
            this.horizontal = horizontal;
        }

        public void whereAmIHeading() {
            System.out.printf("You are going: %s, your position will be offset by %d, %d%n", destination, vertical, horizontal);;
        }
    }

    enum Planet {
        MERCURY(3.303e+23, 2.4397e6),
        VENUS(4.869e+24, 6.0518e6),
        EARTH(5.976e+24, 6.37814e6),
        MARS(6.421e+23, 3.3972e6),
        JUPITER(1.9e+27, 7.1492e7),
        SATURN(5.688e+26, 6.0268e7),
        URANUS(8.686e+25, 2.5559e7),
        NEPTUNE(1.024e+26, 2.4746e7);

        private final double mass;   // in kilograms
        private final double radius; // in meters

        Planet(double mass, double radius) {
            this.mass = mass;
            this.radius = radius;
        }

        public double getMass() {
            return mass;
        }

        public double getRadius() {
            return radius;
        }
    }

    enum Currency {
        USD("United States Dollar", "USD", "United States"),
        EUR("Euro", "EUR", "European Union"),
        JPY("Japanese Yen", "YPN", "Japan"),
        GBP("British Pound", "GBP", "United Kingdom"),
        AUD("Australian Dollar", "AUD", "Australia");

        private final String name;
        private final String tag;
        private final String country;

        Currency(String name, String tag, String country) {
            this.name = name;
            this.tag = tag;
            this.country = country;
        }

        public String getName() {
            return name;
        }

        public String getSymbol() {
            return tag;
        }

        public String getCountry() {
            return country;
        }
    }

    enum VehicleType {
        CAR("Car", 4, 200),
        MOTORCYCLE("Motorcycle", 2, 180),
        TRUCK("Truck", 6, 120),
        BICYCLE("Bicycle", 2, 40),
        BUS("Bus", 4, 100);

        private final String type;
        private final int wheels;
        private final int maxSpeed;

        VehicleType(String type, int wheels, int maxSpeed) {
            this.type = type;
            this.wheels = wheels;
            this.maxSpeed = maxSpeed;
        }

        public String getType() {
            return type;
        }

        public int getWheels() {
            return wheels;
        }

        public int getMaxSpeed() {
            return maxSpeed;
        }
    }
}