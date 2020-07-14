package design.batov.carmanager;

public class PassengerCar extends Car {
    public PassengerCar(String name, int yearOfProduction, int prise, int weight, Color color) {
        super(name, yearOfProduction, prise, weight, color);
    }

    @Override
    public boolean idReadeTyService() {
        if (distanceOnService > 10000) {
            return true;
        }
        return false;

    }
}
