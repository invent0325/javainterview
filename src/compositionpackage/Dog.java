package compositionpackage;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Dog {
    private final String dogName;

    public Dog(String dogName) {
        this.dogName = dogName;
    }
}
