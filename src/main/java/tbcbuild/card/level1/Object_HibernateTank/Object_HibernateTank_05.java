package tbcbuild.card.level1.Object_HibernateTank;

import tbcbuild.card.level1.Finding_HibernateTankInternal_NotCool;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.ObjectCard;
import tbcbuild.base.InteractiveList;

import static tbcbuild.Util.obtain;

public class Object_HibernateTank_05 extends ObjectCard implements Printer {
    public Object_HibernateTank_05(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Object_HibernateTank_05() {
        super();
    }

    @Override
    public String description() {
        return "这是一个破败的冬眠仓，它本该光洁的外表上现在布满灰尘\n" +
                "冬眠仓的门已经被打开，看起来里面的人已经离开了\n" +
                "冬眠舱下半部分有一个用螺丝固定的盖子。也许可以用螺丝刀拆开它并" + obtain(true, new Finding_HibernateTankInternal_NotCool());
    }

    @Override
    public InteractiveList interactiveList() {
        return null;
    }

    @Override
    public CardPrinter printer() {
        return new NormalCard() {
            @Override
            public tbcbuild.cardGenerator.InteractiveList fpIl() {
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
                return "This is a shabby hibernation tank. Its smoothy surface now is full of dust.\n" +
                        "The tank was opened. It seems like the people who slept in it is already gone.\n" +
                        "There is a lid, fixed by screws, on the lower half of the tank. If you have a 粗screwdriver细, you can remove the lid and 粗" + obtain(true, new Finding_HibernateTankInternal_NotCool());
            }
        };
    }
}
