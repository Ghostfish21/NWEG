package tbcbuild.card.level2;

import tbcbuild.base.InteractiveList;
import tbcbuild.base.Parent;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.Card;
import tbcbuild.cardType.ObjectCard;

import java.util.ArrayList;

import static tbcbuild.Util.obtain;

public class Object_BlackServerStack_1 extends ObjectCard implements Printer {
    public Object_BlackServerStack_1(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Object_BlackServerStack_1() {
        super();
    }

    @Override
    public String description() {
        return "这是一排黑色柜子，柜子里的格子非常低，你很好奇它里面原本装的到底是什么。\n" +
                "柜子已经很久没有人用过了，上面落了一层厚厚的灰。柜子旁边的电线已经被灰徐整个包裹住，好像是在电线外又裹了一层保护膜\n" +
                "你检查了这一排柜子，发现了一个齿轮， 粗" + obtain(true, new Gear_Happiness());
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
                return "It's a row of black cabinets with very think slots, and you're curious about what was in it.\n" +
                        "The cabinet has not been used for a long time, and a thick layer of dust has fallen on it. The wires next to the cabinet have been completely wrapped in such dust, as if a layer of protective film has been wrapped around the wires.\n" +
                        "You checked this row of cabinets and found a gear, 粗" + obtain(true, new Gear_Happiness());
            }
        };
    }
}
