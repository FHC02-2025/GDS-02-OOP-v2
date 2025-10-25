package org.campus02.fraction;

public class Fraction {

    private int nominator; // Zähler
    private int denominator;  // Nenner

    // ALT + Einfügen
    public Fraction(int nominator, int denominator) {
        this.nominator = nominator;
        this.denominator = denominator;
    }

    public void print() {
        System.out.println(nominator + " / " + denominator);
    }

    public double toDecimal() {
        return nominator / (1.0 * denominator);
    }

    public Fraction multiplicate(Fraction f2) {
        int newNominator = this.nominator * f2.nominator;
        int newDenomitor = this.denominator * f2.denominator;

        Fraction newFraction = new Fraction(newNominator, newDenomitor);
        return newFraction;
    }

    public Fraction multiplicate(Fraction f2, Fraction f3) {
        return this.multiplicate(f2).multiplicate(f3);
    }

    public int getNominator() {
        return nominator;
    }

    public int getDenominator() {
        return denominator;
    }
}
