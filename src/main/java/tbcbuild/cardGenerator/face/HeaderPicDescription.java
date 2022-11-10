package tbcbuild.cardGenerator.face;

import lombok.RequiredArgsConstructor;
import tbcbuild.cardGenerator.Face;
import tbcbuild.cardGenerator.TextBlock;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static tbcbuild.cardGenerator.Util.*;

@RequiredArgsConstructor
public class HeaderPicDescription extends Face {
    public final String title;
    public final String cate;
    public final String description;
    public TextBlock descriptionBlock = new TextBlock(175, 1210, 1520, 1795);

    @Override
    public String paint(String path) {
        BufferedImage card = new BufferedImage(1400, 2000, BufferedImage.TYPE_INT_BGR);
        Graphics2D g2d = card.createGraphics();
        String left = null;

        try {
            g2d.drawImage(ImageIO.read(getClass().getResource("/face/head_pic_description.png")),
                    0, 0, null);
            setTitleFont(g2d);
            g2d.drawString(title, 190, 225);
            if (cate != null) {
                setCateFont(g2d);
                int width = getStringWidth(g2d, cate);
                g2d.drawString(cate, 1215-width, 280);
            }
            setDescriptionFont(g2d);
            left = descriptionBlock.printOn(g2d, description);
        }
        catch (IOException e) {e.printStackTrace();}

        try {ImageIO.write(card, "png", new File(path));}
        catch (IOException e) {e.printStackTrace();}
        return left;
    }
}
