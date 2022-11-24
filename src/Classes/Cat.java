package Classes;

import Interfaces.Speakable;
import Interfaces.Runable;

public class Cat extends Animal implements Speakable, Runable {

    public Cat(String name, String breed, String color, Integer countLegs, Integer age) {
        super(name, breed, color, countLegs, age);
    }

    @Override
    public String speak() {
        return "meow";
    }

    @Override
    public Double runSpeed() {
        return 45.5;
    }
}
