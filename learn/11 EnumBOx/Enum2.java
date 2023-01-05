import java.util.stream.Stream;

public class Enum2 {

    enum Transport {
        CAR(65, 4), TRUCK(55, 2), AIRPLANE(600, 20), TRAIN(70, 80), BOAT(22, 10);

        private int speed;
        private int passengers;

        Transport(int s, int p) {
            speed = s;
            passengers = p;
        }

        int getSpeed() {
            return speed;
        }

        int getPassengers() {
            return passengers;
        }
    }

    public static void main(String[] args) {
        Transport tp;

        for (Transport t : Transport.values()) {
            System.out.println(t + " speed: " + t.getSpeed() + " passengers: " + t.getPassengers());
        }

        System.out.println();
        
        //ordinal() method returns the ordinal of this enumeration constant (its position in its enum declaration, where the initial constant is assigned an ordinal of zero)
        Stream.of(Transport.values()).forEach(t -> {
            System.out.println("index: " + t.ordinal() + " " + t + " speed: " + t.getSpeed() + " passengers: " + t.getPassengers());
        });
        
        // compareTo() method compares this enum with the specified object for order
        System.out.println();
        System.out.println("BOAT compared to CAR: " + Transport.BOAT.compareTo(Transport.CAR));
        System.out.println("CAR compared to BOAT: " +  Transport.CAR.compareTo(Transport.BOAT));

    }
}
