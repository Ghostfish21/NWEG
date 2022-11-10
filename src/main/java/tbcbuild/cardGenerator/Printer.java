package tbcbuild.cardGenerator;

import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.CategoryCard;
import tbcbuild.cardType.Category;

public interface Printer {
    default CardPrinter printer() {return null;}
    default CategoryCard printer(Class<? extends Category> cate) {return null;}
}
