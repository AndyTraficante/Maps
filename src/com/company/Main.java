package com.company;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
            try{
                BufferedImage image = ImageIO.read(new File("/Users/AndyTraficante/Desktop/sticke2r.png.png"));

                image.getGraphics().drawLine(1, 1, image.getWidth()-1, image.getHeight()-1);
                image.getGraphics().drawLine(1, image.getHeight()-1, image.getWidth()-1, 1);

                System.out.println(ImageIO.write(image, "png", new File("/Users/AndyTraficante/Desktop/sticke2r.png.png")));
            }
            catch (IOException e){
                e.printStackTrace();
            }
    }
}
