package tbcbuild.card.level2;

import tbcbuild.cardGenerator.InteractiveList;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.ItemCard;
import tbcbuild.specialText.friendIA.Dairy_912;

import static tbcbuild.Util.obtainSt;

public class Item_Dairy_912 extends ItemCard implements Printer {
    @Override
    public String description() {
        return "玩家可以使用笔在本子上记录，也可以查阅这本日记";
    }

    public Item_Dairy_912(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Item_Dairy_912() {
        super();
    }

    @Override
    public int space() {
        return 2;
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
                return "Occupies 2\n" +
                        "\n" +
                        "Players can read this diary 粗" + obtainSt(true, new Dairy_912());
            }
        };
    }
}
