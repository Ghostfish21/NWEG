package tbcbuild.card.level1;

import tbcbuild.cardGenerator.InteractiveList;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.QuestionCard;

import java.util.HashMap;

public class Question_PuzzleCalender extends QuestionCard implements Printer {
    public Question_PuzzleCalender(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Question_PuzzleCalender() {
        super();
    }

    @Override
    public String correctAnswer() {
        return "可以自行验证。本题有至少两个解";
    }

    @Override
    public HashMap<String, String> answers() {
        return null;
    }

    @Override
    public String description() {
        return "有两个六面全白的骰子，你可以在骰子上写下任何阿拉伯数字\n" +
                "请问当两个骰子上分别是什么数字时，\n" +
                "将这两个骰子并排摆在一起时，可以组合出1-12月内所有可能出现的天数？";
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
                return "There are two six-sides white dice. You can write any arabic number on any side\n" +
                        "Could you please tell me how would you fill in the 12 faces, \n" +
                        "so that when you put these dices together side by side, you can make combination of any possible date from January to December?\n\n" +
                        "\nYou can verify the your answer by yourself. There are at least two solutions to this puzzle.";
            }
        };
    }
}
