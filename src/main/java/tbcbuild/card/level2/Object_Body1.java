package tbcbuild.card.level2;

import tbcbuild.base.InteractiveList;
import tbcbuild.base.Parent;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.Card;
import tbcbuild.cardType.ObjectCard;
import tbcbuild.specialText.friendIA.Dairy_912;

import java.util.ArrayList;

import static tbcbuild.Util.obtain;
import static tbcbuild.Util.obtainSt;

public class Object_Body1 extends ObjectCard implements Parent, Printer {
    public Object_Body1(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Object_Body1() {
        super();
    }

    @Override
    public String description() {
        return "躺在角落里，枯黄的头发似乎印证了她曾经的容颜。现在的她再也无法说话了。你低下头去，闻到了浓厚的尸臭，但是看到她的脸的那一刻，你愣住了。\n" +
                "腐败的脸上是她在笑，对着你微笑。好像是她终于不需要在末日中苦苦煎熬了，也好像是在无声的对世界嘲笑，可最后，你又感觉像是对其他还活着的人的祝福\n" +
                "尸体上的青色制服上印着蛇和法杖，下面是五个小字：生化实验室。制服上也印着她的名字：久伊贰\n" +
                "\n" +
                "你在尸体上搜寻了一番，找到了 一本日记。" + obtain(true, new Item_Dairy_912()) + " " + obtainSt(true, new Dairy_912()) +
                "\n搜索完后，你感到了一阵不安。不由自主地看向了刚才那个奇怪的笑容，你感觉它似乎是可以取下来的。" + obtain(true, new OO1_OminousSmile());
    }

    @Override
    public InteractiveList interactiveList() {
        return null;
    }

    @Override
    public ArrayList<Card> variant() {
        return new ArrayList<>() {{
            add(new Object_Body1(true));
            add(new Object_Body2(true));
            add(new Object_Body3(true));
        }};
    }

    @Override
    public CardPrinter printer() {
        return new NormalCard() {
            @Override
            public tbcbuild.cardGenerator.InteractiveList fpIl() {
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
                return "Lying in the corner, her dry and yellow hair seemed to prove her past beauty. Now she can no longer speak. You tried lowered your head but you smelled the thick corpse stench, but the moment you saw her face, you were stunned.\n" +
                        "Her corrupted face is now smiling, at you. It seems that she finally doesn't need to suffer in the doomsday, and it seems that she is silently mocking the world, but in the end, you feel like it's a blessing to other people who are still alive.\n" +
                        "The cyan uniform on the corpse is printed with snakes and walking stick, and below it are five small words: Biochemical Laboratory. Her name is also printed on the uniform: Jiuyier\n" +
                        "\n" +
                        "You searched the body and found a diary. 粗" + obtain(true, new Item_Dairy_912()) + " " + obtainSt(true, new Dairy_912()) + "细\n" +
                        "After your search, you feel weird. Involuntarily looking at the strange smile just now, you feel that it can actually be taken off. 粗" + obtain(true, new OO1_OminousSmile());
            }
        };
    }
}
