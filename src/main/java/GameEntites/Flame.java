package GameEntites;

import javafx.scene.image.Image;

/**
 * Khi bom nổ sẽ tạo ra đối tượng flame này.
 */
public class Flame extends UnmoveEntity {

    public Flame(int x, int y, Image image, Image[] images) {
        super(x, y, image, images);
        MAX_TIME = 30;
    }
}
