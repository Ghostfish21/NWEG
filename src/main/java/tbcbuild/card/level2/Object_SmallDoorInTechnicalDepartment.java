package tbcbuild.card.level2;

import tbcbuild.base.InteractiveList;
import tbcbuild.base.Obtainable;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.ObjectCard;

import static tbcbuild.Util.obtain;

public class Object_SmallDoorInTechnicalDepartment extends ObjectCard implements Printer {
    public Object_SmallDoorInTechnicalDepartment(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Object_SmallDoorInTechnicalDepartment() {
        super();
    }

    @Override
    public String description() {
        return "尸体身上穿着青色的制服，上面印着代表网络的logo。下面写着三个小字：技术部。尸体的腐烂过于严重，已经看不出原本的样貌。但是在制服上印着ta的名字：严正函\n" +
                "\n" +
                "你在尸体上搜寻了一番，找到了 一张相片 和 一只千纸鹤\n" +
                obtain(true, new Item_QZH(), new OO1_Photo());
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
                return "The corpse was wearing a cyan uniform with the logo representing the network printed on it. Below are three small characters: Technical Department. The decay of the corpse was so severe that the original appearance could no longer be seen. But his name is printed on the uniform: Yan Zhenghan\n" +
                        "\n" +
                        "You searched the body and found a photo and a paper-cranes\n粗" +
                        obtain(true, new Item_QZH(), new OO1_Photo());
            }
        };
    }
}
