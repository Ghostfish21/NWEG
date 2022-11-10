package tbcbuild.card.level1;

import tbcbuild.cardGenerator.InteractiveChoice;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.MapCard;
import tbcbuild.base.InteractiveList;
import tbcbuild.card.level1.Object_HibernateTank.*;

import static tbcbuild.base.InteractiveChoice.ic;

public class Map_FireSeedAnabiosisCenter extends MapCard implements Printer {

    public Map_FireSeedAnabiosisCenter(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Map_FireSeedAnabiosisCenter() {
        super();
    }

    @Override
    public String description() {
        return "这是一个圆形的大厅，大厅内整齐的摆放着16台冬眠仓，每台冬眠舱上都有一个数字编号，而你的是醒来的冬眠舱是09号。\n" +
                "这些冬眠仓呈辐射状放置，冬眠仓指向的中心，是一个原型的前台。前台的后面，是这个大厅的大门。\n" +
                "虽然光线很暗，但是你凑近了看，发现大厅的地板，墙面，似乎都是瓷质的。地板的表面如同你自己的冬眠仓一样，布满着薄薄的一层灰尘。";
    }

    @Override
    public InteractiveList interactiveList() {
        InteractiveList choices = new InteractiveList();
        choices.add(ic("复苏中心前台"), new Object_HelpDesk());
        choices.add(ic("冬眠舱1").tc(), new Object_HibernateTank_01());
        choices.add(ic("冬眠舱2", true), new Object_HibernateTank_02Battery());
        choices.add(ic("冬眠舱3"), new Object_HibernateTank_03());
        choices.add(ic("冬眠舱4", true), new Object_HibernateTank_04PrivateSpace());
        choices.add(ic("冬眠舱5"), new Object_HibernateTank_05());
        choices.add(ic("冬眠舱6").tc(), new Object_HibernateTank_06());
        choices.add(ic("冬眠舱7"), new Object_HibernateTank_07());
        choices.add(ic("冬眠舱8"), new Object_HibernateTank_08());
        choices.add(ic("冬眠舱9"), new Object_HibernateTank_09());
        choices.add(ic("冬眠舱10").tc(), new Object_HibernateTank_10());
        choices.add(ic("冬眠舱11", true), new Object_HibernateTank_11());
        choices.add(ic("冬眠舱12").tc(), new Object_HibernateTank_12());
        choices.add(ic("冬眠舱13", true), new Object_HibernateTank_13ScrewDriver());
        choices.add(ic("冬眠舱14"), new Object_HibernateTank_14());
        choices.add(ic("冬眠舱15").tc(), new Object_HibernateTank_15());
        choices.add(ic("冬眠舱16"), new Object_HibernateTank_16());
        choices.add(ic("紧急通道"), new Object_EmergencyExit());
        choices.add(ic("大电梯"), new Object_QuickResponseElevator());
        choices.add(ic("复苏中心正门").tc(), new Object_AnabiosisGate());
        choices.add(ic("不起眼的小门"), new Object_ElectricWellDoor());
        return choices;
    }

    @Override
    public CardPrinter printer() {
        return new NormalCard() {
            @Override
            public tbcbuild.cardGenerator.InteractiveList fpIl() {
                tbcbuild.cardGenerator.InteractiveList choices = new tbcbuild.cardGenerator.InteractiveList();
                choices.add(InteractiveChoice.ic("Anabosis center help desk"), new Object_HelpDesk());
                choices.add(InteractiveChoice.ic("Hibernate tank 01").tc(), new Object_HibernateTank_01());
                choices.add(InteractiveChoice.ic("Hibernate tank 02", true), new Object_HibernateTank_02Battery());
                choices.add(InteractiveChoice.ic("Hibernate tank 03"), new Object_HibernateTank_03());
                choices.add(InteractiveChoice.ic("Hibernate tank 04", true), new Object_HibernateTank_04PrivateSpace());
                choices.add(InteractiveChoice.ic("Hibernate tank 05"), new Object_HibernateTank_05());
                choices.add(InteractiveChoice.ic("Hibernate tank 06").tc(), new Object_HibernateTank_06());
                choices.add(InteractiveChoice.ic("Hibernate tank 07"), new Object_HibernateTank_07());
                choices.add(InteractiveChoice.ic("Hibernate tank 08"), new Object_HibernateTank_08());
                choices.add(InteractiveChoice.ic("Hibernate tank 09"), new Object_HibernateTank_09());
                choices.add(InteractiveChoice.ic("Hibernate tank 10").tc(), new Object_HibernateTank_10());
                choices.add(InteractiveChoice.ic("Hibernate tank 11", true), new Object_HibernateTank_11());
                choices.add(InteractiveChoice.ic("Hibernate tank 12").tc(), new Object_HibernateTank_12());
                choices.add(InteractiveChoice.ic("Hibernate tank 13", true), new Object_HibernateTank_13ScrewDriver());
                choices.add(InteractiveChoice.ic("Hibernate tank 14"), new Object_HibernateTank_14());
                choices.add(InteractiveChoice.ic("Hibernate tank 15").tc(), new Object_HibernateTank_15());
                choices.add(InteractiveChoice.ic("Hibernate tank 16"), new Object_HibernateTank_16());
                choices.add(InteractiveChoice.ic("Emergency channel"), new Object_EmergencyExit());
                choices.add(InteractiveChoice.ic("Large elevator"), new Object_QuickResponseElevator());
                choices.add(InteractiveChoice.ic("Anabosis center front gate").tc(), new Object_AnabiosisGate());
                choices.add(InteractiveChoice.ic("Unimpressive small door"), new Object_ElectricWellDoor());
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
                return "This is a circular hall. Within the hall, there are 16 hibernation tank neatly sit above the ground. You wake up at tank 09.\n" +
                        "These tanks were placed radiatedly. They points to the center of this space, a round help desk. Behind the help desk is the main entrance of the hall.\n" +
                        "Although it is dark, you found that the wall and floor is made of porcelain after observe closely. The surface of floor and your hibernation tank are the same, they all have a thinnish layer of dust lay upon them.";
            }
        };
    }
}
