package tbcbuild.card.level1;

import tbcbuild.cardGenerator.InteractiveList;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.ItemCard;

public class Gear_Pray extends ItemCard implements Printer {
    public Gear_Pray(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Gear_Pray() {
        super();
    }

    @Override
    public int space() {
        return 1;
    }

    @Override
    public String description() {
        return "小型齿轮 - 祈祷\n" +
                "\n" +
                "这是一个精致的小型齿轮。\n" +
                "\n" +
                "神奇的是，与其他物件不同，它的表面十分的干净，好像永远也落不上灰尘一样，同时也找不到任何的磨损。\n" +
                "你试着将地上的一片毛絮撒了上去，它竟然自己被吹开了，最后又落回到了地面上\n" +
                "\n" +
                "它上面刻印着优雅的花纹，齿轮的中间，印着一个有弧度的三角。整体重量不轻不重，你觉得惦着的手感刚刚好";
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
                return "Occupies 1\n\nSmall Gear - Pray\n" +
                        "\n" +
                        "This is a delicate gear.\n" +
                        "\n" +
                        "Amazingly, unlike the other objects, the surface of this gear is so clean that it never seems to dust, and there is no sign of any abrasion.\n" +
                        "\n" +
                        "You try to scatter a piece of dust on the ground. However, seems like it blows itself away and falls back to the ground\n" +
                        "It is engraved with elegant patterns. On the middle of the gear a radian triangle is printed. The overall weight is nether light nor heavy, the feeling is just right.";
            }
        };
    }
}
