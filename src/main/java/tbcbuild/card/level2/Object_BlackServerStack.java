package tbcbuild.card.level2;

import tbcbuild.base.InteractiveList;
import tbcbuild.base.Parent;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.Card;
import tbcbuild.cardType.ObjectCard;

import java.util.ArrayList;

public class Object_BlackServerStack extends ObjectCard implements Parent, Printer {
    public Object_BlackServerStack(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Object_BlackServerStack() {
        super();
    }

    @Override
    public String description() {
        return "这是一排黑色柜子，柜子里的格子非常低，你很好奇它里面原本装的到底是什么。\n" +
                "柜子已经很久没有人用过了，上面落了一层厚厚的灰。柜子旁边的电线已经被灰徐整个包裹住，好像是在电线外又裹了一层保护膜\n" +
                "你检查了这一排柜子，但是并没有任何发现";
    }

    @Override
    public InteractiveList interactiveList() {
        return null;
    }

    @Override
    public ArrayList<Card> variant() {
        return new ArrayList<>() {{
            add(new Object_BlackServerStack(true));
            add(new Object_BlackServerStack_1(true));
            add(new Object_BlackServerStack_2(true));
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
                return "It's a row of black cabinets with very thin slots, and you're curious about what was in it.\n" +
                        "The cabinet has not been used for a long time, and a thick layer of dust has fallen on it. The wires next to the cabinet have been completely wrapped in such dust, as if a layer of protective film has been wrapped around the wires.\n" +
                        "You checked this row of cabinets and found nothing";
            }
        };
    }
}
