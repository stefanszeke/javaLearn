
class VehicleDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle(7,16,21);
        Vehicle sportscar = new Vehicle(2,14,12);
        Vehicle sameMinivan = minivan;

        System.out.println("Minivan can carry " + minivan.passengers + ". Range is: " + minivan.range());
        System.out.println("Sportscar can carry " + sportscar.passengers + ". Range is: " + sportscar.range());

        System.out.println("for 1000 miles the minivan needs " + String.format("%.2f", minivan.fuelNeeded(1000)) + " gallons of fuel");

        System.out.println("Minivan and sportscar are the same object: " + (minivan == sportscar));
        System.out.println("Minivan and sameMinivan are the same object: " + (minivan == sameMinivan));
        System.out.println("sameMinivan passengers: " + sameMinivan.passengers);
    }
}


class Vehicle {
    int passengers;
    int fuelCapacity;
    int mpg;

    Vehicle(int passengers, int fuelCapacity, int mpg) {
        this.passengers = passengers;
        this.fuelCapacity = fuelCapacity;
        this.mpg = mpg;
    }

    int range() {
        return fuelCapacity * mpg;
    }

    double fuelNeeded(int miles) {
        return (double) miles / mpg;
    }

}
