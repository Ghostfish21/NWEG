package tbcbuild.category;

import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CategoryCard;
import tbcbuild.cardType.Category;

public interface Cate_CoolantExportable extends Category, Printer {
    String totalQuantity();

    @Override
    default String exportLore() {
        return "存有冷却剂量 " + totalQuantity();
    }

    @Override
    default String description() {
        return "需要定义该卡牌储存的冷却剂量";
    }

    @Override
    default String nameTag() {
        return "可导出冷却剂的";
    }

    @Override
    default CategoryCard printer(Class<? extends Category> cate) {
        return new CategoryCard(cate) {{
            add("粗Coolant Exportable细\n\nThe card need to specify the amount of coolant it saves");
        }};
    }
}
