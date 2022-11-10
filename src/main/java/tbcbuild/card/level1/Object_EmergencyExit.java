package tbcbuild.card.level1;

import tbcbuild.card.level2.Map_DimmedStairRoom;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.ObjectCard;
import tbcbuild.base.InteractiveList;

import static tbcbuild.Util.obtain;

public class Object_EmergencyExit extends ObjectCard implements Printer {

    public Object_EmergencyExit(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Object_EmergencyExit() {
        super();
    }

    @Override
    public String description() {
        return "在大门旁边不远的地方，有一扇逃生通道的门。\n" +
                "门和大厅一样，表面十分光滑与柔和。门上有一扇小小的方形窗户，被一圈黑色的铁框镶着。奇怪的是，门上并没有把手，取而代之的是一条横着的杠。已经适应了黑暗的你，隐隐约约看到窗户后有一道淡淡的黑影，看起来像是一个头，还有脖子，但是看了好久，又觉得有些不像。\n" +
                "\n" +
                "虽然心里没有保有太大的期望，但是你还是试着推了推它。\n" +
                "门开了，" + obtain(true, new Map_DimmedStairRoom());
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
                return "There is a door connecting to the emergence channel.\n" +
                        "The door is made of the same material that made the hall. There is a small square window, embeded by a black iron frame. You have been accustomed to the dark, vaguely see a faint dark shadow behind the window, looks like a head, and neck. But after look for a long time, you think these doesn't look like a head and a neck at all.\n" +
                        "\n" +
                        "Although you aren't expecting a big finding, you tried to push it.\n" +
                        "The door is opened，粗" + obtain(true, new Map_DimmedStairRoom());
            }
        };
    }
}
