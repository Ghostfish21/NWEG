package tbcbuild.card.level1;

import tbcbuild.cardGenerator.InteractiveList;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.ItemCard;

public class Item_Wire extends ItemCard implements Printer {
    public Item_Wire(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Item_Wire() {
        super();
    }

    @Override
    public int space() {
        return 10000;
    }

    @Override
    public String description() {
        return "不可携带\n" +
                "\n" +
                "看起来是一根很粗的电线，它的一头死死的连接着柜台的下方。";
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
                return "Occupies "+space()+"\nNot portable\n" +
                        "\n" +
                        "It appeared to be a thick wire, and one end of it was firmly attached to the underside of the counter.";
            }
        };
    }
}
