package tbcbuild.card.level2;

import tbcbuild.base.CategoryChild;
import tbcbuild.base.InteractiveList;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.CateCard;
import tbcbuild.cardType.ObjectCard;
import tbcbuild.category.Cate_Chargable;
import tbcbuild.category.Cate_SpiritualCaToken;
import tbcbuild.specialText.friendIA.InteractBook_IA;

import java.util.ArrayList;

import static tbcbuild.CategorySet.categoryIndex;
import static tbcbuild.Util.obtainSt;
import static tbcbuild.base.InteractiveChoice.ic;

public class Object_RightDoorOutsideAnabosisCenter extends ObjectCard implements CategoryChild, Cate_Chargable, Printer {
    @Override
    public String amountOfPowerRequiredToRun() {
        return "10";
    }

    @Override
    public String description() {
        return "你试了试，并没有拉开。门似乎从里面被电子锁锁住了\t\n" +
                "门上没有发现可供充电的充电口或者电线。\n" +
                "请打开" + obtainSt(false, new InteractBook_IA()) + "第13页（如果没有则忽略）";
    }

    public Object_RightDoorOutsideAnabosisCenter(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Object_RightDoorOutsideAnabosisCenter() {
        super();
    }

    @Override
    public InteractiveList interactiveList() {
        return null;
    }

    @Override
    public ArrayList<String> categories() {
        return new ArrayList<>() {{
            add(categoryIndex(Cate_Chargable.class));
        }};
    }

    @Override
    public String exportCateText() {
        return this.exportLore();
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
                return new CateCard(Cate_Chargable.class).getReferName();
            }

            @Override
            public String description() {
                return "You tried and it didn't pull away. The door appears to be locked by an electronic lock from the inside\n" +
                        "There were no charging ports or wires found on the door for charging.\n" +
                        "Please open page 13 of 粗" + obtainSt(false, new InteractBook_IA()) + "细 (ignore if N/A)\n" +
                        "\n" +
                        "One charge requires 10 units of electricity";
            }
        };
    }
}
