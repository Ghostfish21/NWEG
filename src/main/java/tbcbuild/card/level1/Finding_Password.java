package tbcbuild.card.level1;

import tbcbuild.cardGenerator.InteractiveList;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.Card;
import tbcbuild.cardType.FindingCard;

public class Finding_Password extends FindingCard implements Printer {
    public Finding_Password(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Finding_Password() {
        super();
    }

    @Override
    public String description() {
        return "这是一张纸条，上面写着 05/23 09/13 只是不知道是什么。\n" +
                "可能是两个对他非常重要的日子吧";
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
                return "This is a note that writes 05/23 and 09/13. You are not sure what it is.\n" +
                        "Probably two dates that were very important to him";
            }
        };
    }
}
