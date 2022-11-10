package tbcbuild.card.level1;

import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.ObjectCard;
import tbcbuild.base.InteractiveList;

import static tbcbuild.Util.obtain;

public class Object_TheMonitorOnHelpDesk extends ObjectCard implements Printer {
    public Object_TheMonitorOnHelpDesk(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Object_TheMonitorOnHelpDesk() {
        super();
    }

    @Override
    public String description() {
        return "这是一台柜台上的电脑，你试图打开它，但是无论怎么尝试都不行。可能是因为没有电了。你盯着它盯了一会，与其说这是一台电脑，不如说这只是一台显示屏。它只有不到指尖的宽度，显示屏后面的金属架从柜台上延申出来，电线像藤蔓一般缠着铁架，一端插进了电脑中，另一端插进了桌面上的一个小洞。\n" +
                "\n" +
                "电脑背面写着：\n" +
                "LOONG\n" +
                "Gaming Monitor\n" +
                "Model NI./ JH25CW\n" +
                "Made in China\n" +
                "\n" +
                "This device compiles with section 14 of the DPM rules. Operation is subject to the following conditions:\n" +
                "(1)This device may not cause harmful interference, and (2) this device must accept any interference received, including interference that may cause undesired operation.\n" +
                "\n" +
                "Caution: Risk of electric shook. Do not break, crash, or dissemble.\n" +
                "\n" +
                "要查看小洞，" + obtain(true, new Finding_TheSmallHoleOnHelpDesk());
    }

    @Override
    public InteractiveList interactiveList() {
        return null;
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
                return null;
            }

            @Override
            public String description() {
                return "This is a computer on the counter. You try to open it, but no matter how you try, it won't work. Probably because there's no battery. You stare at it for a while. It's more of a monitor than a computer. It was less than the width of a fingertip. A metal rack behind the monitor protruding from the counter; wires wrapped around the rack like a vine; one end plugged into the computer and the other into a small hole on the desk top.\n" +
                        "\n\n\n" +
                        "LOONG\n" +
                        "Gaming Monitor\n" +
                        "Model NI./ JH25CW\n" +
                        "Made in China\n" +
                        "\n" +
                        "This device compiles with section 14 of the DPM rules. Operation is subject to the following conditions:\n" +
                        "(1)This device may not cause harmful interference, and (2) this device must accept any interference received, including interference that may cause undesired operation.\n" +
                        "\n" +
                        "Caution: Risk of electric shook. Do not break, crash, or dissemble.\n" +
                        "\n" +
                        "To check the small hole, 粗" + obtain(true, new Finding_TheSmallHoleOnHelpDesk());
            }
        };
    }
}
