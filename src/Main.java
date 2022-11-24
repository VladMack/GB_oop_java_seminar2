import Classes.Zoo;

public class Main {
    public static void main(String[] args) {
        Zoo zoopark = new Zoo();
        System.out.println("Speek:");
        zoopark.animalsTalk();
        System.out.println("\nRun:");
        zoopark.run();
        System.out.println("\nFly:");
        zoopark.fly();
        System.out.println("\nSwim:");
        zoopark.swim();
    }
}