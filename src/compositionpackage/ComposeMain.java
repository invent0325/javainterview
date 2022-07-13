package compositionpackage;

public class ComposeMain {

    public static void main(String[] args) {

        Dog dog = new Dog("Fluffy");
        Cat cat = new Cat("Mitty");

        Pet pet = new Pet(true);

        Person per1 = new Person("Jill");
        Person per2 = new Person("Maya");
    }
}
