package Classes;

import Interfaces.Speakable;
import Interfaces.Flyable;
import Interfaces.Runable;
import Interfaces.Swimable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zoo {
    private List<Animal> animals;

    public Zoo() {
        animals = new ArrayList<>(Arrays.asList(
                new Cat("Barsik", "scottland", "brown", 3, 12),
                new Dog("Sharik", "staff", "black", 4, 5),
                new Fish("Salmon", "salmon", "red", 0, 1),
                new Duck("Donald", "wild", "yellow", 2, 2),
                new Pinguin("Yasha", "king", "black-white", 2, 3)));
    }

    public void animalsTalk() {
        for (Speakable an : getSpeakable()) {
            System.out.format("%s\n", an.speak());
        }
    }

    public List<Speakable> getSpeakable() {
        List<Speakable> result = new ArrayList<>();
        for (Animal an : animals) {
            if (an instanceof Speakable) {
                result.add((Speakable)an);
            }
        }
        result.add(new Radio());
        return result;
    }

    public List<Flyable> getFlyable() {
        List<Flyable> result = new ArrayList<>();
        for (Animal an : animals) {
            if (an instanceof Flyable) {
                result.add((Flyable)an);
            }
        }
        return result;
    }

    public List<Runable> getRunable() {
        List<Runable> result = new ArrayList<>();
        for (Animal an : animals) {
            if (an instanceof Runable) {
                result.add((Runable)an);
            }
        }
        return result;
    }

    public void fly() {
        for (Flyable an : getFlyable()) {
            System.out.format("%s: %s\n", an.toString(), an.flySpeed());
        }
    }

    public void run() {
        for (Runable an : getRunable()) {
            System.out.format("%s: %s\n", an.toString(), an.runSpeed());
        }
    }

    public List<Swimable> getSwimable() {
        List<Swimable> result = new ArrayList<>();
        for (Animal an : animals) {
            if (an instanceof Swimable) {
                result.add((Swimable)an);
            }
        }
        return result;
    }

    public void swim() {
        for (Swimable an : getSwimable()) {
            System.out.format("%s: %s\n", an.toString(), an.swimSpeed());
        }
    }
}
