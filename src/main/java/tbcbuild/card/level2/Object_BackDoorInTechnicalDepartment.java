package tbcbuild.card.level2;

import tbcbuild.base.InteractiveChoice;
import tbcbuild.base.InteractiveList;
import tbcbuild.base.Obtainable;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.ObjectCard;

import static tbcbuild.base.InteractiveChoice.ic;

public class Object_BackDoorInTechnicalDepartment extends ObjectCard implements Printer {
    public Object_BackDoorInTechnicalDepartment(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Object_BackDoorInTechnicalDepartment() {
        super();
    }

    @Override
    public String description() {
        return "这是一扇白色的铁门。门上能看到斑斑的血迹，看起来这个门是推动式的。\n" +
                "在门的右边有一个感应板，似乎是识别身份用的";
    }

    @Override
    public InteractiveList interactiveList() {
        return new InteractiveList() {
            @Override
            public void add(InteractiveChoice ic, Obtainable... cards) {
                super.add(ic, cards);
            }

            @Override
            public String exportText() {
                return super.exportText();
            }

            {
            add(ic("将个人身份卡放于感应板上方").tc(), new Finding_BackDoorNotResponding());
            add(ic("推开铁门"), new Map_BackRoomTechnicalDepartment());
        }};
    }

    @Override
    public CardPrinter printer() {
        return new NormalCard() {
            @Override
            public tbcbuild.cardGenerator.InteractiveList fpIl() {
                return new tbcbuild.cardGenerator.InteractiveList() {{
                    add(tbcbuild.cardGenerator.InteractiveChoice.ic("Place the personal ID card above the sensor board").tc(), new Finding_BackDoorNotResponding());
                    add(tbcbuild.cardGenerator.InteractiveChoice.ic("Push the door"), new Map_BackRoomTechnicalDepartment());
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
                return "This is a white iron door. You can see blood stains on the door. It looks like the door is pushed.\n" +
                        "\n" +
                        "To the right of the door is a sensor panel, which appears to be used for identification";
            }
        };
    }
}
