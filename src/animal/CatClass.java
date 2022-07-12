package animal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CatClass extends AnimalBehavior {
    private String catName;
    private int catAge;
    private boolean isHealthy;

    public CatClass(String hasEyes, String catName, int catAge, boolean isHealthy) {
        super(hasEyes);
        this.catName = catName;
        this.catAge = catAge;
        this.isHealthy = isHealthy;
    }
}
