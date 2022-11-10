package tbcbuild.category;

import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CategoryCard;
import tbcbuild.cardType.Category;

public interface Cate_Chargable extends Category, Printer {
    String amountOfPowerRequiredToRun();

    @Override
    default String exportLore() {
        return "充一次电需要 " + amountOfPowerRequiredToRun() + " 单位电力";
    }

    @Override
    default String description() {
        return "需要定义该卡牌充一次电要多少单位电量";
    }

    @Override
    default String nameTag() {
        return "可被充电的";
    }

    @Override
    default CategoryCard printer(Class<? extends Category> cate) {
        return new CategoryCard(cate) {{
            add("粗Chargable细\n\nThe card need to specify the amount of electric power it requires to charge");
        }};
    }
}
