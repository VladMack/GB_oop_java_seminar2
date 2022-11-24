package Classes;

import Interfaces.Speakable;
import Interfaces.Runable;
import Interfaces.Swimable;

public class Pinguin extends Animal implements Runable, Swimable, Speakable {
    public Pinguin(String name, String breed, String color, Integer countLegs, Integer age) {
        super(name, breed, color, countLegs, age);
    }


    @Override
    public Double swimSpeed() {
        return 45.0;
    }

    @Override
    public String speak() {
        return "yaaaaa";
    }

    @Override
    public Double runSpeed() {
        return 9.5;
    }
}
