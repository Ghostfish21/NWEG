package tbcbuild.card.level1;

import tbcbuild.cardGenerator.InteractiveList;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.FindingCard;

import static tbcbuild.Util.obtain;

public class Finding_HibernateTankInside extends FindingCard implements Printer {
    public Finding_HibernateTankInside(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Finding_HibernateTankInside() {
        super();
    }

    @Override
    public String description() {
        return "冬眠仓内的被褥较为凌乱，要么是使用者没有整理床铺的习惯，要不是他离开时比较匆忙。被子和枕头上的图案都是卡通人物的图案\n" +
                "你在床上找到了一支钢笔，一本笔记本，以及一些黑色的头发" +
                obtain(true, new Item_DarkBluePen(), new Item_Dairy_QingYun(), new Item_Hair());
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
                return "The bedding in the chamber is messy, either because the user is not in the habit of making his bed or because he left in a hurry. The patterns on the quilts and pillows are cartoon characters.\n" +
                        "You find a pen, a notebook, and some black hair on the bed. 粗" +
                        obtain(true, new Item_DarkBluePen(), new Item_Dairy_QingYun(), new Item_Hair());
            }
        };
    }
}
