package animal;

public class AnimalBehavior {

    private final String hasEyes;

    public AnimalBehavior(String hasEyes) {
        this.hasEyes = hasEyes;
    }

    void walk() {
        System.out.println("walking");
    }

    void eat() {
        System.out.println("eating");
    }

    void sleep() {
        System.out.println("sleeping");
    }
}
