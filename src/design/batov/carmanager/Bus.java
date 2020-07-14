package design.batov.carmanager;

public class Bus extends Car {
    public Bus(String name, int yearOfProduction, int prise, int weight, Color color) {
        super(name, yearOfProduction, prise, weight, color);
    }

    @Override
    public boolean idReadeTyService() {
        if (distanceOnService > 50000) {
            return true;
        } else {
            return false;
        }
    }
}
