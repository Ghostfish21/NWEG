package tbcbuild.card.level2;

import tbcbuild.cardGenerator.InteractiveList;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.ItemCard;

public class Gear_Happiness extends ItemCard implements Printer {
    @Override
    public String description() {
        return "小型齿轮 - 快乐\n" +
                "\n" +
                "这是一个精致的小型齿轮。\n" +
                "\n" +
                "神奇的是，与其他物件不同，它的表面十分的干净，好像永远也落不上灰尘一样，同时也找不到任何的磨损。\n" +
                "你试着将地上的一片毛絮撒了上去，它竟然自己被吹开了，最后又落回到了地面上\n" +
                "\n" +
                "它上面刻印着优雅的花纹，在齿轮中间，斜着印着两个圆圈。两个圆圈正前方，有一条令人感到舒适无比的U型曲线。他们在一起构成了一个代表着开心的笑脸。整体重量不轻不重，你觉得惦着的手感刚刚好";
    }

    public Gear_Happiness(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Gear_Happiness() {
        super();
    }

    @Override
    public int space() {
        return 1;
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
                return "Occupies 1\n" +
                        "\n" +
                        "Small Gear - Happy\n" +
                        "\n" +
                        "It's a delicate little gear.\n" +
                        "\n" +
                        "The magic is that, unlike other objects, its surface is very clean, as if it will never fall on dust, and at the same time, there is no wear and tear.\n" +
                        "You tried to scatter a piece of fluff on the ground, it was blown away by itself, and finally fell back to the ground\n" +
                        "\n" +
                        "It is engraved with an elegant pattern, and in the middle of the gear, two circles are printed diagonally. In front of the two circles, there is a very comfortable U-shaped curve. Together they form a happy smiley face. The overall weight is neither too light nor too heavy, and you feel that it feels just nice";
            }
        };
    }
}
