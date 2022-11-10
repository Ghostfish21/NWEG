package tbcbuild.card.level1;

import tbcbuild.cardGenerator.InteractiveChoice;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.ObjectCard;
import tbcbuild.base.InteractiveList;

import static tbcbuild.base.InteractiveChoice.ic;

public class Object_TheRobot extends ObjectCard implements Printer {
    public Object_TheRobot(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Object_TheRobot() {
        super();
    }

    @Override
    public String description() {
        return "机器人无力的靠在柜台的一角，他看起来已经很久没有动过了。原本光洁的机身上落了一层薄薄的灰尘。它的头无力的垂了下去，僵直地盯着地面，如果没有你的到来，它可能会一直的盯下去，直至永恒。\n" +
                "\n" +
                "你走近了机器人。这是一台白色的机器人。如同大厅的材质一样，机器人的表面也是白色的材质制成的，十分光滑与柔和，如果没有身上积攒的灰尘肯定会更好。看起来应该是某种经过了特殊处理的金属。\n" +
                "这里曾经发生了什么？\n" +
                "机器人的腰上，有一格一厘米粗的小孔，似乎是用于充电的。小孔上方有一个小指示灯";
    }

    @Override
    public InteractiveList interactiveList() {
        InteractiveList choices = new InteractiveList();
        choices.add(ic("机器人背面机体信息").tc(), new Finding_RobotProductionInfo());
        choices.add(ic("机器人充电接口 - 将物品插入", false, new Item_Wire()).tc(), new Finding_RobotNotResponding());
        choices.add(ic("机器人机箱板"), new Finding_DismountableLid());
        return choices;
    }

    @Override
    public CardPrinter printer() {
        return new NormalCard() {
            @Override
            public tbcbuild.cardGenerator.InteractiveList fpIl() {
                tbcbuild.cardGenerator.InteractiveList choices = new tbcbuild.cardGenerator.InteractiveList();
                choices.add(InteractiveChoice.ic("The product info on the back").tc(), new Finding_RobotProductionInfo());
                choices.add(InteractiveChoice.ic("Robot's charging port - insert item", false, new Item_Wire()).tc(), new Finding_RobotNotResponding());
                choices.add(InteractiveChoice.ic("Robot's back lid"), new Finding_DismountableLid());
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
                return "The robot leaned limp against a corner of the counter. It looked like it hadn't moved in ages. A thin layer of dust fell on the otherwise sleek fuselage. Its head hangs feebly, staring at the ground, as it would have done for eternity if you hadn't come.\n" +
                        "\n" +
                        "You approach the robot. This is a red robot. It looks very smooth and soft, if there is no dust accumulated on the body will be better. It looks like it's some kind of specially treated metal.\n" +
                        "What happened here?\n" +
                        "On the waist of the robot, there is a one centimeter thick hole, seems to be used for charging. There is a small indicator light above the hole.";
            }
        };
    }
}
