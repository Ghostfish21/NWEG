package tbcbuild.card.level2;

import tbcbuild.cardGenerator.InteractiveList;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.ItemCard;

public class Item_P11 extends ItemCard implements Printer {
    @Override
    public String description() {
        return "作为老牌的手枪，P11在江心研究所和晨曦研究所的共同努力下，魔改了击发能量弹药的版本。P11手炮使用小型能量匣，远距离模式每击发500焦，总共10发。近距离模式每击发250焦耳，总共20发。配备六块小型冷却罐，支持手炮在每秒三发下运作五分钟。\n" +
                "手枪总重0.8 kg，可选单点和全自动模式\n" +
                "推荐携带三组能量匣与小型冷却罐";
    }

    public Item_P11(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Item_P11() {
        super();
    }

    @Override
    public int space() {
        return 3;
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
                return "Occupies 3\n" +
                        "\n" +
                        "As an old-fashioned pistol, with the joint efforts of Jiangxin Research Institute and Chenxi Research Institute, P11 has modified the version of firing energy ammunition. The P11 hand gun uses a small energy box, and the long-range mode fires 500 joules per shot, for a total of 10 rounds. Close-range mode has 250 joules per shot for a total of 20 shots. Equipped with six small cooling tanks, the hand cannon can operate at three rounds per second for five minutes.\n" +
                        "The total weight of the pistol is 0.8 kg, and the single-point and fully automatic modes are optional\n" +
                        "It is recommended to carry three sets of energy boxes and small cooling tanks";
            }
        };
    }
}
