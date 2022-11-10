package tbcbuild.card.level2;

import tbcbuild.cardGenerator.InteractiveList;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.ItemCard;

public class Item_TacticalBelt_2 extends ItemCard implements Printer {
    public Item_TacticalBelt_2(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Item_TacticalBelt_2() {
        super();
    }

    @Override
    public String description() {
        return "这是一副蓝色的战术腰带，它可以为玩家增加15个可携带的占地格子。";
    }

    @Override
    public int space() {
        return -15;
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
                return "Occupies -15\n" +
                        "\n" +
                        "This is a blue tactical belt that adds 15 pockets for the player to carry.";
            }
        };
    }
}
