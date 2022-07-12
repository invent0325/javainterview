public class mainConsClass {
    public static void main(String[] args) {

        ConsClass cc = new ConsClass() {
            @Override
            void sayHello() {
                System.out.println("hello abstract");
            }

            @Override
            void sayMorning() {
                System.out.println("Morning Message");
            }
        };
        ConsClassCheck cc1 = new ConsClassCheck();

        System.out.println(cc);

        cc.sayHello();
        cc1.sayHello();
        cc.sayMorning();
        cc1.sayMorning();
    }
}
