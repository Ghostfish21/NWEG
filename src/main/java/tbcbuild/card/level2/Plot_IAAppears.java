package tbcbuild.card.level2;

import tbcbuild.card.level1.Misc_IAIntro;
import tbcbuild.cardGenerator.InteractiveList;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.PlotCard;
import tbcbuild.specialText.friendIA.InteractBook_IA;

import static tbcbuild.Util.obtainSt;

public class Plot_IAAppears extends PlotCard implements Printer {
    public Plot_IAAppears(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Plot_IAAppears() {
        super();
    }

    @Override
    public String description() {
        return "你正走着，突然，一个小巧的，带着小翅膀的机器人突然飞到你面前。\n" +
                "\n" +
                "呀，嗨！你好，终于找到你了！\n" +
                "初次见面，我叫亦亚！你也可以叫我艾A\n" +
                "\n" +
                "如果玩家持有 " + new Misc_IAIntro().getReferName() + "，请打开。\n" +
                "如果没有，请翻到卡牌背面\n" +
                "\n" +
                "我：哇？！？！你吓我一跳！\n" +
                "亦...亚？你好，你是？\n" +
                obtainSt(true, new InteractBook_IA());
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
                return "You were walking when suddenly a small robot with tiny wings flew right in front of you.\n" +
                        "\n" +
                        "Ya, hi! Hello, finally found you!\n" +
                        "For the first time, my name is Yiya! You can also call me IA\n" +
                        "\n" +
                        "Open if the player has a 粗" + new Misc_IAIntro().getReferName() + "细.\n" +
                        "If not, turn to the back of the card\n" +
                        "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" +
                        "Me: Wow? ! ? ! You startle me!\n" +
                        "Yi...ya? Hello, you are?粗\n" +
                        obtainSt(true, new InteractBook_IA());
            }
        };
    }
}
