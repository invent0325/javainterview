package computers;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Dimensions {
    private int width;
    private int height;
    private int depth;

    public Dimensions(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
}
