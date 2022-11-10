package tbcbuild.card.level2;

import tbcbuild.base.InteractiveList;
import tbcbuild.base.Parent;
import tbcbuild.card.level1.Item_PersonalPanel;
import tbcbuild.cardGenerator.InteractiveChoice;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.Card;
import tbcbuild.cardType.ObjectCard;

import java.util.ArrayList;

import static tbcbuild.base.InteractiveChoice.ic;

public class Object_BlackServerStack_2 extends ObjectCard implements Printer {
    public Object_BlackServerStack_2(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Object_BlackServerStack_2() {
        super();
    }

    @Override
    public String description() {
        return "这是一排黑色柜子，柜子里的格子非常低，你很好奇它里面原本装的到底是什么。\n" +
                "柜子已经很久没有人用过了，上面落了一层厚厚的灰。柜子旁边的电线已经被灰徐整个包裹住，好像是在电线外又裹了一层保护膜\n" +
                "与其他柜子不同的是，这个柜子尽头的地方有两个上了锁的大抽屉。锁是铁制的，非电子的质数锁，看起来十分可靠。";
    }

    @Override
    public InteractiveList interactiveList() {
        return new InteractiveList() {{
            add(ic("密码锁1 - 答对问题", false, new Question_Password1()), new Item_PersonalPanel());
            add(ic("密码锁2 - 答对问题", false, new Question_Password2()), new Item_PersonalID());
        }};
    }

    @Override
    public CardPrinter printer() {
        return new NormalCard() {
            @Override
            public tbcbuild.cardGenerator.InteractiveList fpIl() {
                return new tbcbuild.cardGenerator.InteractiveList() {{
                    add(InteractiveChoice.ic("Password Lock 1 - Answer the question", false, new Question_Password1()), new Item_PersonalPanel());
                    add(InteractiveChoice.ic("Password Lock 1 - Answer the question", false, new Question_Password2()), new Item_PersonalID());
                }};
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
                        "Unlike other cabinets, this one has two large drawers that's locked at the end of the cabinet. The lock is an iron, electric lock that looks very reliable.";
            }
        };
    }
}
