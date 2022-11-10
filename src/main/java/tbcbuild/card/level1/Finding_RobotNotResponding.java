package tbcbuild.card.level1;

import tbcbuild.cardGenerator.InteractiveList;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.FindingCard;

public class Finding_RobotNotResponding extends FindingCard implements Printer {
    public Finding_RobotNotResponding(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Finding_RobotNotResponding() {
        super();
    }

    @Override
    public String description() {
        return "你将电源线插入了机器人的腰上。但是无事发生，指示灯也没有亮";
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
                return "You plug the cable into the robot's waist. But the light didn't go on and nothing happens";
            }
        };
    }
}
