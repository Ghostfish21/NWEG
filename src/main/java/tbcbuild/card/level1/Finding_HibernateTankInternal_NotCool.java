package tbcbuild.card.level1;

import tbcbuild.cardGenerator.InteractiveList;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.FindingCard;

import static tbcbuild.Util.obtain;

public class Finding_HibernateTankInternal_NotCool extends FindingCard implements Printer {
    public Finding_HibernateTankInternal_NotCool(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Finding_HibernateTankInternal_NotCool() {
        super();
    }

    @Override
    public String description() {
        return "冬眠舱内黑乎乎的，你扫了一眼，在里面看到了三块可以拆下来的东西。有两个长得一样，是长方体的黑盒子，剩下的是个电脑机箱那样大的银灰色桶\n" +
                "\n" +
                "你可以花费 1/体质点 点体力将他们拆下来，那么" +
                obtain(true, new Item_BoxBattery_Unpowered(), new Item_BoxBattery_Unpowered(), new Object_CoolDownTank_Unfilled());
    }

    @Override
    public CardPrinter printer() {
        return new NormalCard() {
            @Override
            public InteractiveList fpIl() {
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
                return "The hibernating chamber is dark. You glance at it and see three pieces that can be removed. There were two of the same size, cuboid black boxes, and the rest was a silver-gray bucket the size of a computer case\n" +
                        "\n" +
                        "You can take them down with 1 physical power, then 粗" +
                        obtain(true, new Item_BoxBattery_Unpowered(), new Item_BoxBattery_Unpowered(), new Object_CoolDownTank_Unfilled());
            }
        };
    }
}
