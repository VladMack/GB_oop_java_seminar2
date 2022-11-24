package Classes;

import Interfaces.Speakable;
import Interfaces.Flyable;
import Interfaces.Runable;
import Interfaces.Swimable;

public class Duck extends Animal implements Speakable, Flyable, Runable, Swimable {
    public Duck(String name, String breed, String color, Integer countLegs, Integer age) {
        super(name, breed, color, countLegs, age);
    }

    @Override
    public String speak() {
        return "krya";
    }

    @Override
    public Double flySpeed() {
        return 105.0;
    }

    @Override
    public Double runSpeed() {
        return 10.0;
    }

    @Override
    public Double swimSpeed() {
        return 15.0;
    }
}
