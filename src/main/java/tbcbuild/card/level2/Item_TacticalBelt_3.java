package tbcbuild.card.level2;

import tbcbuild.cardGenerator.InteractiveList;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.ItemCard;

public class Item_TacticalBelt_3 extends ItemCard implements Printer {
    public Item_TacticalBelt_3(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Item_TacticalBelt_3() {
        super();
    }

    @Override
    public String description() {
        return "这是一副白色的战术腰带，它可以为玩家增加10个可携带的占地格子。";
    }

    @Override
    public int space() {
        return -10;
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
                return "Occupies -10\n" +
                        "\n" +
                        "This is a white tactical belt that adds 10 pockets to the player.";
            }
        };
    }
}
