import javax.imageio.ImageIO;
import java.io.File;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class ImageProcessor {
    public static void main(String[] args) {
        Photo_color photo = new Photo_color();
        photo.effect_1("C:\\Users\\Mariam\\IdeaProjects\\ImageProcessor\\src\\katana.jpg");
        photo.effect_2("C:\\Users\\Mariam\\IdeaProjects\\ImageProcessor\\src\\my.jpg");
       // photo.effect_3("C:\\Users\\Mariam\\IdeaProjects\\ImageProcessor\\src\\my.jpg");
        photo.effect_3("C:\\Users\\Mariam\\IdeaProjects\\ImageProcessor\\src\\2.jpg");


    }
}