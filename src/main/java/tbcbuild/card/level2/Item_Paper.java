package tbcbuild.card.level2;

import tbcbuild.cardGenerator.InteractiveList;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.ItemCard;

public class Item_Paper extends ItemCard implements Printer {
    @Override
    public String description() {
        return "这是一张小纸条，纸条上面写着 153";
    }

    public Item_Paper(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Item_Paper() {
        super();
    }

    @Override
    public int space() {
        return 0;
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
                return "Occupies 0\n" +
                        "\n" +
                        "Here is a small note that says 153";
            }
        };
    }
}
