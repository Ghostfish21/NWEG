package tbcbuild.cardGenerator.card;

import tbcbuild.cardGenerator.Explorable;
import tbcbuild.cardGenerator.face.CardBack;
import tbcbuild.cardGenerator.face.HeaderPicDescription;
import tbcbuild.cardGenerator.face.PureDescription;

import java.io.File;

public abstract class NormalCard implements CardPrinter, Explorable {


    @Override
    public String paint(String path) {
        if (!new File(path).exists())
            new File(path).mkdirs();

        int i = 0;
        String left = new HeaderPicDescription(title(), cate(), description()).paint(path+i+".png");
        i++;
        PureDescription pureDescription = new PureDescription("");
        while (left != null) {
            pureDescription = new PureDescription(left);
            left = pureDescription.paint(path+i+".png");
            i++;
        }
        if (this.fpIl() != null) {
            if (!pureDescription.content.equals("")) i--;
            pureDescription.setInteractiveList(fpIl());
            pureDescription.paint(path+i+".png");
            i++;
        }

        if (i%2 == 0) {
            new PureDescription("").paint(path+i+".png");
            i++;
        }
        new CardBack().paint(path+i+".png");
        return null;
    }
}
