package computers;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Resolution {
    private int width;
    private int height;

    public Resolution(int width, int height) {
        this.width = width;
        this.height = height;
    }
}
