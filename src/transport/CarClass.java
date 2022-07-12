package transport;

public class CarClass extends EngineClass {

    private String color;
    private int noOfTyres;
    private EngineClass engine;
    //getter setter methods


    public CarClass(String color, int noOfTyres, EngineClass engine) {
        this.color = color;
        this.noOfTyres = noOfTyres;
        this.engine = engine;
    }

    public CarClass(String red, int noOfTyres, String v8, String chevvy, String s) {
        super();
    }
}
