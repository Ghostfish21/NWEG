package tbcbuild.cardGenerator.face;

import lombok.RequiredArgsConstructor;
import tbcbuild.cardGenerator.Face;
import tbcbuild.cardGenerator.InteractiveList;
import tbcbuild.cardGenerator.TextBlock;
import tbcbuild.cardGenerator.Util;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

@RequiredArgsConstructor
public class PureDescription extends Face {
    public final String content;
    public TextBlock largeDescript = new TextBlock(175, 1210, 215, 1795);
    public InteractiveList interactiveList;

    public void setInteractiveList(InteractiveList interactiveList) {
        this.interactiveList = interactiveList;
    }

    @Override
    public String paint(String path) {
        BufferedImage card = new BufferedImage(1400, 2000, BufferedImage.TYPE_INT_BGR);
        Graphics2D g2d = card.createGraphics();

        try {
            g2d.drawImage(ImageIO.read(getClass().getResource("/face/pure_description.png")),
                    0, 0, null);
        } catch (IOException e) {e.printStackTrace();}

        Util.setDescriptionFont(g2d);
        Integer[] lastHeight = new Integer[] {0};
        String left = largeDescript.printOn(g2d, content, lastHeight);

        if (left == null) {
            if (interactiveList != null)
                largeDescript.plotOn(g2d, interactiveList, lastHeight[0]);
        }

        try {ImageIO.write(card, "png", new File(path));}
        catch (IOException e) {e.printStackTrace();}
        return left;
    }
}
