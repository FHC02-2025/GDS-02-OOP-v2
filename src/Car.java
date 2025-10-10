import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Car {
    // body
    public String identificationNumber;
    public String colour; // vordefinierte Werte? red/black/green
    public int speed;
    public int productionYear;
    public boolean hasSeatHeating;
    public boolean isSeatHeatingOn;
    public String carType; // Tippfehler, wir bräuchten was bessers, jeder kann alles Reinschreiben


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
}
