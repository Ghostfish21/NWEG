package tbcbuild.card.level2;

import tbcbuild.base.Obtainable;
import tbcbuild.cardGenerator.InteractiveList;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.FindingCard;

public class Finding_BackDoorNotResponding extends FindingCard implements Printer {
    public Finding_BackDoorNotResponding(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Finding_BackDoorNotResponding() {
        super();
    }

    @Override
    public String description() {
        return "你将身份卡放到了感应板上方，可是等了好几秒，还是没有任何动静。";
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
                return "You put your ID card on top of the sensor board, and you wait for several seconds, but nothing happens.";
            }
        };
    }
}
