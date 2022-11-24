package Classes;

import Interfaces.Speakable;
import Interfaces.Runable;

public class Dog extends Animal implements Speakable, Runable {
    public Dog(String name, String breed, String color, Integer countLegs, Integer age) {
        super(name, breed, color, countLegs, age);
    }

    @Override
    public String speak() {
        return "auf";
    }

    @Override
    public Double runSpeed() {
        return 14.5;
    }
}
