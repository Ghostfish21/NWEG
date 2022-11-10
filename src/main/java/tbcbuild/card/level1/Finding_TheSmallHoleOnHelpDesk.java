package tbcbuild.card.level1;

import tbcbuild.cardGenerator.InteractiveList;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.FindingCard;

import static tbcbuild.Util.obtain;

public class Finding_TheSmallHoleOnHelpDesk extends FindingCard implements Printer {
    public Finding_TheSmallHoleOnHelpDesk(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Finding_TheSmallHoleOnHelpDesk() {
        super();
    }

    @Override
    public String description() {
        return "小洞里面很黑，你只能看到有很多电线纠缠在一起，他们似乎连接着其他地方\n" +
                "\n" +
                "请投掷一个 1d6 的骰子，如果点数小于等于3，则" +
                obtain(true, new OO1_EyeBall(), new Gear_Pray()) +
                "如果没有摇到，可以做一个解谜，成功后可获得这两卡卡片，请获得解密卡 -> " + obtain(true, new Question_PuzzleCalender());
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
                return "It was dark inside the hole, and all you could see was a lot of wires tangled together, and they seemed to be connecting somewhere else\n" +
                        "\n" +
                        "Please draw a 1d6 die. If the number is smaller or equal to 3, then 粗" +
                        obtain(true, new OO1_EyeBall(), new Gear_Pray()) +
                        "细If you failed, you still can do a puzzle to get the two cards. Here is the puzzle -> 粗" + obtain(true, new Question_PuzzleCalender());
            }
        };
    }
}
