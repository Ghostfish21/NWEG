package tbcbuild.card.level1;

import tbcbuild.cardGenerator.InteractiveList;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.ItemCard;

public class Item_UnbrokenMetalBoard extends ItemCard implements Printer {
    public Item_UnbrokenMetalBoard(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Item_UnbrokenMetalBoard() {
        super();
    }

    @Override
    public int space() {
        return 7;
    }

    @Override
    public String description() {
        return "一块完整的金属挡板";
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
                return "Occupies "+space()+"\n\nA complete piece of metal baffle";
            }
        };
    }
}
