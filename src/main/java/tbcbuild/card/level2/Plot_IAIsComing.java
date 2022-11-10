package tbcbuild.card.level2;

import tbcbuild.cardGenerator.InteractiveList;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.PlotCard;

import static tbcbuild.Util.obtain;

public class Plot_IAIsComing extends PlotCard implements Printer {
    public Plot_IAIsComing(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Plot_IAIsComing() {
        super();
    }

    @Override
    public String description() {
        return "当你第一次，从任何方式离开幽暗楼梯间（不返回复苏中心，不去技术部的情况下），或者在楼梯间中移动一个楼层后，" +
                obtain(true, new Plot_IAAppears());
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
                return "Get " + new Plot_IAAppears().getReferName() + " when you exit the dark stairwell for the first time by any means (without returning to the anabosis center, or going to the technical department), or after moving one floor in the stairwell";
            }
        };
    }
}
