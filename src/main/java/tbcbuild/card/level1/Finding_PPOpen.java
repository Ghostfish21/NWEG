package tbcbuild.card.level1;

import tbcbuild.base.Explorable;
import tbcbuild.base.InteractiveChoice;
import tbcbuild.base.InteractiveList;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.FindingCard;

import static tbcbuild.base.InteractiveChoice.ic;

public class Finding_PPOpen extends FindingCard implements Explorable, Printer {
    public Finding_PPOpen(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Finding_PPOpen() {
        super();
    }

    @Override
    public String description() {
        return "在你的不懈努力下，个人面板奇迹般地开机了。\n" +
                "惊喜之余，你余光看到平板右上角显示只剩6%的电量。\n" +
                "平板被原主人设下了数字密码，必须快点做点什么才行";
    }


    @Override
    public InteractiveList interactiveList() {
        return new InteractiveList(){{
            add(ic("尝试解锁面板").tc(), new Question_PasswordPP());
        }};
    }

    @Override
    public CardPrinter printer() {
        return new NormalCard() {
            @Override
            public tbcbuild.cardGenerator.InteractiveList fpIl() {
                return new tbcbuild.cardGenerator.InteractiveList(){{
                    add(tbcbuild.cardGenerator.InteractiveChoice.ic("Try to unlock the panel").tc(), new Question_PasswordPP());
                }};
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
                return "Thanks to your tireless efforts, the Personal Panel miraculously turned on.\n" +
                        "In addition to the surprise, out of the corner of your eye, you see that the upper right corner of the tablet shows that only 6% of the battery is left.\n" +
                        "The tablet was set with a digital password by the original owner, and something must be done quickly, you think.";
            }
        };
    }
}
