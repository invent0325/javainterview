package computers;

public class MainPC {

    Dimensions dimensions = new Dimensions(20, 20, 5);

    Case theCase = new Case("220B", "Dell", "240", dimensions);
    Monitor theMonitor = new Monitor("27 Inch Beast", "Acer", 27, new Resolution(2540, 1440));
    Motherboard theMotherboard = new Motherboard("BJ-200", "Acer", 4, 6, "v2.44");

    PersonalComputer thePC1 = new PersonalComputer(theCase, theMonitor, theMotherboard);

}
