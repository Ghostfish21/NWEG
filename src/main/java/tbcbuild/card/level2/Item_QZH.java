package tbcbuild.card.level2;

import tbcbuild.cardGenerator.InteractiveList;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.ItemCard;

public class Item_QZH extends ItemCard implements Printer {
    @Override
    public String description() {
        return "这是一只粉色千纸鹤，千纸鹤的侧面有一个小小的爱心。爱心旁边写着Love you.\n" +
                "圆圆的，小小的，十分可爱";
    }

    @Override
    public int space() {
        return 0;
    }

    public Item_QZH(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Item_QZH() {
        super();
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
                return "Occupies 0\n\nThis is a pink paper crane with a small heart on the side. Next to the heart is written Love you.\n"
                        ;
            }
        };
    }
}
