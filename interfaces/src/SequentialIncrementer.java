//Name: Md Kiyum
//Class: Sdev 219
//Program Name: Friday Lab Interfaces
//Program Description: This program uses interfaces and multiple classes to call methods.

import static java.lang.Math.*;

interface Incrementable {
    public void increment();
    public int getValue();
}


class SequentialIncrementer implements Incrementable {
    int firstInstance = 0;
    public void increment() {

        firstInstance++;
    }

    public int getValue() {
        return firstInstance;
    }
}
class RandomIncrementer implements Incrementable {
int value = 10;


    public void increment() {
        value+= (int) (Math.random()*10);
    }

    public int getValue() {
        return value;
    }

}

class Driver {
    public static void main(String[] args) {
        SequentialIncrementer firstCall = new SequentialIncrementer();
        RandomIncrementer secondCall = new RandomIncrementer();

        for (int i = 1; i < 5; i++) {
            firstCall.increment();

        }
        System.out.println(firstCall.getValue());

        for (int j = 1; j < 5; j++) {
            secondCall.increment();

        }
        System.out.println(secondCall.getValue());

    }
}