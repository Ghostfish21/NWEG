package tbcbuild.card.level1;

import tbcbuild.cardGenerator.InteractiveChoice;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.ObjectCard;
import tbcbuild.base.InteractiveList;

import static tbcbuild.base.InteractiveChoice.ic;

public class Object_HelpDesk extends ObjectCard implements Printer {

    public Object_HelpDesk(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Object_HelpDesk() {
        super();
    }

    @Override
    public String description() {
        return "这是一个柜台，与洁白的大厅不一样，它的柜子是暗色调的。柜台的中心有一个柱子，顶着白色的棚子，在上方盖住了整个柜台。柜台内倚着内侧，坐着一个机器人。";
    }

    @Override
    public InteractiveList interactiveList() {
        InteractiveList choices = new InteractiveList();
        choices.add(ic("机器人"), new Object_TheRobot());
        choices.add(ic("柜台抽屉"), new Object_TheDrawer());
        choices.add(ic("柜台电脑").tc(), new Object_TheMonitorOnHelpDesk());
        choices.add(ic("柜台充电插座与电线"), new Finding_PluginAndWire());
        return choices;
    }

    @Override
    public CardPrinter printer() {
        return new NormalCard() {
            @Override
            public tbcbuild.cardGenerator.InteractiveList fpIl() {
                tbcbuild.cardGenerator.InteractiveList choices = new tbcbuild.cardGenerator.InteractiveList();
                choices.add(InteractiveChoice.ic("The robot"), new Object_TheRobot().getReferName());
                choices.add(InteractiveChoice.ic("Drawer"), new Object_TheDrawer().getReferName());
                choices.add(InteractiveChoice.ic("Computer").tc(), new Object_TheMonitorOnHelpDesk().getReferName());
                choices.add(InteractiveChoice.ic("Plugin and wire"), new Finding_PluginAndWire().getReferName());
                return choices;
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
                return "This is a front desk. Different from the deathly white hall, the desk is dark. There is a pillar at the center of the desk, which is supporting a circular cap. Beside these, there is also a robot sit silently in the help desk.";
            }
        };
    }
}
