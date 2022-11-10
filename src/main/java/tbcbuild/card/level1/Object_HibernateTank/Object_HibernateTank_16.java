package tbcbuild.card.level1.Object_HibernateTank;

import tbcbuild.card.level1.Finding_HibernateTankInternal_NotCool;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.ObjectCard;
import tbcbuild.base.InteractiveList;
import tbcbuild.card.level1.Finding_BloodedGate;

import static tbcbuild.Util.obtain;

public class Object_HibernateTank_16 extends ObjectCard implements Printer {
    public Object_HibernateTank_16(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Object_HibernateTank_16() {
        super();
    }

    @Override
    public String description() {
        return "正面是冬眠仓的单独渲染图\n" +
                "背面是细节描述：\n" +
                "这是一个破败的冬眠仓，它本该光洁的外表上现在布满了灰尘\n" +
                "冬眠舱的玻璃罩被外力打碎了，里面隐隐约约能看到淡淡的红色\n" +
                "仅获得卡牌时触发：\n" +
                "你看向冬眠仓外，请投掷1d6，点数在3以下则 " +
                obtain(true, new Finding_BloodedGate()) + "\n" +
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
                        "The glass sheld of the tank was broken from outside. You can see a faint red inside.\n" +
                        "Following the faint red, please draw a 1d6 die, and if the random number is smaller than 3 粗" +
                        obtain(true, new Finding_BloodedGate()) + "\n" +
                        "There is a lid, fixed by screws, on the lower half of the tank. If you have a 粗screwdriver细, you can remove the lid and 粗" + obtain(true, new Finding_HibernateTankInternal_NotCool());
            }
        };
    }
}
