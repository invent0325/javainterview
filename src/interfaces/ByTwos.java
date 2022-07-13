package interfaces;

public class ByTwos implements Series1, Series2 {

    int value;
    int threeVal;

    public ByTwos() {
    }

    @Override
    public int getNext() {
        value = value + 2;
        return value;
    }

    @Override
    public int getNextThree() {
        threeVal = threeVal + 3;
        return threeVal;
    }
}
