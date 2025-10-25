package org.campus02.stack;

public class Stack {

    private int[] storage;
    private int currentPosition;

    public Stack (int[] storage) {
        this.storage = storage;
        currentPosition = 0;
    }

    public void stack(int number) {
        if (currentPosition < storage.length) {
            storage[currentPosition] = number;
            currentPosition++;
        }
    }

    public int unstack(){
        if (currentPosition > 0) {
            currentPosition--;
            int element = storage[currentPosition];
            return element;
        }
        return -1;
    }

}
