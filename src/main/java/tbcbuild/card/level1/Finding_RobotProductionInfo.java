package tbcbuild.card.level1;

import tbcbuild.cardGenerator.InteractiveList;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.FindingCard;

import static tbcbuild.Util.obtain;

public class Finding_RobotProductionInfo extends FindingCard implements Printer {

    public Finding_RobotProductionInfo(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Finding_RobotProductionInfo() {
        super();
    }

    @Override
    public String description() {
        return "亦亚智能机器人\n" +
                "IA-II-A\n" +
                "2155-5-23\n" +
                "远山工业集团 www.yuanshan.com\n" +
                "\n" +
                "服务热线：401-1588265548368\n" +
                "质检编号：4577-8245-3486-154-UKCS\n" +
                "产品审批号：54011103粤\n" +
                "\n" +
                "如果没有该卡牌，" + obtain(true, new Misc_IAIntro());
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
                return "IA intelligent robot\n" +
                        "IA-II-A\n" +
                        "2155-5-23\n" +
                        "China Yuanshan Industry Group www.yuanshan.com\n" +
                        "\n" +
                        "Service hotline：401-1588265548368\n" +
                        "Quality inspection ID：4577-8245-3486-154-UKCS\n" +
                        "Product approval number：54011103Yue\n" +
                        "\n" +
                        "If you don't have this card, 粗" + obtain(true, new Misc_IAIntro());
            }
        };
    }
}
