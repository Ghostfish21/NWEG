package tbcbuild.card.level2;

import tbcbuild.cardGenerator.InteractiveList;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.ItemCard;

public class Item_Coins extends ItemCard implements Printer {
    @Override
    public String description() {
        return "这里有13枚硬币。硬币的正面印着人头，硬币的背面印着喷泉。硬币正面能看到 东亚发展银行 5角，背面写着 East Asian Development Bank 50 cent";
    }

    public Item_Coins(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Item_Coins() {
        super();
    }

    @Override
    public int space() {
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
                return "Occupies 2\n" +
                        "\n" +
                        "There are 13 coins here. On the front of the coin is a head, and on the back of the coin is a fountain. East Asian Development Bank 50 cents can be seen on the bottom of the coin.";
            }
        };
    }
}
