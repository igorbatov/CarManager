package design.batov.carmanager;


public abstract class Car implements Serviceble {

    String name;
    int yearOfProduction;
    int prise;
    int weight;
    Color color;
    private int distance = 0;
    protected int distanceOnService = 0;

    public Car(String name, int yearOfProduction, int prise, int weight, Color color) {
        this.name = name;
        this.yearOfProduction = yearOfProduction;
        this.prise = prise;
        this.weight = weight;
        this.color = color;
    }

    public void addDistance(int additionalDistance){
        distance += additionalDistance;
        distanceOnService += additionalDistance;
    }
    public void addDistance(double additionalDistance){
        distance += additionalDistance;
        distanceOnService += additionalDistance;
    }

    public int getDistance() {
        return distance;
    }

    public int getDistanceOnService() {
        return distanceOnService;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", prise=" + prise +
                ", weight=" + weight +
                ", color=" + color +
                ", distance=" + distance +
                ", distanceOnService=" + distanceOnService +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (yearOfProduction != car.yearOfProduction) return false;
        if (prise != car.prise) return false;
        if (weight != car.weight) return false;
        if (distance != car.distance) return false;
        if (name != null ? !name.equals(car.name) : car.name != null) return false;
        return color == car.color;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + yearOfProduction;
        result = 31 * result + prise;
        result = 31 * result + weight;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + distance;
        return result;
    }
}