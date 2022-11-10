package tbcbuild.card.level2;

import tbcbuild.cardGenerator.InteractiveList;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.QuestionCard;

import java.util.HashMap;

public class Question_Password1 extends QuestionCard implements Printer {
    @Override
    public String description() {
        return "正确答案相乘 得 141,219\n" +
                "正确答案的个数为 3\n" +
                "\n" +
                "四张卡牌，正面写着答案，答案下方写着除非确定选择本选项，否则不要看打开该卡牌。打开后能看到该卡牌对应的答案序号";
    }

    public Question_Password1(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Question_Password1() {
        super();
    }

    @Override
    public String correctAnswer() {
        return "153 923";
    }

    @Override
    public HashMap<String, String> answers() {
        return null;
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
                return "Multiply the two correct answers to get 141,219\n" +
                        "The number of each correct answer end with 3";
            }
        };
    }
}
