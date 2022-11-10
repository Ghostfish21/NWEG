package tbcbuild.card.level2;

import tbcbuild.base.InteractiveList;
import tbcbuild.base.Obtainable;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.ObjectCard;

import static tbcbuild.Util.obtain;

public class Finding_ElevatorOpen extends ObjectCard implements Printer {
    public Finding_ElevatorOpen(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Finding_ElevatorOpen() {
        super();
    }

    @Override
    public String description() {
        return "在你的努力之下，电梯门慢慢的被你掰开了\n" +
                "一股浓烈的臭味扑面而来，你看到一颗高度腐烂的头颅在失去电梯的支撑后无力的往下仰了下来，倒在了地板上。\n" +
                "空洞的眼眶直直的对着你，嘴巴大张着，仿佛在无声的诉说着他生前的事情\n" +
                "电梯停在这个楼层稍微往下一点的位置，但是好在你能看清楚电梯里面的情况\n" +
                "里面似乎只有这个死去多时的人。他身上穿着青色的制服，上面印着代表万物互联的球形标识。下面写着三个小字：技术部。尸体的腐烂过于严重，已经看不出原本的样貌。但是在制服上印着ta的名字：黄一易\n" +
                "\n" +
                "你在尸体上搜寻了一番，找到了 一副战术腰带，一张纸条，以及一些硬币\n" +
                obtain(true, new Item_Coins(), new Item_TacticalBelt(), new Item_Paper());
    }

    @Override
    public InteractiveList interactiveList() {
        return null;
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
                return "With your efforts, the elevator door was slowly opened by you\n" +
                        "A strong stench hits your face, and you see a highly decomposed head limply slumped down after losing the support of the elevator, and fell to the floor.\n" +
                        "The empty eyes are facing you straight, and the mouth is open, as if he is silently telling the events of his life.\n" +
                        "The elevator stops a little down this floor, but fortunately you can see what's inside the elevator\n" +
                        "There seems to be only this long dead man in there. He was wearing a cyan uniform with a spherical logo representing the Internet of Everything. Below are three small characters: Technical Department. The decay of the corpse was so severe that the original appearance could no longer be seen. But his name is printed on the uniform: Huang Yiyi\n" +
                        "\n" +
                        "You searched the body and found a tactical belt, a note, and some coins\n粗" +
                        obtain(true, new Item_Coins(), new Item_TacticalBelt(), new Item_Paper());
            }
        };
    }
}
