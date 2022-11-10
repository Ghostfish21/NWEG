package tbcbuild.cardGenerator.card;

import tbcbuild.cardGenerator.face.CardBackWithDescription;
import tbcbuild.cardGenerator.face.PureDescription;

import java.io.File;

public abstract class MiscCard implements CardPrinter {

    public abstract String fengMianDescription();

    @Override
    public String paint(String path) {
        if (!new File(path).exists())
            new File(path).mkdirs();

        int i = 0;
        new CardBackWithDescription(title(), fengMianDescription()).paint(path+i+".png");
        i++;
        String left = description();
        while (left != null) {
            left = new PureDescription(left).paint(path+i+".png");
            i++;
        }
        if (i%2 == 0) {
            new PureDescription("").paint(path+i+".png");
            i++;
        }
        new CardBackWithDescription(null, fengMianDescription()).paint(path+i+".png");
        return null;
    }
}
