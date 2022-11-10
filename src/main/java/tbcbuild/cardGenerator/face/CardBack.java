package tbcbuild.cardGenerator.face;

import tbcbuild.cardGenerator.Face;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class CardBack extends Face {

    @Override
    public String paint(String path) {
        BufferedImage card = new BufferedImage(1400, 2000, BufferedImage.TYPE_INT_BGR);
        Graphics2D g2d = card.createGraphics();

        try {
            g2d.drawImage(ImageIO.read(getClass().getResource("/face/card_back.png")),
                    0, 0, null);
        }
        catch (IOException e) {e.printStackTrace();}
        try {ImageIO.write(card, "png", new File(path));}
        catch (IOException e) {e.printStackTrace();}
        return null;
    }
}
