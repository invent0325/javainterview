package interfaces;

public class ByThree extends ByTwos implements Series2 {
    int val;

    @Override
    public int getNextThree() {
       val = val + 3;
       return val;
    }
}
