package general;

import java.util.Arrays;
import java.util.HashSet;

public class ClassLoader {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.sayHi();

        System.out.println(HashSet.class.getClassLoader());
        System.out.println(Employee.class.getClassLoader());
        System.out.println(Employee.class.componentType());
        System.out.println(Employee.class.getAnnotatedSuperclass());
        System.out.println(Arrays.toString(Employee.class.getConstructors()));
        System.out.println(Arrays.toString(Employee.class.getDeclaredMethods()));
        System.out.println(Arrays.toString(Employee.class.getDeclaredFields()));
    }

    public static class Employee {
        public void sayHi() {
            String name = "James";
            System.out.println("Hello " + name);
        }
    }
}
