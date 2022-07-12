package transport;

public class mainTransport {
    public static void main(String[] args) {

        CarClass c = new CarClass("Red", 4, "V8", "Chevvy", "320BHP");
        System.out.println(c.getEngineType());
        System.out.println(c.getEngineName());
        System.out.println(c.getEnginePower());
    }
}
