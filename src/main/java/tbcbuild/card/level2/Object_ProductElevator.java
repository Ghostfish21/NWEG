package tbcbuild.card.level2;

import tbcbuild.base.InteractiveList;
import tbcbuild.base.Obtainable;
import tbcbuild.card.level1.Finding_ElevatorNotResponding;
import tbcbuild.cardGenerator.InteractiveChoice;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.ObjectCard;

import static tbcbuild.base.InteractiveChoice.ic;

public class Object_ProductElevator extends ObjectCard implements Printer {
    public Object_ProductElevator(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Object_ProductElevator() {
        super();
    }

    @Override
    public String description() {
        return "这是台较大的电梯，电梯一旁有一个写有 货梯 字样的标识牌。在标识牌下有一块小小的操作板。操作板上面从上到下依次是 巴掌大的感应板，向上按钮，和向下按钮。\n" +
                "\n" +
                "白色的电梯上沾着一大块无比醒目的血迹，呈椭圆状，静静的凝固在电梯的下半部分。血迹还没干涸的时候成股成股的流了下来，一条条竖着凝固在血迹下方，一直落到地毯上面。你这才注意到，地毯上有很多看起来比其他地方颜色深很多的地方。";
    }

    @Override
    public InteractiveList interactiveList() {
        return new InteractiveList() {{
            add(ic("按下向上的电梯按钮").tc(), new Finding_ElevatorNotResponding());
            add(ic("按下向下的电梯按钮").tc(), new Finding_ElevatorNotResponding());
            add(ic("耗费两点体力，强行打开电梯门"), new Finding_ElevatorOpen());
        }};
    }

    @Override
    public CardPrinter printer() {
        return new NormalCard() {
            @Override
            public tbcbuild.cardGenerator.InteractiveList fpIl() {
                return new tbcbuild.cardGenerator.InteractiveList() {{
                    add(InteractiveChoice.ic("Press the button to goes up").tc(), new Finding_ElevatorNotResponding());
                    add(InteractiveChoice.ic("Press the button to goes down").tc(), new Finding_ElevatorNotResponding());
                    add(InteractiveChoice.ic("Spend 2 physical power to open the elevator door"), new Finding_ElevatorOpen());
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
                return "This is a larger elevator, and there is a sign next to the elevator with the words \"Freight Elevator\" written on it. There is a small operating panel under the sign. From top to bottom on the operation panel are the palm-sized sensor pad, the up button, and the down button.\n" +
                        "\n" +
                        "The white elevator was stained with a large piece of blood that was very eye-catching, in the shape of an oval, and quietly solidified on the lower part of the elevator. Before the bloodstains dried up, they flowed down in strands, and the strands solidified under the bloodstains, all the way down to the carpet. You just noticed that there are a lot of places on the carpet that look a lot darker than the rest.";
            }
        };
    }
}
