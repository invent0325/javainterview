public class MethodOverload {
    public static void main(String[] args) {
        MethodOverload.overLoadCheck("James", "Carter");
        MethodOverload.overLoadCheck("James", "Carter", "Dallas");
        MethodOverloadV2.display();
        MethodOverloadV2.overLoadCheck("Dane", "Cane");
        MethodOverloadV2.overLoadCheck("Dane", "Cane", "Los Angeles");
    }

    public static void overLoadCheck(String fname, String lname) {
        System.out.println(fname + lname);
    }

    public static void overLoadCheck(String fname, String lname, String location) {
        System.out.println(fname + lname + location);
    }
}
