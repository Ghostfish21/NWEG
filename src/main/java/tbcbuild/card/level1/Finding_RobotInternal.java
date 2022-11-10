package tbcbuild.card.level1;

import tbcbuild.cardGenerator.InteractiveList;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.FindingCard;

import static tbcbuild.Util.obtain;

public class Finding_RobotInternal extends FindingCard implements Printer {
    public Finding_RobotInternal(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Finding_RobotInternal() {
        super();
    }

    @Override
    public String description() {
        return "这是机器人机箱的内部，里面有两块可以拆卸下来的黑机匣。花费1点体力可以把他们拆下来，那么\n" +
                obtain(true, new Item_BoxBattery_Unpowered(), new Item_BoxBattery_Unpowered(), new Finding_EmptyRobotInternal());
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
                return "This is the inside of the robot case, which contains two black boxes that can be removed.\n粗" +
                        obtain(true, new Item_BoxBattery_Unpowered(), new Item_BoxBattery_Unpowered(), new Finding_EmptyRobotInternal());
            }
        };
    }
}
