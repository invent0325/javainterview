package reflection;

import java.lang.reflect.Constructor;
import java.util.Arrays;

public class ReflectionClass {
    public static void main(String[] args) throws NoSuchFieldException {
        //Class dogClass = Dog.class;
        Dog dog = new Dog("Bob", 4);
        Class dogClass1 = dog.getClass();

        System.out.println(dogClass1.isInterface());
        System.out.println(dogClass1.isArray());
        System.out.println("\nConstructors :");
        System.out.println();
        Constructor[] cons = dogClass1.getConstructors();
        for(Constructor c1 : cons) {
            System.out.println(c1.getDeclaringClass());
            System.out.println(c1.getParameterCount());
        }
    }

    public static class Dog {
        private String name;
        private int age;

        public Dog() {
            this.name = "Bob";
            this.age = 2;
        }

        public Dog(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
