package tbcbuild.card.level1;

import tbcbuild.cardGenerator.InteractiveList;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.Card;
import tbcbuild.cardType.ItemCard;
import tbcbuild.cardType.ObjectCard;

public class Item_MapOfAnabosisFloor extends ItemCard implements Printer {
    @Override
    public String description() {
        return "叮咚！在机器人冰冷的声音下，一道鲜活的声音响起了。你望过去，发出声音的是你刚打开的平板电脑。\n" +
                "趁着屏幕还没有熄灭，你按住了屏幕。看清了上面的内容\n" +
                "\n\n" +
                "来自 亦亚 的隔空投送：\n" +
                "本层的横板地图\n" +
                "\n\n" +
                "虽然时间很短，但是你牢牢地将这张地图的形象印在了脑海之中";
    }

    public Item_MapOfAnabosisFloor(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Item_MapOfAnabosisFloor() {
        super();
    }

    @Override
    public int space() {
        return -1;
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
                return "Occupies -1\n" +
                        "\n" +
                        "Ding dong! Under the cold voice of the robot, a fresh voice sounded. You look over and the sound came from the tablet you just turned on.\n" +
                        "Before the screen goes off, you press and hold the screen. read the above\n" +
                        "\n" +
                        "AirDrop from IA.\n" +
                        "\n" +
                        "Although the time is short, you have firmly imprinted the image of this map in your mind";
            }
        };
    }
}
