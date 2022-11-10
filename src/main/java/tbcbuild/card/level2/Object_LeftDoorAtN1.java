package tbcbuild.card.level2;

import tbcbuild.CategorySet;
import tbcbuild.base.CategoryChild;
import tbcbuild.base.InteractiveList;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.Card;
import tbcbuild.cardType.CateCard;
import tbcbuild.cardType.Category;
import tbcbuild.cardType.ObjectCard;
import tbcbuild.category.Cate_Chargable;
import tbcbuild.specialText.friendIA.InteractBook_IA;

import java.util.ArrayList;

import static tbcbuild.Util.obtain;
import static tbcbuild.Util.obtainSt;

public class Object_LeftDoorAtN1 extends ObjectCard implements CategoryChild, Cate_Chargable, Printer {
    public Object_LeftDoorAtN1(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Object_LeftDoorAtN1() {
        super();
    }

    @Override
    public ArrayList<String> categories() {
        return new ArrayList<>() {{
            add(CategorySet.categoryIndex(Cate_Chargable.class));
        }};
    }

    @Override
    public String exportCateText() {
        return this.exportLore();
    }

    @Override
    public InteractiveList interactiveList() {
        return null;
    }

    @Override
    public String description() {
        return "左侧的门和其他的门看起来并没有什么区别，只是窗户似乎被别人从外面破坏了，上面有很多锋利的玻璃碎片，好像还隐隐能看到血迹。门上写着技术部三个大字。你将手放到门上，试着拉开，但是门纹丝不动。\n" +
                "门上没有充电的接口，也没有电线。\n" +
                "你愿意试试伸手到窗户里，从门里面打开门吗？这将消耗两点生命值，\n" +
                "请投掷一枚1d6的骰子，如果结果小于4，则视作成功打开门。 " + obtain(true, new Map_TechnicalDepartment()) + "\n" +
                "否则，门内的门把手将被你意外破坏，掉在里面的地上。\n" +
                "或者如果 " + obtainSt(false, new InteractBook_IA()) + " 第十三页已经解锁，也可以直接翻到第十四页";
    }

    @Override
    public String amountOfPowerRequiredToRun() {
        return "10";
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
                return new CateCard(Cate_Chargable.class).getReferName();
            }

            @Override
            public String description() {
                return "The door on the left looks no different from the other doors, except that the window seems to have been damaged from the outside, and there are many sharp glass fragments on it, and it seems that bloodstains can still be faintly seen. On the door are three big characters of \"Technology Department\". You put your hand on the door and try to pull it open, but the door doesn't move.\n" +
                        "There are no charging ports on the door and no wires.\n" +
                        "Would you like to try reaching into the window and opening the door from the inside? This will cost two health points,\n" +
                        "Please roll a 1d6 die, and if the result is less than 4, the door is considered a success. 粗" + obtain(true, new Map_TechnicalDepartment()) + "细\n" +
                        "Otherwise, the doorknob inside the door will be accidentally broken by you and fall to the ground inside.\n" +
                        "Or if the thirteenth page of the 粗" + obtainSt(false, new InteractBook_IA()) + "细 has been unlocked, you can also directly turn to the fourteenth page\n" +
                        "\n" +
                        "One charge requires 10 units of electricity";
            }
        };
    }
}
