package tbcbuild.card.level2;

import tbcbuild.base.InteractiveList;
import tbcbuild.base.Obtainable;
import tbcbuild.base.Parent;
import tbcbuild.card.level1.Finding_ElevatorNotResponding;
import tbcbuild.cardGenerator.InteractiveChoice;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.Card;
import tbcbuild.cardType.ObjectCard;

import java.util.ArrayList;

import static tbcbuild.base.InteractiveChoice.ic;

public class Object_SmallElevatorInTechnicalDepartment1 extends ObjectCard implements Parent, Printer {
    public Object_SmallElevatorInTechnicalDepartment1(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Object_SmallElevatorInTechnicalDepartment1() {
        super();
    }

    @Override
    public String description() {
        return "这是两台并排在一起的白色载人电梯，电梯上的楼层指示屏早已不再发出光芒。两台电梯中间，有一块小小的操作板。操作板上面从上到下依次是 巴掌大的感应板，向上按钮，和向下按钮\n" +
                "\n" +
                "在操作板的上方，贴的醒目的火灾标志：如果发生火灾，请通过楼梯有序撤离地下掩体。请不要使用电梯。\n" +
                "\n" +
                "白色的电梯上沾着和火灾标志一样醒目的血迹，呈带状，斑斑点点的喷溅在电梯门上。";
    }

    @Override
    public InteractiveList interactiveList() {
        return new InteractiveList() {{
            add(ic("按下向上的电梯按钮").tc(), new Finding_ElevatorNotResponding());
            add(ic("按下向下的电梯按钮").tc(), new Finding_ElevatorNotResponding());
            add(ic("耗费两点体力，强行打开电梯门").tc(), new Finding_ElevatorCantOpen());
        }};
    }

    @Override
    public ArrayList<Card> variant() {
        return new ArrayList<>() {{
            add(new Object_SmallElevatorInTechnicalDepartment1(true));
            add(new Object_SmallElevatorInTechnicalDepartment2(true));
        }};
    }

    @Override
    public CardPrinter printer() {
        return new NormalCard() {
            @Override
            public tbcbuild.cardGenerator.InteractiveList fpIl() {
                return new tbcbuild.cardGenerator.InteractiveList() {{
                    add(InteractiveChoice.ic("Press the button that goes up").tc(), new Finding_ElevatorNotResponding());
                    add(InteractiveChoice.ic("Press the button that goes down").tc(), new Finding_ElevatorNotResponding());
                    add(InteractiveChoice.ic("Spend 2 physical power to open the elevator door").tc(), new Finding_ElevatorCantOpen());
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
                return "These are two white passenger elevators side by side, and the floor indicator screen on the elevator has long ceased to emit light. In the middle of the two elevators, there is a small operation panel. From top to bottom on the operation panel are the palm-sized sensor pads, the up button, and the down button\n" +
                        "Above the operation panel, there is a striking fire sign: If a fire occurs, please evacuate the underground bunker in an orderly manner through the stairs. Please do not use the elevator.\n" +
                        "The white elevator was stained with blood, which was as striking as the fire sign, in ribbons, and splashed on the elevator doors.";
            }
        };
    }
}
