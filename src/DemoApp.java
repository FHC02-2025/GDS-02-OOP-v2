public class DemoApp {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Car golf8 = new Car(); // Schlüsselwort new => macht aus Klasse ein KONKRETES Objekt
        golf8.init("ABC123", "red", 0, 2025, true, false);
        golf8.setCarType("Benzin");

        //golf8.identificationNumber = "ABC123";
        //golf8.colour = "red";
        //golf8.isSeatHeatingOn = false;
        //golf8.hasSeatHeating = true;
        //golf8.carType = "Benzin";
        //golf8.productionYear = 2025;
        //golf8.speed = 0;
        // .Operator => Zugriff auf inneren Zustand / Funktionen von der Klasse

        Car porsche = new Car();
        porsche.init("Speed911", "black", 0, 2025, true, false);
        porsche.setCarType("Elektro");

        /*porsche.identificationNumber = "SPEED911";
        porsche.colour = "black";
        porsche.hasSeatHeating = true;
        porsche.isSeatHeatingOn = false;
        //porsche.carType = "Electro";

        porsche.setCarType("Warp-Antrieb");
        //porsche.carType = "Warp-Antrieb";
        porsche.productionYear = 2024;
        porsche.speed = 0;*/

        golf8.printFactSheet();
        porsche.printFactSheet();
    }

    public static void print(Car car) {

        System.out.println("car.identificationNumber = " + car.getIdentificationNumber());
        System.out.println("car.carType = " + car.getCarType());
        System.out.println("car.colour = " + car.getColour());
        System.out.println("car.hasSeatHeating = " + car.getHasSeatHeating());
        System.out.println("car.productionYear = " + car.getProductionYear());
        System.out.println("car.speed = " + car.getSpeed());
        System.out.println("car.isSeatHeatingOn = " + car.isSeatHeatingOn());
        System.out.println("======================");
    }
}
