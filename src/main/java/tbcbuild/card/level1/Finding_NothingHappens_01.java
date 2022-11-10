package tbcbuild.card.level1;

import tbcbuild.cardGenerator.InteractiveList;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.FindingCard;

public class Finding_NothingHappens_01 extends FindingCard implements Printer {
    public Finding_NothingHappens_01(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Finding_NothingHappens_01() {
        super();
    }

    @Override
    public String description() {
        return "你操作了小扳手，并在旁边等了一会。在黑暗中等待显得格外的忐忑，但等了好久都没有任何事情发生";
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
                return "You switched the little wrench and waited around for a while. It is particularly uneasy to idle in the darkness, and nothing happens in a long while.";
            }
        };
    }
}
