package tbcbuild.card.level2;

import tbcbuild.base.Parent;
import tbcbuild.cardGenerator.InteractiveList;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.Card;
import tbcbuild.cardType.ItemCard;

import java.util.ArrayList;

public class Item_TacticalBelt extends ItemCard implements Parent, Printer {
    @Override
    public String description() {
        return "这是一副黑色战术腰带，它可以为玩家增加10个可携带的占地格子。";
    }

    @Override
    public int space() {
        return -10;
    }

    public Item_TacticalBelt(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Item_TacticalBelt() {
        super();
    }

    @Override
    public ArrayList<Card> variant() {
        return new ArrayList<>() {{
            add(new Item_TacticalBelt(true));
            add(new Item_TacticalBelt_2(true));
            add(new Item_TacticalBelt_3(true));
        }};
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
                        "This is a black tactical belt that adds 10 pockets to the player.";
            }
        };
    }
}
