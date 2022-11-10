package tbcbuild.card.level1;

import tbcbuild.cardGenerator.InteractiveList;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.FindingCard;

import static tbcbuild.Util.obtain;

public class Finding_ElevatorInternal extends FindingCard implements Printer {
    public Finding_ElevatorInternal(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Finding_ElevatorInternal() {
        super();
    }

    @Override
    public String description() {
        return "你运气很好。电梯门成功的被打开了，而且电梯正好在你面前停着。\n" +
                "里面和外面一样，都是黑漆漆的。一具尸体躺在里面，尸体几乎没有腐烂，你清楚的看到了他脸上的表情\n" +
                "那是一种恐惧与悲哀混合在一起的表情。\n" +
                "尸体身上身着这青色的制服，制服上印着象征着万物互联的球形标志，下面印着技术部这三个小字\n" +
                "logo下面，是这套服装主人的名字：陈建华\n" +
                "奇怪的是，尸体上并没有看到伤口\n" +
                "\n" +
                "你搜索了一下尸体，" + obtain(true, new Finding_Password(), new OO1_Letter(), new Gear_Desire());
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
                return "You're quite lucky. The door successfully opens and the elevator docks right in front of you.\n" +
                        "It was as dark inside as it was outside. There was a body lying inside, barely decomposed, and you could see the expression on his face\n" +
                        "It was a mixture of fear and sorrow.\n" +
                        "The body was dressed in this cyan uniform, with a spherical symbol for the Internet-connects-everything, and the words \"Technical Department\" printed below\n" +
                        "Then, is the name of the owner of this costume: Chen Jianhua\n" +
                        "Strangely, there were no visible wounds on the body\n" +
                        "\n" +
                        "You did a search on the body, 粗" + obtain(true, new Finding_Password(), new OO1_Letter(), new Gear_Desire());
            }
        };
    }
}
