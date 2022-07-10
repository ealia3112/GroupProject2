package ProjectNo02;

public class Task4 {/*
Create a Class Vehicle that would have the following fields: vehiclePrice and method calculateSalePrice() which
should be returning a price of the Vehicle.
Create 2 subclasses: Sedan and Truck. The Truck class has field as weight and has its own implementation of
calculateSalePrice() method in which returned price calculated as following: if weight>2000 then returned price car
should include 10% discount, otherwise 20% discount. The Sedan class has field as length and also does it is own
implementation of calculateSalePrice(): if length of sedan is >20 feet then returned car price should include 5% discount,
otherwise 10% discount
     */
}

class Vehicle {

    double vehiclePrice;

    double calculateSalePrice() {
        return vehiclePrice;
    }
}

class Sedan extends Vehicle {
    double length;

    Sedan(double length, double vehiclePrice) {
        this.vehiclePrice = vehiclePrice;
        this.length = length;
    }

    @Override
    double calculateSalePrice() {
        double discount;
        if (length > 20) {
            discount = vehiclePrice * 0.05;


        } else {
            discount = vehiclePrice * 0.1;


        }
        return vehiclePrice - discount;
    }


}

class Truck extends Vehicle {
    double weight;

    Truck(double weight, double vehiclePrice) {
        this.vehiclePrice = vehiclePrice;
        this.weight = weight;
    }
    @Override
    double calculateSalePrice() {
        double discount;
        if (weight > 2000) {
            discount = vehiclePrice * 0.1;

        } else {
            discount = vehiclePrice * 0.2;
        }
        return vehiclePrice - discount;


    }
}

class VehicleTester {
    public static void main(String[] args) {
        Vehicle[] vehicles = {new Sedan(15.2, 37000), new Truck(5000.0, 5600)};
        for (Vehicle vehicle : vehicles) {
            System.out.println("Price with discount for this type of vehicle will be " + vehicle.calculateSalePrice());
        }




    }
}