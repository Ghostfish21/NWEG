package tbcbuild.card.level2;

import tbcbuild.cardGenerator.InteractiveList;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.Card;
import tbcbuild.cardType.FindingCard;

public class Object_DoorToCafeteriaAtN1 extends FindingCard implements Printer {
    public Object_DoorToCafeteriaAtN1(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Object_DoorToCafeteriaAtN1() {
        super();
    }

    @Override
    public String description() {
        return "这个门和其他门长得并没有什么不一样，但是门上被划了一个大大的红叉，红叉下面还盖着几个已经发黑的血手印。这里曾经发生过一些可怕的事情\n" +
                "你好不容易找到了落手的地方，但是门拉不开";
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
                return "This door looks no different from other doors, but there is a big red cross on the door, and there are several blackened bloody hand-prints under the red cross. Some terrible things have happened here\n" +
                        "You finally found a place to drop your hand, but the door can't be opened";
            }
        };
    }
}
