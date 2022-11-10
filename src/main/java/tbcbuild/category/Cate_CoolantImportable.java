package tbcbuild.category;

import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CategoryCard;
import tbcbuild.cardType.Category;

public interface Cate_CoolantImportable extends Category, Printer {
    String requireAmount();

    @Override
    default String exportLore() {
        return "需要冷却剂量 " + requireAmount();
    }

    @Override
    default String description() {
        return "需要定义该卡牌需要的冷却剂量";
    }

    @Override
    default String nameTag() {
        return "可导入冷却剂的";
    }

    @Override
    default CategoryCard printer(Class<? extends Category> cate) {
        return new CategoryCard(cate) {{
            add("粗Coolant Importable\n\nThe card need to specify the amount of coolant it requires to fill");
        }};
    }
}
