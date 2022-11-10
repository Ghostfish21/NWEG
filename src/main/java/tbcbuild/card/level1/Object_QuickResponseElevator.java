package tbcbuild.card.level1;

import tbcbuild.cardGenerator.InteractiveChoice;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.ObjectCard;
import tbcbuild.base.InteractiveList;

import static tbcbuild.base.InteractiveChoice.ic;
import static tbcbuild.Util.obtain;

public class Object_QuickResponseElevator extends ObjectCard implements Printer {
    public Object_QuickResponseElevator(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Object_QuickResponseElevator() {
        super();
    }

    @Override
    public String description() {
        return "电梯看起来与大门一样，都是黑铁制成的。电梯的一边写着基地快反专用电梯的字样。在电梯旁有一个铁板，从上到下分别是一块方形的小屏幕，还没有一个手掌大，屏幕上有一个感应的标识。下面是一上一下的两个按钮。\n" +
                obtain(true, new Misc_PersonalId());
    }

    @Override
    public InteractiveList interactiveList() {
        return new InteractiveList() {{
            add(ic("按向上的按钮"), new Finding_ElevatorNotResponding());
            add(ic("按向下的按钮"), new Finding_ElevatorNotResponding());
            add(ic("花费两点体力，试图强行掰开电梯门"), new Finding_ElevatorInternal());
        }};
    }

    @Override
    public CardPrinter printer() {
        return new NormalCard() {
            @Override
            public tbcbuild.cardGenerator.InteractiveList fpIl() {
                return new tbcbuild.cardGenerator.InteractiveList() {{
                    add(InteractiveChoice.ic("Press the button that's pointing up"), new Finding_ElevatorNotResponding());
                    add(InteractiveChoice.ic("Press the button that's pointing down"), new Finding_ElevatorNotResponding());
                    add(InteractiveChoice.ic("Try to force open the elevator, this will cost 2 physical power"), new Finding_ElevatorInternal());
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
                return "The elevator looks the same as the door, which is made of black metal. On the side of the elevator was written the words for the quick response elevator of the base. Next to the elevator is an iron plate, from top to bottom is a small square screen, no bigger than the palm of your hand. On the screen is a sensor logo. Below are two buttons, one is pointing up and the other one is pointing down.\n" +
                        obtain(true, new Misc_PersonalId());
            }
        };
    }
}
