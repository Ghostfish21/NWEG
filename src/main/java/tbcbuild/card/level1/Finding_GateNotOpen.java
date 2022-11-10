package tbcbuild.card.level1;

import tbcbuild.cardGenerator.InteractiveList;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.FindingCard;

public class Finding_GateNotOpen extends FindingCard implements Printer {
    public Finding_GateNotOpen(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Finding_GateNotOpen() {
        super();
    }

    @Override
    public String description() {
        return "你耗费了两点体力，拼尽全力的想要打开大门。可是大门却纹丝不动的立在原地";
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
                return "You spend two points of your physical power and tried to open the door. But the gate stood still.";
            }
        };
    }
}
