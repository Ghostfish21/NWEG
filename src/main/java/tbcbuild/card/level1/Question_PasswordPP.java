package tbcbuild.card.level1;

import tbcbuild.cardGenerator.InteractiveList;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.Card;
import tbcbuild.cardType.CateCard;
import tbcbuild.cardType.QuestionCard;

import java.util.HashMap;

public class Question_PasswordPP extends QuestionCard implements Printer {
    @Override
    public String description() {
        return "平板电脑被原主人设下了密码\n" +
                "你只有五次尝试的机会，五次答案未能验证通过的话\n" +
                "电脑在耗尽电量前都将被锁定。请遵守游戏规则哦";
    }

    public Question_PasswordPP(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Question_PasswordPP() {
        super();
    }

    @Override
    public String correctAnswer() {
        return "密码是两组以3结尾的四位数\n" +
                "相乘后等于 80931669";
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
                return "The tablet has a password set by the original owner\n" +
                        "You only have five chances to try, if the answer fails to pass five times\n" +
                        "The computer will be locked until it runs out of power. Please follow the rules of the game\n" +
                        "\n" +
                        "The password is two sets of four digits ending in 3\n" +
                        "Multiplied to equal 80931669";
            }
        };
    }
}
