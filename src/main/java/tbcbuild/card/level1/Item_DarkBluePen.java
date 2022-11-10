package tbcbuild.card.level1;

import tbcbuild.cardGenerator.InteractiveList;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.ItemCard;

public class Item_DarkBluePen extends ItemCard implements Printer {
    public Item_DarkBluePen(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Item_DarkBluePen() {
        super();
    }

    @Override
    public int space() {
        return 0;
    }

    @Override
    public String description() {
        return "一支深蓝色的普通的钢笔，钢笔上有细细的，淡淡的纹路。拥有此物品后，玩家可以使用笔\n" +
                "\n" +
                "晨光文具\n" +
                "深海蓝实用钢笔";
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
                return "A plain dark blue pen with thin, subtle pattern. With this pen, the player can use the pen to write.\n" +
                        "\n";
            }
        };
    }
}
