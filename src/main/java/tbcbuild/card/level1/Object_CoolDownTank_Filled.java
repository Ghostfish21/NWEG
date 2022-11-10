package tbcbuild.card.level1;

import tbcbuild.cardGenerator.InteractiveChoice;
import tbcbuild.cardGenerator.InteractiveList;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.CateCard;
import tbcbuild.cardType.Category;
import tbcbuild.cardType.ItemCard;
import tbcbuild.base.CategoryChild;
import tbcbuild.base.Duplicate;
import tbcbuild.category.Cate_CoolantExportable;
import tbcbuild.category.Cate_CoolantImportable;

import java.util.ArrayList;

import static tbcbuild.CategorySet.categoryIndex;

public class Object_CoolDownTank_Filled extends ItemCard implements Duplicate, CategoryChild, Cate_CoolantExportable, Printer {
    public Object_CoolDownTank_Filled(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Object_CoolDownTank_Filled() {
        super();
    }

    @Override
    public int space() {
        return 20;
    }

    @Override
    public String description() {
        return "这是一个硕大的银白色钢制桶子，你试着掂量了一下，只是一下你就无法支撑他的重量。\n" +
                "感觉起来里面还装载着很多填料。与此同时，它摸上去也非常寒冷。\n" +
                "桶上印着：\n" +
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
    public ArrayList<String> categories() {
        return new ArrayList<>() {{
            add(categoryIndex(Cate_CoolantExportable.class));
        }};
    }

    @Override
    public String exportCateText() {
        return this.exportLore();
    }

    @Override
    public String totalQuantity() {
        return "5000";
    }

    @Override
    public CardPrinter printer() {
        return new NormalCard() {
            @Override
            public InteractiveList fpIl() {
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
                return "This is a large silver steel bucket, you try to lift it, just tried once you realize that you can't lift it.\n" +
                        "It feels like there's still a lot of stuffing inside. At the same time, it was also very cold to the touch.\n" +
                        "\n" +
                        "Mohammed Brothers Foundation Maldives\n" +
                        "LGS5620 coolant\n" +
                        "Date of manufacture：Nov/15/2166+\n" +
                        "Contact us：Ado@muhammad.com\n" + "\n" +
                        "Warning：Frostbite risk, do not disassemble this product under any circumstances!\n" +
                        "This product is subject to the Hokkaido Carcinogen Product Management Act, and the product contains trace amounts of carcinogens TnR ITuu, the content of which does not exceed the safety standards of the Management Act\n" +
                        "\n" +
                        "Coolant 5000 units stored";
            }
        };
    }
}
