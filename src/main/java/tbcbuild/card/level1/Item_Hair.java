package tbcbuild.card.level1;

import tbcbuild.cardGenerator.InteractiveList;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.ItemCard;

public class Item_Hair extends ItemCard implements Printer {
    public Item_Hair(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Item_Hair() {
        super();
    }

    @Override
    public int space() {
        return 0;
    }

    @Override
    public String description() {
        return "不知道有什么用的几根长长的黑色头发\n" +
                "头发看起来已经失去水分和光泽，他已经在这里很久了";
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
                return "Occupies "+space()+"\n\nThese are a few of long black hair\n" +
                        "The hair seems like it has already lost its moisture and luster, it's been here so long";
            }
        };
    }
}
