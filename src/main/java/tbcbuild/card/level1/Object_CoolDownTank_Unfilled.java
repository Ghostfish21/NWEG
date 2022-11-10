package tbcbuild.card.level1;

import tbcbuild.cardGenerator.InteractiveChoice;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.CateCard;
import tbcbuild.cardType.Category;
import tbcbuild.cardType.ObjectCard;
import tbcbuild.base.CategoryChild;
import tbcbuild.base.Duplicate;
import tbcbuild.base.InteractiveList;
import tbcbuild.category.Cate_CoolantExportable;
import tbcbuild.category.Cate_CoolantImportable;

import java.util.ArrayList;

import static tbcbuild.CategorySet.categoryIndex;
import static tbcbuild.base.InteractiveChoice.ic;

public class Object_CoolDownTank_Unfilled extends ObjectCard implements Duplicate, CategoryChild, Cate_CoolantExportable, Printer {

    public Object_CoolDownTank_Unfilled(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Object_CoolDownTank_Unfilled() {
        super();
    }

    @Override
    public String description() {
        return "这是一个硕大的银白色钢制桶子，你试着掂量了一下，稍微使了一点力就将其抬了起来。\n" +
                "桶子后面有一个小小的插槽，好像可以插一根软管进去。在插槽的旁边，还有一个按钮" +
                "\n桶上印着：\n" +
                "\n" +
                "马尔代夫莫罕穆德兄弟基金会\n" +
                "LGS5620制冷液\n" +
                "生产日期：Nov/15/2166+\n" +
                "联系我们：Ado@muhammad.com\n" + "\n" +
                "警告：冻伤风险，请勿在任何情境下拆解本产品！\n" +
                "注意：本商品受北海道 致癌物产品管理法 约束，产品内含有微量致癌物质 TnR ITuu，含量均未超过管理法的安全标准";
    }

    @Override
    public int amount() {
        return 10;
    }

    @Override
    public InteractiveList interactiveList() {
        InteractiveList il = new InteractiveList();
        il.add(ic("按下开关", false, Category.handable(Cate_CoolantImportable.class)), Category.card(Cate_CoolantImportable.class));
        return il;
    }

    @Override
    public ArrayList<String> categories() {
        ArrayList<String> categories = new ArrayList<>();
        categories.add(categoryIndex(Cate_CoolantExportable.class));
        return categories;
    }

    @Override
    public String exportCateText() {
        return this.exportLore();
    }

    @Override
    public String totalQuantity() {
        return "0";
    }

    @Override
    public CardPrinter printer() {
        return new NormalCard() {
            @Override
            public tbcbuild.cardGenerator.InteractiveList fpIl() {
                return new tbcbuild.cardGenerator.InteractiveList() {{
                    add(InteractiveChoice.ic("Fill the Coolant Importable"), Category.card(Cate_CoolantImportable.class));
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
                return new CateCard(Cate_CoolantExportable.class).getReferName();
            }

            @Override
            public String description() {
                return "This is a large silver steel bucket. You lifted it like a piece of cake\n" +
                        "There is a small outlet on the bucket, it looks like you can insert something into it. There is another small button right next to the outlet.\n" +
                        "\n" +
                        "Maldives Mohanmud Brothers Foundation\n" +
                        "LGS5620 coolant\n" +
                        "Date of manufacture：Nov/15/2166+\n" +
                        "Contact us：Ado@muhammad.com\n" + "\n" +
                        "Warning：Frostbite risk, do not disassemble this product under any circumstances!\n" +
                        "Attention：This product is subject to the Hokkaido Carcinogen Product Management Act, and the product contains trace amounts of carcinogens TnR ITuu, the content of which does not exceed the safety standards of the Management Act\n" +
                        "\n" +
                        "Coolant 0 units stored";
            }
        };
    }
}
