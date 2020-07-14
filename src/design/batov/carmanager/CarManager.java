package design.batov.carmanager;


public class CarManager {

    public static void main(String[] args) {

        PassengerCar prius = new PassengerCar("Toyota Prius",2008,1200,15000,Color.GREEN);

        Bus renault = new Bus("Renault Laguna",2000,1600,9700,Color.WHITE);

        Car renault2 = new Bus("Renault Laguna",2000,1600,9700,Color.WHITE);

        prius.addDistance(15000.23);
        renault.addDistance(15000.23);


        System.out.println(prius);
        System.out.println(renault);
        System.out.println(prius.idReadeTyService());
        System.out.println(renault.idReadeTyService());
    }

}
