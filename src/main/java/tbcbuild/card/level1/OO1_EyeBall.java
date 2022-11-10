package tbcbuild.card.level1;

import tbcbuild.base.NameTag;
import tbcbuild.cardGenerator.InteractiveList;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.CateCard;
import tbcbuild.cardType.ItemCard;
import tbcbuild.base.CategoryChild;
import tbcbuild.category.Cate_SpiritualCaToken;

import java.util.ArrayList;

import static tbcbuild.CategorySet.categoryIndex;

public class OO1_EyeBall extends ItemCard implements CategoryChild, Cate_SpiritualCaToken, Printer {
    public OO1_EyeBall(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public OO1_EyeBall() {
        super();
    }

    @Override
    public int space() {
        return 1;
    }

    @Override
    public String description() {
        return "猩红眼球\n\n" +
                "这是一只猩红的眼球。瞳孔几乎占据了眼球正面的一大部分，眼白后面，是猩红的血肉。看起来十分的不详\n" +
                "\n" +
                "它被一个玻璃容器装载着，悬浮在容器内的溶液中央。你狠狠的摇晃了一下，眼睛突然转向了你。不知道是不是错觉，但是你继续摇晃，眼镜又转开了。看来只是巧合吧\n" +
                "\n" +
                "奇怪的是，这么久过去了，瓶子的表面依旧没有灰尘也没有磨损。你小心的试着用柜台的角滑了下瓶子的盖子，竟然没有留下丝毫痕迹。";
    }

    @Override
    public ArrayList<String> categories() {
        ArrayList<String> categories = new ArrayList<>();
        categories.add(categoryIndex(Cate_SpiritualCaToken.class));
        return categories;
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
                return "Occupies "+space()+"\n\nScarlet eyes\n\n" +
                        "This is a scarlet eyeball. The pupil occupies most of the front, and behind the eye whites is scarlet flesh. Looks ominous\n" +
                        "\n" +
                        "It is held in a glass container and suspended in the middle of the solution. You give it a big shake, and the eyes suddenly turn to you. You don't know if it's an illusion, but as you continue to shake, the eye turn away. You guess it's just a coincidencen" +
                        "\n" +
                        "The strange thing is that after all these time, the surface of the bottle is still free of dust and abrasion. You carefully try to slide the lid of the bottle with the corner of the counter, but leave no trace.";
            }
        };
    }
}
