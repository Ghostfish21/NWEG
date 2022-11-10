package tbcbuild.card.level1;

import tbcbuild.cardGenerator.InteractiveChoice;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.ObjectCard;
import tbcbuild.base.InteractiveList;

import static tbcbuild.base.InteractiveChoice.ic;

public class Object_ElectricWellDoor extends ObjectCard implements Printer {
    public Object_ElectricWellDoor(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Object_ElectricWellDoor() {
        super();
    }

    @Override
    public String description() {
        return "小门的锁似乎已经被破坏，你一下就拉开了它\n" +
                "\n" +
                "吱呀————\n" +
                "\n" +
                "不大不小，刺耳的开门声一下子让你警惕起来。但是半天都没有动静，你朝里面望了去。\n" +
                "门内有一些扳动式的开关，一旁还有一个粗壮的金属管子，从屋顶出来，在地板停止。管子上有一个比头稍微大一点，半开这的方形小铁门。";
    }

    @Override
    public InteractiveList interactiveList() {
        return new InteractiveList() {{
            add(ic("探查小铁门内"), new Finding_ElectricWell());
            add(ic("扳下开关1"), new Finding_NothingHappens_01());
            add(ic("扳下开关2"), new Finding_NothingHappens_01());
            add(ic("扳三开关3"), new Finding_NothingHappens_01());
        }};
    }

    @Override
    public CardPrinter printer() {
        return new NormalCard() {
            @Override
            public tbcbuild.cardGenerator.InteractiveList fpIl() {
                return new tbcbuild.cardGenerator.InteractiveList() {{
                    add(InteractiveChoice.ic("Check the internal of the small iron lid"), new Finding_ElectricWell());
                    add(InteractiveChoice.ic("Pull down switch 1"), new Finding_NothingHappens_01());
                    add(InteractiveChoice.ic("Pull down switch 2"), new Finding_NothingHappens_01());
                    add(InteractiveChoice.ic("Push up switch 3"), new Finding_NothingHappens_01());
                }};
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
                return "The lock of the small door seemed to have been broken. You tried to open it\n\n" +
                        "\n" +
                        "Squeak————\n" +
                        "\n" +
                        "Not too light, nor too loud, the harsh sound of the door suddenly put you on guard. But nothing happened for a long time, and you looked in.\n" +
                        "Inside the door are some flip switches, and on the side is a stout metal pipe that comes out of the roof and stops at the floor. There was a small square iron lid on the pipe, slightly larger than the head, which was ajar.";
            }
        };
    }
}
