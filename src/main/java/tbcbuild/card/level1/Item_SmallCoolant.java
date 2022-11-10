package tbcbuild.card.level1;

import tbcbuild.cardGenerator.InteractiveList;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.CateCard;
import tbcbuild.cardType.ItemCard;
import tbcbuild.base.CategoryChild;
import tbcbuild.base.Duplicate;
import tbcbuild.category.Cate_CoolantImportable;

import java.util.ArrayList;

import static tbcbuild.CategorySet.categoryIndex;

public class Item_SmallCoolant extends ItemCard implements Duplicate, CategoryChild, Cate_CoolantImportable, Printer {
    public Item_SmallCoolant(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Item_SmallCoolant() {
        super();
    }

    @Override
    public int space() {
        return 1;
    }

    @Override
    public String description() {
        return "这是一组6个的小型冷却罐";
    }

    @Override
    public int amount() {
        return 4;
    }

    @Override
    public ArrayList<String> categories() {
        return new ArrayList<>() {{
            add(categoryIndex(Cate_CoolantImportable.class));
        }};
    }

    @Override
    public String exportCateText() {
        return this.exportText();
    }

    @Override
    public String requireAmount() {
        return "6";
    }

    @Override
    public CardPrinter printer() {
        return new NormalCard() {
            @Override
            public InteractiveList fpIl() {
                return null;
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
                return new CateCard(Cate_CoolantImportable.class).getReferName();
            }

            @Override
            public String description() {
                return "Occupies 1\n\n" +
                        "This is a set of six small coolants\n\n" +
                        "Require 6 units of coolant to refill";
            }
        };
    }
}
