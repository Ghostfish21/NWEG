package tbcbuild.card.level2;

import tbcbuild.cardGenerator.InteractiveList;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.ItemCard;

public class Item_PersonalID extends ItemCard implements Printer {
    public Item_PersonalID(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Item_PersonalID() {
        super();
    }

    @Override
    public String description() {
        return "背面 未激活\n" +
                "正面 已激活\n" +
                "你打开了抽屉，里面整整齐齐的放着无数的空白身份卡。你取走了其中一张\n\n" +
                "\n" +
                "一张白色的身份卡，还没有手掌心那么大";
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
                        "You open the drawer, and there are countless blank ID cards neatly placed inside. you took one of them\n" +
                        "\n" +
                        "A white ID card, not as big as the palm of your hand";
            }
        };
    }
}
