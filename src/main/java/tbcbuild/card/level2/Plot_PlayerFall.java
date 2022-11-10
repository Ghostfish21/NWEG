package tbcbuild.card.level2;

import tbcbuild.cardGenerator.InteractiveList;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.PlotCard;

public class Plot_PlayerFall extends PlotCard implements Printer {
    public Plot_PlayerFall(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Plot_PlayerFall() {
        super();
    }

    @Override
    public String description() {
        return "如果骰子的面数小于等于6，那么\n" +
                "就在你起跳的一瞬间，你感觉后面有什么东西推了你一把\n" +
                "你抬头看向电梯井的前方，人形的橙色光芒将你脸前的墙映的通红\n" +
                "在这一瞬间，齿轮的笑容和墙上的橙红光芒重合\n" +
                "\n呵呵呵\n\n" +
                "你掉了下去，随着一声重重的轰响，你砸到了地上失去了意识";
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
                return "If the number of sides of the dice is less than or equal to 6, then\n" +
                        "The moment you jump up, you feel something pushed you from behind\n" +
                        "You look up to the front, and the orange glow of the human shape makes the wall in front of your flush red\n" +
                        "At this moment, the smile of the gear overlapped with the orange-red light on the wall\n" +
                        "\n" +
                        "hahaha...\n" +
                        "\n" +
                        "You fell, and with a loud bang, you hit the ground and lost consciousness";
            }
        };
    }
}
