package tbcbuild.card.level1;

import tbcbuild.cardGenerator.InteractiveList;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.FindingCard;

public class Finding_ElevatorNotResponding extends FindingCard implements Printer {
    public Finding_ElevatorNotResponding(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Finding_ElevatorNotResponding() {
        super();
    }

    @Override
    public String description() {
        return "按钮没有任何反应。可能是没电了，你想。也可能是需要刷卡";
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
                return "The button isn't responding. Maybe the battery's out. Or maybe it requires to scan something, like an ID card, you thought";
            }
        };
    }
}
