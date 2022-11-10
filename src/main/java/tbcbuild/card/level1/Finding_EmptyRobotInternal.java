package tbcbuild.card.level1;

import tbcbuild.cardGenerator.InteractiveList;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.InfoedNormalCard;
import tbcbuild.cardType.FindingCard;
import tbcbuild.base.InfoCarrier;

public class Finding_EmptyRobotInternal extends FindingCard implements InfoCarrier, Printer {
    @Override
    public String description() {
        return "这是机器人机箱的内部，里面有两个空着的槽位。";
    }

    public Finding_EmptyRobotInternal(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Finding_EmptyRobotInternal() {
        super();
    }

    @Override
    public String carriedInfo() {
        return "0 _ _ _ _ _ _ _ _ _ Card";
    }

    @Override
    public CardPrinter printer() {
        return new InfoedNormalCard() {
            @Override
            public String getCarriedInfo() {
                return carriedInfo();
            }

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
                return "This is the inside of the robot case, which has two empty slots.";
            }
        };
    }
}
