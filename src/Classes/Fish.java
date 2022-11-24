package Classes;

import Interfaces.Swimable;
public class Fish extends Animal implements Swimable{
    public Fish(String name, String breed, String color, Integer countLegs, Integer age) {
        super(name, breed, color, countLegs, age);
    }

    @Override
    public Double swimSpeed() {
        return 41.2;
    }
}
