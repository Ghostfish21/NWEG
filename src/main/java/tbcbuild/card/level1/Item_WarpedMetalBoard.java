package tbcbuild.card.level1;

import tbcbuild.cardGenerator.InteractiveList;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.ItemCard;
import tbcbuild.base.Duplicate;

public class Item_WarpedMetalBoard extends ItemCard implements Duplicate, Printer {
    public Item_WarpedMetalBoard(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Item_WarpedMetalBoard() {
        super();
    }

    @Override
    public int space() {
        return 5;
    }

    @Override
    public String description() {
        return "这是一块被破坏了的扭曲钢板。整体上勉强还是平的\n" +
                "看起来似乎可以起到很好的防护性";
    }

    @Override
    public int amount() {
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
                return "Occupies "+space()+"\n\nThis is a broken twisted steel plate. It is barely flat\n" +
                        "It seems to be a good protection";
            }
        };
    }
}
