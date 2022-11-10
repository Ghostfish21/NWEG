package tbcbuild.card.level2;

import tbcbuild.base.CategoryChild;
import tbcbuild.cardGenerator.InteractiveList;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.Card;
import tbcbuild.cardType.CateCard;
import tbcbuild.cardType.ItemCard;
import tbcbuild.category.Cate_SpiritualCaToken;

import java.util.ArrayList;

import static tbcbuild.CategorySet.categoryIndex;

public class OO1_OminousSmile extends ItemCard implements CategoryChild, Cate_SpiritualCaToken, Printer {
    @Override
    public String description() {
        return "不详的笑\n" +
                "\n" +
                "你恍惚了一下。回过神来的时候，尸体脸上的笑容已经不见了。\n" +
                "你感觉有些不对劲，摸了摸有异样感觉的嘴角，才发现它不知不觉间已经自己翘起来，露出了诡异的笑容\n" +
                "你感觉好像可以吧笑容取下来，只需要对着一张脸就行。";
    }

    public OO1_OminousSmile(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public OO1_OminousSmile() {
        super();
    }

    @Override
    public int space() {
        return -1;
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
                return "Occupies -1\n" +
                        "\n" +
                        "Ominous smile\n" +
                        "\n" +
                        "You are in a trance. When you came back to your senses, the smile on the corpse's face had disappeared.\n" +
                        "You feel that something is wrong, and you touch the corner of your mouth that feels strange, only to find that it has unknowingly curled up on its own, revealing a strange smile\n" +
                        "You also feel that you can take your smile off and just put it in any face.";
            }
        };
    }
}
