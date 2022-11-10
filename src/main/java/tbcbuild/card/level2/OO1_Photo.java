package tbcbuild.card.level2;

import tbcbuild.base.CategoryChild;
import tbcbuild.cardGenerator.InteractiveList;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.CateCard;
import tbcbuild.cardType.ItemCard;
import tbcbuild.category.Cate_SpiritualCaToken;

import java.util.ArrayList;

import static tbcbuild.CategorySet.categoryIndex;

public class OO1_Photo extends ItemCard implements CategoryChild, Cate_SpiritualCaToken, Printer {
    public OO1_Photo(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public OO1_Photo() {
        super();
    }

    @Override
    public String description() {
        return "相片\n" +
                "\n" +
                "这是一张一家人的合照。妈妈在左边，爸爸在右边，中间是一个非常可爱的小女孩。\n" +
                "三人的脸上都洋溢着幸福的笑容，看起来是在码头上拍的照片";
    }

    @Override
    public int space() {
        return 0;
    }

    @Override
    public ArrayList<String> categories() {
        return new ArrayList<>() {{
            add(categoryIndex(Cate_SpiritualCaToken.class));
        }};
    }

    @Override
    public String exportCateText() {
        return this.exportLore();
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
                return new CateCard(Cate_SpiritualCaToken.class).getReferName();
            }

            @Override
            public String description() {
                return "Occupies 0\n" +
                        "\n" +
                        "photo\n" +
                        "\n" +
                        "This is a family photo. Mom is on the left, Dad is on the right, and in the middle is a very cute little girl.\n" +
                        "The picture was taken at the wharf, and they looks happy and harmony. ";
            }
        };
    }
}
