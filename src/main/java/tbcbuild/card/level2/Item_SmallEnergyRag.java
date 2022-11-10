package tbcbuild.card.level2;

import tbcbuild.cardGenerator.InteractiveList;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.ItemCard;

public class Item_SmallEnergyRag extends ItemCard implements Printer {
    @Override
    public String description() {
        return "小型能量匣，也是标准手枪能量匣，含有50单位电力";
    }

    public Item_SmallEnergyRag(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Item_SmallEnergyRag() {
        super();
    }

    @Override
    public int space() {
        return 1;
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
                return "Occupies 1\n" +
                        "\n" +
                        "Small power box, also a standard pistol power box, contains 50 units of electricity";
            }
        };
    }
}
