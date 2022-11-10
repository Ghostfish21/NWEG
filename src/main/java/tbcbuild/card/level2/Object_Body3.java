package tbcbuild.card.level2;

import tbcbuild.base.InteractiveList;
import tbcbuild.base.Obtainable;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.ObjectCard;

import static tbcbuild.Util.obtain;

public class Object_Body3 extends ObjectCard implements Printer {
    @Override
    public String description() {
        return "尸体身上穿着青色的制服，上面狙击枪，步枪的图案交叉着印在制服上，在他们的周围，有一圈麦穗。下面写着四个小字：基地快反。尸体的腐烂过于严重，已经看不出原本的样貌。但是在制服上印着ta的名字：赵家辉\n" +
                "\n" +
                "你在尸体上搜寻了一番，找到了一条战术腰带，" + obtain(true, new Item_TacticalBelt_2());
    }

    public Object_Body3(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Object_Body3() {
        super();
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
                return "The corpses were wearing blue uniforms with sniper rifles on them. The pattern of the rifles was crossed on the uniforms. Around them, there was a circle of wheat. Below it is written in four small characters: Base Quick Response. The decay of the corpse was so severe that the original appearance could no longer be seen. But his name is printed on the uniform: Zhao Jiahui\n" +
                        "\n" +
                        "You searched the corpse and found a tactical belt. 粗" + obtain(true, new Item_TacticalBelt_2());
            }
        };
    }
}
