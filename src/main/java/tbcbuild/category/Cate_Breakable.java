package tbcbuild.category;

import tbcbuild.cardGenerator.InteractiveList;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.CategoryCard;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardGenerator.card.PagesPureDescription;
import tbcbuild.cardType.CateCard;
import tbcbuild.cardType.Category;

public interface Cate_Breakable extends Category, Printer {
    String damageToBreak();

    @Override
    default String exportLore() {
        return "需要 " + damageToBreak() + " 点伤害才会被破坏";
    }

    @Override
    default String description() {
        return "需要定义该卡牌承受多少伤害后会被破坏";
    }

    @Override
    default String nameTag() {
        return "可被破坏的";
    }

    @Override
    default CategoryCard printer(Class<? extends Category> cate) {
        return new CategoryCard(cate) {{
            add("粗Breakable\n\nThe card need to specify how many damage could break itself.");
        }};
    }
}
