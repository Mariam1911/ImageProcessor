import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Photo_color {

       public void effect_1(String link){
            try {

                // Open picture
                File file =new File(link)  ; // new File("C:\\Users\\Mariam\\IdeaProjects\\ImageProcessor\\src\\katana.jpg");
                BufferedImage source = ImageIO.read(file);

                // crate new picture
                BufferedImage result = new BufferedImage(source.getWidth(), source.getHeight(), source.getType());

                // to process every pixel
                for (int x = 0; x < source.getWidth(); x++) {
                    for (int y = 0; y < source.getHeight(); y++) {

                        // Get the color of the current pixel
                        Color color = new Color(source.getRGB(x, y));

                        // We get channels of this color
                        int blue = color.getBlue();
                        int red = color.getRed();
                        int green = color.getGreen();

                        // We use the standard algorithm to obtain a black and white image
                        int grey = (int) (red * 0.299 + green * 0.587 + blue * 0.114);

                        // If you observe, you will notice that for any shade of gray, all channels have
                        //  the same value. So, as with us, the image will also consist of shades of gray
                        //  then, all channels will have the same value.
                        int newRed = grey;
                        int newGreen = grey;
                        int newBlue = grey;

                        //  Create a new color
                        Color newColor = new Color(newRed, newGreen, newBlue);

                        // And set this color to the current pixel of the resulting image
                        result.setRGB(x, y, newColor.getRGB());
                    }
                }
                File output = new File("effect_1.jpg");
                ImageIO.write(result, "jpg", output);


            } catch (IOException e) {

                // When opening and saving files, an unexpected case may occur.
                // And in this case we have try catch
                System.out.println("Файл не найден или не удалось сохранить");
            }
        }

        public void effect_2(String link) {
            try {
                File file = new File(link);
                BufferedImage source = ImageIO.read(file);

                // crate new picture
                BufferedImage result = new BufferedImage(source.getWidth(), source.getHeight(), source.getType());
                for (int x = 0; x < source.getWidth(); x++) {
                    for (int y = 0; y < source.getHeight(); y++) {
                        Color color = new Color(source.getRGB(x, y));
                        int blue = color.getBlue();
                        int red = color.getRed();
                        int green = color.getGreen();
                        int red_new = (int) (red * 0.203 + green * 0.085 + blue * 0.085);
                        int green_new = (int) (red * 0.112 + green * 0.100 + blue * 0.71);
                        int blue_new = (int) (red * 0.47 + green * 0.100 + blue * 0.154);

                        int newRed = red_new;
                        int newGreen = green_new;
                        int newBlue = blue_new;

                        Color newColor = new Color(newRed, newGreen, newBlue);

                        result.setRGB(x, y, newColor.getRGB());

                    }
                }
                File output_red = new File("effect_2.jpg");
                ImageIO.write(result, "jpg", output_red);


            } catch (IOException e) {

                // When opening and saving files, an unexpected case may occur.
                // And in this case we have try catch
                System.out.println("Файл не найден или не удалось сохранить");
            }
        }

    public void effect_3(String link) {
        try {
            File file = new File(link);
            BufferedImage source = ImageIO.read(file);

            // crate new picture
            BufferedImage result = new BufferedImage(source.getWidth(), source.getHeight(), source.getType());
            for (int x = 0; x < source.getWidth(); x++) {
                for (int y = 0; y < source.getHeight(); y++) {
                    Color color = new Color(source.getRGB(x, y));
                    int blue = color.getBlue();
                    int red = color.getRed();
                    int green = color.getGreen();
                    int red_new ;
                    int green_new;
                    int blue_new;
                    if (blue > red && blue > green && red > green ) {
                         red_new = (int) (red*0.190 + green*0.120 + blue*0.300);
                         green_new = (int) (red * 0.160 + green * 0.140 + blue * 0.280);
                         blue_new = (int) (red * 0.117 + green * 0.188 + blue * 0.350);
                    } else if (blue < red && blue < green && red > green) {
                         red_new = (int) (red*0.030 + green*0.300 + blue*0.100);
                         green_new = (int) (red * 0.050 + green * 0.351 + blue * 0.150);
                         blue_new = (int) (red * 0.037 + green * 0.328 + blue * 0.200);
                    } else  if (blue > red && blue > green && red < green ){
                        red_new = (int) (red*0.290 + green*0.180 + blue*0.120);
                        green_new = (int) (red * 0.260 + green * 0.150 + blue * 0.160);
                        blue_new = (int) (red * 0.370 + green * 0.188 + blue * 0.130);

                    } else if (blue < red && blue > green && red > green){
                        red_new = (int) (red*0.290 + green*0.080 + blue*0.250);
                        green_new = (int) (red * 0.360 + green * 0.150 + blue * 0.235);
                        blue_new = (int) (red * 0.317 + green * 0.088 + blue * 0.284);
                    }

                    else if (blue < red && blue > green && red < green){
                        red_new = (int) (red*0.090 + green*0.180 + blue*0.350);
                        green_new = (int) (red * 0.060 + green * 0.150 + blue * 0.200);
                        blue_new = (int) (red * 0.017 + green * 0.188 + blue * 0.250);
                    }
                    else if (blue > red && blue < green && red > green){
                        red_new = (int) (red*0.190 + green*0.380 + blue*0.150);
                        green_new = (int) (red * 0.160 + green * 0.350 + blue * 0.135);
                        blue_new = (int) (red * 0.117 + green * 0.388 + blue * 0.124);

                    }
                    else {
                         red_new = (int) (red * 0.220 + green * 0.318 + blue * 0.318);
                         green_new = (int) (red * 0.300 + green * 0.351 + blue * 0.350);
                         blue_new = (int) (red * 0.267 + green * 0.288 + blue * 0.324);
                    }
                    int newRed = blue_new;
                    int newGreen =red_new ;
                    int newBlue = green_new;

                    Color newColor = new Color(newRed, newGreen, newBlue);

                    result.setRGB(x, y, newColor.getRGB());

                }
            }
            File output_red = new File("effect_3.jpg");
            ImageIO.write(result, "jpg", output_red);


        } catch (IOException e) {

            // When opening and saving files, an unexpected case may occur.
            // And in this case we have try catch
            System.out.println("Файл не найден или не удалось сохранить");
        }
    }
}

