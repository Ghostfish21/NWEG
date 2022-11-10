package tbcbuild.card.level2;

import tbcbuild.base.CategoryChild;
import tbcbuild.cardGenerator.InteractiveList;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.CategoryCard;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.CateCard;
import tbcbuild.cardType.Category;
import tbcbuild.cardType.ItemCard;
import tbcbuild.category.Cate_Chargable;
import tbcbuild.category.Cate_WireLessCharger;

import java.util.ArrayList;

import static tbcbuild.CategorySet.categoryIndex;
import static tbcbuild.CategorySet.loreOf;

public class Item_BlackCharger extends ItemCard implements CategoryChild, Cate_Chargable, Cate_WireLessCharger {
    @Override
    public String amountOfPowerRequiredToRun() {
        return "50";
    }

    @Override
    public String exportLore() {
        return "";
    }

    @Override
    public String totalPower() {
        return "50";
    }

    @Override
    public String description() {
        return "一个长方形的小黑盒子，上面除了两个指示灯外，还有一个装小型能量匣的槽位，和一个充电口。没有任何其他的标识\n" +
                "这是一个无线充电盒子";
    }

    @Override
    public String nameTag() {
        return "";
    }

    @Override
    public CategoryCard printer(Class<? extends Category> cate) {
        return Cate_Chargable.super.printer(cate);
    }

    public Item_BlackCharger(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Item_BlackCharger() {
        super();
    }

    @Override
    public int space() {
        return 2;
    }

    @Override
    public ArrayList<String> categories() {
        return new ArrayList<>() {{
            add(categoryIndex(Cate_Chargable.class));
            add(categoryIndex(Cate_WireLessCharger.class));
        }};
    }

    @Override
    public String exportText() {
        return CategoryChild.super.exportText();
    }

    @Override
    public String exportCateText() {
        return loreOf(Cate_Chargable.class, this) + "\n" +
                loreOf(Cate_WireLessCharger.class, this);
    }

//    @Override
//    public CardPrinter printer() {
//        return new NormalCard() {
//            @Override
//            public InteractiveList fpIl() {
//                return null;
//            }
//
//            @Override
//            public String cardName() {
//                return getReferName();
//            }
//
//            @Override
//            public String title() {
//                return getReferName();
//            }
//
//            @Override
//            public String cate() {
//                return new CateCard(Cate_Chargable.class).getReferName() + ", " + new CateCard(Cate_WireLessCharger.class).getReferName();
//            }
//
//            @Override
//            public String description() {
//                return "Occupies 2\n" +
//                        "\n" +
//                        "A small rectangular black box, in addition to two indicator lights, there is a slot for a small energy box and a charging port.\n" +
//                        "This is a wireless charging case\n" +
//                        "\n" +
//                        "A single charge requires 50 units of electricity\n" +
//                        "Contains a total of 50 units of electricity";
//            }
//        };
//    }
}
