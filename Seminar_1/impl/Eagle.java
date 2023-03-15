package Seminar_1.impl;

import Seminar_1.Animal;
import Seminar_1.Flyable;
import Seminar_1.Illable;

public class Eagle extends Animal implements Flyable, Illable {
    @Override
    public void speak() {

    }

    @Override
    public void hunt() {

    }

    @Override
    public int getFlightSpeed() {
        return 100;
    }

    @Override
    public void getIll() {

    }
}
