package org.campus02.fraction;

public class FractionDemoApp {

    public static void main(String[] args) {
        
        Fraction f1 = new Fraction(3, 5);
        
        f1.print();
        System.out.println("f1.toDecimal() = " + f1.toDecimal());

        Fraction f2 = new Fraction(4, 7);

        Fraction result = f1.multiplicate(f2);
        result.print();

        System.out.println("Fraction.getCOUNTER() = " + Fraction.getCOUNTER());
        
    }
}
