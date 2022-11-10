package tbcbuild.specialText.anabosisCenter;

import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.PureDescriptions;
import tbcbuild.cardType.SpecialText;

public class Info_ItemCard extends SpecialText implements Printer {
    @Override
    public String description() {
        return "初始状态下，玩家只能携带一共占据3格大的物品\n" +
                "当玩家有背包后可以携带更多";
    }

    @Override
    public String nameTag() {
        return "Item Card Description";
    }

    @Override
    public CardPrinter printer() {
        return new PureDescriptions("粗Item Card description细\n\n\nIn the initial state, players can only carry items that take up a total of 3 units \n You can carry more when you have a backpack") {
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
                return "";
            }
        };
    }
}
