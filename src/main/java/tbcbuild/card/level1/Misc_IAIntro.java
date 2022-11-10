package tbcbuild.card.level1;

import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardType.MiscCard;
import tbcbuild.specialText.friendIA.InteractBook_IA;

import static tbcbuild.Util.obtainSt;

public class Misc_IAIntro extends MiscCard implements Printer {

    public Misc_IAIntro(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Misc_IAIntro() {
        super();
    }

    @Override
    public String description() {
        return "请不要翻到本卡牌背面，或者打开本卡牌\n" +
                "\n" +
                "卡牌内：\n" +
                "\n" +
                "我：亦亚？你是...？复苏中心的机器人吗？\n" +
                "\n" +
                "亦亚：我不是。不对，我是！哎不对不对，那个机器人只是一个普普通通的终端，它是亦亚，但是不是我！如果基地的网络系统还在运转的话，我倒是可以过去啦\n" +
                "\n" +
                "我：怪不得，费了我好大功夫才把复苏中心的机器人打开，结果什么有用的信息都没得到。当时还在琢磨怎么开启高级AI模式呢\n" +
                "\n" +
                "亦亚：对，那样的话我就可以提前和你见面了。无论如何，我们现在都认识啦\n" +
                "\n" +
                obtainSt(true, new InteractBook_IA());
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
                return "You: IA? Are you... ? The robot at the resuscitation center?\n" +
                        "\n" +
                        "IA: I am not. No, I am! Wait, no, ummm, that robot is just an ordinary terminal. It's IA, but it's not me! If the base's network is still up and running, I can get there\n" +
                        "\n" +
                        "You: No wonder I struggled to turn on the robot, but I didn't get any useful information. At tha moment I was still trying to figure out how to turn on advanced AI mode\n" +
                        "\n" +
                        "IA: Yep, that way I can see you earlier. Anyway, we all know each other now, right?\n" +
                        "\n粗" +
                        obtainSt(true, new InteractBook_IA());
            }
        };
    }
}
