public class DemoApp {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Car golf8 = new Car(); // Schlüsselwort new => macht aus Klasse ein KONKRETES Objekt
        golf8.identificationNumber = "ABC123";
        golf8.colour = "red";
        golf8.isSeatHeatingOn = false;
        golf8.hasSeatHeating = true;
        golf8.carType = "Benzin";
        golf8.productionYear = 2025;
        golf8.speed = 0;
        // .Operator => Zugriff auf inneren Zustand / Funktionen von der Klasse

        Car porsche = new Car();
        porsche.identificationNumber = "SPEED911";
        porsche.colour = "black";
        porsche.hasSeatHeating = true;
        porsche.isSeatHeatingOn = false;
        porsche.carType = "Electro";
        porsche.productionYear = 2024;
        porsche.speed = 0;

        golf8.printFactSheet();
        porsche.printFactSheet();
    }

    public static void print(Car car) {
        System.out.println("car.identificationNumber = " + car.identificationNumber);
        System.out.println("car.carType = " + car.carType);
        System.out.println("car.colour = " + car.colour);
        System.out.println("car.hasSeatHeating = " + car.hasSeatHeating);
        System.out.println("car.productionYear = " + car.productionYear);
        System.out.println("car.speed = " + car.speed);
        System.out.println("car.isSeatHeatingOn = " + car.isSeatHeatingOn);
        System.out.println("======================");
    }
}
