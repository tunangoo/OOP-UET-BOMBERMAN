package GameEntites;

import javafx.scene.image.Image;

/**
 * BombItem Thông thường, nếu không có đối tượng Bomb nào đang trong trạng thái kích hoạt,
 * Bomber sẽ được đặt và kích hoạt duy nhất một đối tượng Bomb.
 * Item này giúp tăng số lượng Bomb có thể đặt thêm một.
 */
public class BombItem extends Item {
    public BombItem(int x, int y, Image image) {
        super(x, y, image);
    }
}
