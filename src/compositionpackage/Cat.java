package compositionpackage;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cat {
    String catName;

    public Cat(String catName) {
        this.catName = catName;
    }
}
