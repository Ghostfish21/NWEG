package tbcbuild.cardGenerator.card;

import tbcbuild.cardGenerator.face.CardBackWithDescription;
import tbcbuild.cardGenerator.face.PureDescription;

import java.util.ArrayList;

public abstract class PagesPureDescription implements CardPrinter {

    private ArrayList<String> descriptions = new ArrayList<>();

    public void add(String description) {
        this.descriptions.add(description);
    }

    @Override
    public String paint(String path) {
        int i = 0;
        for (String str : descriptions) {
            while (str != null) {
                str = new PureDescription(str).paint(path + i + ".png");
                i++;
            }
        }
        new CardBackWithDescription(title(), null).paint(path+i+".png");
        return null;
    }
}
