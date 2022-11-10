package tbcbuild.card.level1;

import tbcbuild.cardGenerator.InteractiveList;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.FindingCard;

public class Finding_BloodedGate extends FindingCard implements Printer {
    public Finding_BloodedGate(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Finding_BloodedGate() {
        super();
    }

    @Override
    public String description() {
        return "你很快就在冬眠仓外找到了斑斑的血迹，他们一直延申到火种复苏中心的大门口\n" +
                "血迹是滴落的，不是拖拽的\n" +
                "这里以前似乎发生过什么流血事件。";
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
                return "Sooner, you find a trail of blood outside the hibernation chamber, all the way to the gate of the anabosis center\n" +
                        "\n" +
                        "The blood was dripped, not dragged\n" +
                        "\n" +
                        "There seems to have been some bloodshed here before.";
            }
        };
    }
}
