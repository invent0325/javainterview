package computers;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Case {
    private String model;
    private String manufacturer;
    private String powerSupply;
    private Dimensions dimension;

    public Case(String model, String manufacturer, String powerSupply, Dimensions dimension) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimension = dimension;
    }

    public void pressPowerButton() {
        System.out.println("Power Button pressed");
    }
}
