package org.campus02.stack;

public class OrderManagmentSystemApp {

    public static void main(String[] args) {

        Stack cards = new Stack(new int[8]);

        cards.stack(5);
        cards.stack(3);
        cards.stack(9);

        System.out.println("cards.unstack() = " + cards.unstack());
        System.out.println("cards.unstack() = " + cards.unstack());
        cards.stack(4);
        System.out.println("cards.unstack() = " + cards.unstack());
        System.out.println("cards.unstack() = " + cards.unstack());
        System.out.println("cards.unstack() = " + cards.unstack());


        StringStack stringStack = new StringStack(new String[5]);
        stringStack.stack("Waschmaschine 1");
        stringStack.stack("Waschmaschine 2");
        System.out.println("stringStack.unstack() = " + stringStack.unstack());


    }

}
