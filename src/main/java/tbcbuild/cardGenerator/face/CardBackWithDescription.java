package tbcbuild.cardGenerator.face;

import lombok.RequiredArgsConstructor;
import tbcbuild.cardGenerator.Face;
import tbcbuild.cardGenerator.TextBlock;
import tbcbuild.cardGenerator.Util;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

@RequiredArgsConstructor
public class CardBackWithDescription extends Face {
    public final String title;
    public final String description;
    public String carriedInfo;
    public TextBlock descript;

    public CardBackWithDescription setCarriedInfo(String info) {
        carriedInfo = info;
        return this;
    }

    @Override
    public String paint(String path) {
        BufferedImage card = new BufferedImage(1400, 2000, BufferedImage.TYPE_INT_BGR);
        Graphics2D g2d = card.createGraphics();

        try {
            g2d.drawImage(ImageIO.read(getClass().getResource("/face/card_back_with_info.png")),
                    0, 0, null);
        } catch (IOException e) {e.printStackTrace();}

        if (title != null) {
            Util.setTitleFont(g2d);
            g2d.drawString(title, 190, 905+g2d.getFont().getSize());
            descript = new TextBlock(600,1225, 880,990);
            Util.setDescriptionFont(g2d);
            descript.printOn(g2d, description);
        } else {
            descript = new TextBlock(190,1225, 880,990);
            Util.setDescriptionFont(g2d);
            descript.printOn(g2d, description);
        }

        if (carriedInfo != null) {
            descript = new TextBlock(190, 1225, 880, 990);
            Util.setCarriedInfoFont(g2d, carriedInfo, descript.endX - descript.startX, descript.endY - descript.startY);
            descript.printOn(g2d, carriedInfo);
        }

        try {ImageIO.write(card, "png", new File(path));}
        catch (IOException e) {e.printStackTrace();}
        return null;
    }
}
