package tbcbuild.card.level2;

import tbcbuild.cardGenerator.InteractiveList;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.FindingCard;

import static tbcbuild.Util.obtain;

public class Finding_ElevatorMightNotOpen extends FindingCard implements Printer {
    public Finding_ElevatorMightNotOpen(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Finding_ElevatorMightNotOpen() {
        super();
    }

    @Override
    public String description() {
        return "如果玩家当前没有已经激活的身份卡和面板，则\n\n" +
                "你拼尽全力试图掰开电梯的门，但是电梯却纹丝不动\n\n" +
                "否则，" + obtain(true, new Finding_ElevatorOpened());
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
                return "If the player does not currently have an active ID card and panel, then\n\n" +
                        "You try as hard as you can to open the elevator door, but the elevator won't budge\n\n" +
                        "Otherwise if player own these items, 粗" + obtain(true, new Finding_ElevatorOpened());
            }
        };
    }
}
