import org.jetbrains.annotations.Contract;

public class InheritanceClass {
    static String firstName;
    static String lastName;

    @Contract(pure = true)
    public InheritanceClass() {
    }

    @Contract(pure = true)
    InheritanceClass(String firstName, String lastName) {
        InheritanceClass.firstName = firstName;
        InheritanceClass.lastName = lastName;
    }

    public static InheritanceClass createInheritanceClass(String firstName, String lastName) {
        InheritanceClass.firstName = firstName;
        InheritanceClass.lastName = lastName;
        return new InheritanceClass(firstName, lastName);
    }

    void displayName() {
        System.out.println(firstName + lastName);
    }
}
