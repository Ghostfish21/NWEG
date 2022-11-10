package tbcbuild.card.level1;

import tbcbuild.cardGenerator.InteractiveList;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.Card;
import tbcbuild.cardType.ItemCard;
import tbcbuild.base.Parent;

import java.util.ArrayList;

public class Item_PersonalPanel extends ItemCard implements Parent, Printer {
    public Item_PersonalPanel(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Item_PersonalPanel() {
        super();
    }

    @Override
    public int space() {
        return 4;
    }

    @Override
    public String description() {
        return "你打开了抽屉，里面整整齐齐的放着两螺平板电脑。你取走了其中一台\n" +
                "\n" +
                "一台 21cm * 15cm 的白色的个人平板电脑，由日本青山集团设计，远山工业集团生产。\n" +
                "平板电脑的背面印着一座岛屿的轮廓，轮廓内写着 晨曦基地 的字样";
    }

    @Override
    public ArrayList<Card> variant() {
        ArrayList<Card> variant = new ArrayList<>();
        variant.add(new Item_PersonalPanel_WangHao(true));
        variant.add(new Item_PersonalPanel(true));
        return variant;
    }

    @Override
    public CardPrinter printer() {
        return new NormalCard() {
            @Override
            public InteractiveList fpIl() {
                return null;
            }

            @Override
            public String cardName() {
                return getReferName();
            }

            @Override
            public String title() {
                return getReferName();
            }

            @Override
            public String cate() {
                return null;
            }

            @Override
            public String description() {
                return "Occupies "+space()+"\n\nYou open the drawer and there are two stacks of tablet neatly placed. You took one of them\n" +
                        "\n" +
                        "A 21cm * 15cm white personal tablet, designed by Japan's Aoyama Group, produced by Yuanshan Industrial Group.\n" +
                        "The outline of an island is printed on the back of the tablet with the words Morninglight Base written inside";
            }
        };
    }
}
