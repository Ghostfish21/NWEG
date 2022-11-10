package tbcbuild.card.level1.Object_HibernateTank;

import tbcbuild.card.level1.Finding_HibernateTankInternal_NotCool;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.ObjectCard;
import tbcbuild.base.InteractiveList;
import tbcbuild.card.level1.Finding_HibernateTankInside;

import static tbcbuild.Util.obtain;

public class Object_HibernateTank_04PrivateSpace extends ObjectCard implements Printer {

    public Object_HibernateTank_04PrivateSpace(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Object_HibernateTank_04PrivateSpace() {
        super();
    }

    @Override
    public String description() {
        return "这是一个破败的冬眠仓，它本该光洁的外表上现在布满了灰尘\n" +
                "冬眠舱的玻璃罩是关闭状态的，但是里面并没有人。反而你看到了完整的一床枕头被子，冬眠仓的周围还能看到一些空的零食袋。\n" +
                "花费一点体力来调查冬眠仓，" +
                obtain(true, new Finding_HibernateTankInside()) + "\n" +
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
                        "The glass shield of the tank is closed, nobody is inside. Instead, you see a full pillow quilt and empty snack bags around the tank.\n" +
                        "Spend 1 point of physical power to investigate the tank, and 粗" +
                        obtain(true, new Finding_HibernateTankInside()) + "\n" +
                        "There is a lid, fixed by screws, on the lower half of the tank. If you have a 粗screwdriver细, you can remove the lid and 粗" + obtain(true, new Finding_HibernateTankInternal_NotCool());
            }
        };
    }
}
