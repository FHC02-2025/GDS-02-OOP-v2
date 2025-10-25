package org.campus02.stack;

public class StringStack {

    private String[] storage;
    private int currentPosition;

    public StringStack (String[] storage) {
        this.storage = storage;
        currentPosition = 0;
    }

    public void stack(String element) {
        if (currentPosition < storage.length) {
            storage[currentPosition] = element;
            currentPosition++;
        }
    }

    public String unstack(){
        if (currentPosition > 0) {
            currentPosition--;
            String element = storage[currentPosition];
            return element;
        }
        return null;
    }



}
