package tbcbuild.category;

import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CategoryCard;
import tbcbuild.cardType.Category;

public interface Cate_SpiritualCaToken extends Category, Printer {
    @Override
    default String exportLore() {
        return "";
    }

    @Override
    default String description() {
        return "可以用于净化灵态与露卡生态的结合体";
    }

    @Override
    default String nameTag() {
        return "灵卡信物";
    }

    @Override
    default CategoryCard printer(Class<? extends Category> cate) {
        return new CategoryCard(cate) {{
            add("粗Token\n\nPlease collect tokens :)");
        }};
    }
}
