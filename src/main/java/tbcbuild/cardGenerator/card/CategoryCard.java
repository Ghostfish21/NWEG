package tbcbuild.cardGenerator.card;

import tbcbuild.cardGenerator.face.CardBackWithDescription;
import tbcbuild.cardGenerator.face.PureDescription;
import tbcbuild.cardType.Category;

import java.util.ArrayList;

public abstract class CategoryCard implements CardPrinter {

    private Class<? extends Category> cate;

    public CategoryCard(Class<? extends Category> cate) {
        this.cate = cate;
    }

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

    @Override
    public String cardName() {
        return "";
    }

    @Override
    public String title() {
        return Category.card(cate).getReferName();
    }

    @Override
    public String cate() {
        return null;
    }

    @Override
    public String description() {
        return "";
    }
}
