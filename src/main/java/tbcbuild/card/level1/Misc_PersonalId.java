package tbcbuild.card.level1;

import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardType.MiscCard;
import tbcbuild.specialText.friendIA.InteractBook_IA;

import static tbcbuild.Util.obtainSt;

public class Misc_PersonalId extends MiscCard implements Printer {
    public Misc_PersonalId(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Misc_PersonalId() {
        super();
    }

    @Override
    public String description() {
        return "身份卡？我记得复苏中心有个快反专用的大电梯，应该就是那个吧？";
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
                return "Identity card? I think the anabosis center has a large elevator which requires the ID, right?";
            }
        };
    }
}
