package _02_Generics_Store;

import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public abstract class Food {
    String item;

    public abstract JLabel getFood();

    @SuppressWarnings("rawtypes")
    public static ImageIcon loadImage(String fileName) {
        try {
            return new ImageIcon(ImageIO
                    .read(new Cart().getClass().getResourceAsStream("images/"+fileName)));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
