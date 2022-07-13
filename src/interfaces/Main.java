package interfaces;

public class Main {
    public static void main(String[] args) {
        ByTwos bt = new ByTwos();
        ByThree br = new ByThree();


        for(int i = 0; i < 5; i++) {
            System.out.println(bt.getNext());
        }

        for(int i = 0; i < 5; i++) {
            System.out.println(bt.getNextThree());
        }



        for(int x = 0; x < 5; x++) {
            System.out.println(br.getNextThree());
        }

    }
}
