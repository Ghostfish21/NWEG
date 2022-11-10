package tbcbuild.card.level1;

import tbcbuild.cardGenerator.InteractiveList;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.FindingCard;

import static tbcbuild.Util.obtain;

public class Finding_DismountableLid extends FindingCard implements Printer {
    public Finding_DismountableLid(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Finding_DismountableLid() {
        super();
    }

    @Override
    public String description() {
        return "机器人背后有一个可拆卸的钢板。在持有 螺丝刀 "+new Item_ScrewDriver().c()+" 的前提下，可以花费 3/体质点 点体力拆开钢板，" +
                obtain(true, new Item_UnbrokenMetalBoard(), new Finding_RobotInternal());
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
                return "The robot has a detachable steel plate on the back. With a 粗screwdriver细 in hand, you can take apart the steel plate with 3 points of physical power, then 粗" +
                        obtain(true, new Item_UnbrokenMetalBoard(), new Finding_RobotInternal());
            }
        };
    }
}
