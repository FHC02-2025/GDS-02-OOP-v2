package org.campus02.car;

public class Car {
    // body
    private String identificationNumber;
    private String colour; // vordefinierte Werte? red/black/green
    private int speed;
    private int productionYear;
    private boolean hasSeatHeating;
    private boolean isSeatHeatingOn;
    private String carType; // Tippfehler, wir bräuchten was bessers, jeder kann alles Reinschreiben

    public String getIdentificationNumber() {
        return identificationNumber;
    }
//
    public String getColour() {
        return colour;
    }

    public int getSpeed() {
        return speed;
    }


    public void accelerate(int speed) {
        this.speed = speed;
    }

    public void accelerate2(){
        speed = speed + 10;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public boolean getHasSeatHeating() {
        return hasSeatHeating;
    }

    public boolean isSeatHeatingOn() {
        return isSeatHeatingOn;
    }

    public void init(String idNumber, String initColour, int initSpeed, int initProductionYear,
                     boolean initHasSeatHeating, boolean initIsSeatHeatingOn) {

        identificationNumber = idNumber;
        colour = initColour;
        speed = initSpeed;
        productionYear = initProductionYear;
        hasSeatHeating = initHasSeatHeating;
        isSeatHeatingOn = initIsSeatHeatingOn;
    }

    public void setCarType(String newCarType) {

        if (newCarType.equals("Benzin")
                || newCarType.equals("Diesel")
                || newCarType.equals("Hybrid")
                || newCarType.equals("Elektro")
                || newCarType.equals("Wasserstoff")
                || newCarType.equals("Gas")
        )  {
            carType = newCarType;
        }
        else {
            System.out.println("CarType: " + newCarType + " nicht erlaubt");
        }
    }


    // methode
    public void printFactSheet (){
        System.out.println("identificationNumber = " + identificationNumber);
        System.out.println("colour = " + colour);
        System.out.println("productionYear = " + productionYear);
        System.out.println("hasSeatHeating = " + hasSeatHeating);
        System.out.println("carType = " + carType);
        System.out.println("isSeatHeatingOn = " + isSeatHeatingOn);
        System.out.println("speed = " + speed);
        System.out.println("=============================");
    }

    public String getCarType() {
        return carType;
    }
}
