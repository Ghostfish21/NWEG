package tbcbuild.card.level2;

import tbcbuild.base.InteractiveList;
import tbcbuild.cardGenerator.InteractiveChoice;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.MapCard;
import tbcbuild.specialText.friendIA.FilesInTechnicalDepartment;

import static tbcbuild.base.InteractiveChoice.ic;
import static tbcbuild.base.RandomObtainable.ro;

public class Map_TechnicalDepartment extends MapCard implements Printer {
    public Map_TechnicalDepartment(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Map_TechnicalDepartment() {
        super();
    }

    @Override
    public String description() {
        return  "你拉开门，一股臭味迎着你扑面而来。办公室里面十分凌乱。地毯地板上散落着一地的文件，包装袋，灰尘，与脚印。天花板上吊着的灯全部熄灭了，有一个甚至从中间断开了，两边垂挂在屋顶上。\n" +
                "这里的墙壁和复苏中心的不同。墙壁是黑色的，但是感觉有点像玻璃。正前方的墙壁上有一个似乎是用锤子重击造成的圆形破洞，裂纹从中间出现，向四面八方延申。你更加确定了这是一个玻璃墙的猜想。左边的墙壁上从近到远分别有两个小电梯和一个大电梯。前方和右手边还有两扇关着的门。\n" +
                "办公室内坐落着三排白色的桌子。上面全都是显示屏，有些屏幕翻到了桌子上，或者是摔到了地上。桌子后面是凌乱的座椅。在办公室的后方，规则摆放着9台显示屏，似乎是用来播放监控的。\n" +
                "在监控旁边，有一台相对小巧的机器";
    }

    @Override
    public InteractiveList interactiveList() {
        return new InteractiveList() {{
            add(ic("探查地上的凌乱纸张"), new FilesInTechnicalDepartment());
            add(ic("显示屏1").tc(), ro(new Object_UnpoweredMonitor1().getMainIndex(), new Object_UnpoweredMonitor1().getSubIndex(), new Object_UnpoweredMonitor2().getSubIndex()));
            add(ic("显示屏2").tc(), ro(new Object_UnpoweredMonitor1().getMainIndex(), new Object_UnpoweredMonitor1().getSubIndex(), new Object_UnpoweredMonitor2().getSubIndex()));
            add(ic("显示屏3"), ro(new Object_UnpoweredMonitor1().getMainIndex(), new Object_UnpoweredMonitor1().getSubIndex(), new Object_UnpoweredMonitor2().getSubIndex()));
            add(ic("显示屏4").tc(), ro(new Object_UnpoweredMonitor1().getMainIndex(), new Object_UnpoweredMonitor1().getSubIndex(), new Object_UnpoweredMonitor2().getSubIndex()));
            add(ic("显示屏5").tc(), ro(new Object_UnpoweredMonitor1().getMainIndex(), new Object_UnpoweredMonitor1().getSubIndex(), new Object_UnpoweredMonitor2().getSubIndex()));
            add(ic("显示屏6").tc(), ro(new Object_UnpoweredMonitor1().getMainIndex(), new Object_UnpoweredMonitor1().getSubIndex(), new Object_UnpoweredMonitor2().getSubIndex()));
            add(ic("小电梯1").tc(), new Object_SmallElevatorInTechnicalDepartment1());
            add(ic("小电梯2"), new Object_SmallElevatorInTechnicalDepartment2());
            add(ic("大电梯"), new Object_ProductElevator());
            add(ic("后门"), new Map_BackRoomTechnicalDepartment());
            add(ic("小门"), new Object_SmallDoorInTechnicalDepartment());
            add(ic("检查小巧的机器"), new Object_CardAndPanelActivator());
        }};
    }

    @Override
    public CardPrinter printer() {
        return new NormalCard() {
            @Override
            public tbcbuild.cardGenerator.InteractiveList fpIl() {
                return new tbcbuild.cardGenerator.InteractiveList() {{
                    add(InteractiveChoice.ic("Exploring Messy Papers on the Floor"), new FilesInTechnicalDepartment().getReferName());
                    add(InteractiveChoice.ic("Monitor 1").tc(), ro(new Object_UnpoweredMonitor1().getMainIndex(), new Object_UnpoweredMonitor1().getSubIndex(), new Object_UnpoweredMonitor2().getSubIndex()).getReferName());
                    add(InteractiveChoice.ic("Monitor 2").tc(), ro(new Object_UnpoweredMonitor1().getMainIndex(), new Object_UnpoweredMonitor1().getSubIndex(), new Object_UnpoweredMonitor2().getSubIndex()).getReferName());
                    add(InteractiveChoice.ic("Monitor 3"), ro(new Object_UnpoweredMonitor1().getMainIndex(), new Object_UnpoweredMonitor1().getSubIndex(), new Object_UnpoweredMonitor2().getSubIndex()).getReferName());
                    add(InteractiveChoice.ic("Monitor 4").tc(), ro(new Object_UnpoweredMonitor1().getMainIndex(), new Object_UnpoweredMonitor1().getSubIndex(), new Object_UnpoweredMonitor2().getSubIndex()).getReferName());
                    add(InteractiveChoice.ic("Monitor 5").tc(), ro(new Object_UnpoweredMonitor1().getMainIndex(), new Object_UnpoweredMonitor1().getSubIndex(), new Object_UnpoweredMonitor2().getSubIndex()).getReferName());
                    add(InteractiveChoice.ic("Monitor 6").tc(), ro(new Object_UnpoweredMonitor1().getMainIndex(), new Object_UnpoweredMonitor1().getSubIndex(), new Object_UnpoweredMonitor2().getSubIndex()).getReferName());
                    add(InteractiveChoice.ic("Small elevator 1").tc(), new Object_SmallElevatorInTechnicalDepartment1());
                    add(InteractiveChoice.ic("Small elevator 2"), new Object_SmallElevatorInTechnicalDepartment2());
                    add(InteractiveChoice.ic("Big Elevator"), new Object_ProductElevator());
                    add(InteractiveChoice.ic("Backdoor"), new Map_BackRoomTechnicalDepartment());
                    add(InteractiveChoice.ic("Small Gate"), new Object_SmallDoorInTechnicalDepartment());
                    add(InteractiveChoice.ic("Check the compact machine"), new Object_CardAndPanelActivator());
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
                return "You open the door, and a stench hits you. The office is very messy. The carpeted floor was littered with papers, bags, dust, and footprints. All the lights hanging from the ceiling went out, and one even broke in the middle, hanging from the roof on both sides.\n" +
                        "The walls here are different from the resuscitation center. The walls are black, but feel a bit like glass. There was a circular hole in the wall directly in front of it that seemed to have been caused by a heavy blow with a hammer, and a crack appeared in the middle, extending in all directions. You are more certain that this is a glass wall conjecture. There are two small elevators and one large elevator on the left wall from near to far. There are also two closed doors ahead and on the right.\n" +
                        "Inside the office sits three rows of white desks. It was full of displays, some flipped over on the table, or fell to the ground. Behind the table are messy seating. In the back of the office, there are 9 monitors placed regularly, which seem to be used to broadcast surveillance.\n" +
                        "Next to the monitoring, there is a relatively small machine";
            }
        };
    }
}
