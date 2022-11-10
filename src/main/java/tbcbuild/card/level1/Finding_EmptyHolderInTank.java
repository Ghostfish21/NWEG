package tbcbuild.card.level1;

import tbcbuild.cardGenerator.InteractiveList;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.FindingCard;

public class Finding_EmptyHolderInTank extends FindingCard implements Printer {
    public Finding_EmptyHolderInTank(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Finding_EmptyHolderInTank() {
        super();
    }

    @Override
    public String description() {
        return "你在冬眠仓机箱内发现了一个空着的槽位，这里以前不知道装了什么东西，可能是被当时破坏冬眠仓的人带走了";
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
                return "You found an empty slot in the dormancy case, which was previously filled with something, perhaps taken by the person who destroyed the dormancy.";
            }
        };
    }
}
