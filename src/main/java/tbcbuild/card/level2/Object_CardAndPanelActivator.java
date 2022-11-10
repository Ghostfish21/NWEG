package tbcbuild.card.level2;

import tbcbuild.base.CateHandable;
import tbcbuild.base.CategoryChild;
import tbcbuild.base.InteractiveList;
import tbcbuild.base.Obtainable;
import tbcbuild.card.level1.Item_PersonalPanel;
import tbcbuild.cardGenerator.InteractiveChoice;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.CateCard;
import tbcbuild.cardType.ObjectCard;
import tbcbuild.category.Cate_Chargable;

import java.util.ArrayList;

import static tbcbuild.CategorySet.categoryIndex;
import static tbcbuild.base.InteractiveChoice.ic;

public class Object_CardAndPanelActivator extends ObjectCard implements CategoryChild, Cate_Chargable, Printer {
    public Object_CardAndPanelActivator(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Object_CardAndPanelActivator() {
        super();
    }

    @Override
    public ArrayList<String> categories() {
        return new ArrayList<>() {{
            categoryIndex(Cate_Chargable.class);
        }};
    }

    @Override
    public String exportCateText() {
        return this.exportLore();
    }

    @Override
    public InteractiveList interactiveList() {
        return new InteractiveList() {{
            add(ic("激活两个物品 - 需要消耗电力启动机器", false, new Item_PersonalID(), new Item_PersonalPanel(), new CateHandable(Cate_Chargable.class)),
                    new Item_PersonalPanel(), new Item_PersonalID());
        }};
    }

    @Override
    public String description() {
        return "一台小巧的机器。它的下方有一个大抽屉和一个小抽屉，机器的上方是一个由铁架固定的摄像头。";
    }

    @Override
    public String amountOfPowerRequiredToRun() {
        return "10";
    }

    @Override
    public CardPrinter printer() {
        return new NormalCard() {
            @Override
            public tbcbuild.cardGenerator.InteractiveList fpIl() {
                return new tbcbuild.cardGenerator.InteractiveList() {{
                    add(InteractiveChoice.ic("Activate two items - requires electricity to activate the machine", false, new Item_PersonalID(), new Item_PersonalPanel(), new CateCard(Cate_Chargable.class)), new Item_PersonalPanel(), new Item_PersonalID());
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
                return "A small machine. There is a large drawer and a small drawer below it, and above the machine is a camera fixed by an iron frame.\n" +
                        "One charge requires 10 units of electricity";
            }
        };
    }
}
