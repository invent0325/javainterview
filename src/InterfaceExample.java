interface MyInferface {
    int num = 100;

    void display();
}

public class InterfaceExample implements MyInferface {

    @Override
    public void display() {
        System.out.println("This is the implementation of the display method");
    }

    public void show() {
        System.out.println("This is the implementation of the show method");
    }

    public static void main(String[] args) {
        InterfaceExample obj = new InterfaceExample();
        obj.display();
        obj.show();
        System.out.println(obj.num);
    }
}
