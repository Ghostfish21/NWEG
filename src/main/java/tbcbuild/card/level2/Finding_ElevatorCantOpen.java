package tbcbuild.card.level2;

import tbcbuild.base.Obtainable;
import tbcbuild.cardGenerator.InteractiveList;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.FindingCard;

public class Finding_ElevatorCantOpen extends FindingCard implements Printer {
    public Finding_ElevatorCantOpen(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Finding_ElevatorCantOpen() {
        super();
    }

    @Override
    public String description() {
        return "你用尽了全身的力气，但是可惜的是，电梯的门好像再断电前被锁死了，完全打不开";
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
                return "You have exhausted all your strength, but unfortunately, the elevator door seems to be locked before the power is cut off and cannot be opened at all.";
            }
        };
    }
}
