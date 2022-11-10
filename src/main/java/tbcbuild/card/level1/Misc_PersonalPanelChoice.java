package tbcbuild.card.level1;

import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardType.MiscCard;

public class Misc_PersonalPanelChoice extends MiscCard implements Printer {
    public Misc_PersonalPanelChoice(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Misc_PersonalPanelChoice() {
        super();
    }

    @Override
    public String description() {
        return "个人面板？复苏中心的机器人也说过这个，我记得里面还有一台已经没电了的面板。我们可以直接去拿那个！";
    }

    @Override
    public CardPrinter printer() {
        return new tbcbuild.cardGenerator.card.MiscCard() {
            @Override
            public String fengMianDescription() {
                return "Please do not open this card, unless other cards explicitly require to do so";
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
                return "A personal panel? The robot at the anabosis center said the same thing, and I think there is a personal panel in there. We can just go get that one!";
            }
        };
    }
}
