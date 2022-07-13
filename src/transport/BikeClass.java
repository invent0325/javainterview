package transport;

public class BikeClass {
    public static void main(String[] args) {
        Bike b = new Splendor();//upcasting
        b.run();
    }

    static class Bike {
        void run() {
            System.out.println("running");
        }
    }

    static class Splendor extends Bike {
        void run() {
            System.out.println("running safely with 60km");
        }
    }
}