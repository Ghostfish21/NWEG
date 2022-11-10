package tbcbuild.category;

import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CategoryCard;
import tbcbuild.cardType.Category;

public interface Cate_WireLessCharger extends Category, Printer {
    String totalPower();

    @Override
    default String exportLore() {
        return "一共含有 " + totalPower() + " 单位电力";
    }

    @Override
    default String description() {
        return "需要定义该卡牌当前含有多少电量可以导出";
    }

    @Override
    default String nameTag() {
        return "可无线充电的";
    }

    @Override
    default CategoryCard printer(Class<? extends Category> cate) {
        return new CategoryCard(cate) {{
            add("粗Wireless Charger\n\nThe card need to specify the amount of electric power it saves");
        }};
    }
}
