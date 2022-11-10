package tbcbuild.card.level1;

import tbcbuild.cardGenerator.InteractiveList;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.FindingCard;

public class Finding_InteractPadNotResponding extends FindingCard implements Printer {
    public Finding_InteractPadNotResponding(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Finding_InteractPadNotResponding() {
        super();
    }

    @Override
    public String description() {
        return "你发现门上有一块小小的显示屏，虽然心里不保有太大的期望，但是你还是试着点击了它。果然，正如你所预料一般，显示屏没有产生任何反应";
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
                return "You find a small screen on the door and, without much expectation, you try to click on it. Sure enough, as you might expect, the screen isn't responding.";
            }
        };
    }
}
