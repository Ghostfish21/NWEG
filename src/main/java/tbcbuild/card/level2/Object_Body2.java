package tbcbuild.card.level2;

import tbcbuild.base.InteractiveList;
import tbcbuild.base.Obtainable;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.ObjectCard;

public class Object_Body2 extends ObjectCard implements Printer {
    public Object_Body2(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Object_Body2() {
        super();
    }

    @Override
    public String description() {
        return "尸体身上穿着青色的制服，上面狙击枪，步枪交叉着因在制服上，在他们的周围画着一圈麦穗。下面写着四个小字：基地快反。尸体的腐烂过于严重，已经看不出原本的样貌。但是在制服上印着ta的名字：王虎\n" +
                "\n" +
                "你在尸体上搜寻了一番，什么都没有找到";
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
                return "The corpses were wearing blue uniforms with sniper rifles and rifles crossed on the uniforms, and a circle of wheat was drawn around them. Below it is written in four small characters: Base Quick Response. The decay of the corpse was so severe that the original appearance could no longer be seen. But his name is printed on the uniform: Wang Hu\n" +
                        "\n" +
                        "You searched the body and found nothing";
            }
        };
    }
}
