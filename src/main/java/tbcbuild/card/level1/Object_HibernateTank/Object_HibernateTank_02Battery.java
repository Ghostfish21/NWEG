package tbcbuild.card.level1.Object_HibernateTank;

import tbcbuild.base.CategoryChild;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.CateCard;
import tbcbuild.cardType.ObjectCard;
import tbcbuild.base.InteractiveList;
import tbcbuild.card.level1.Finding_HibernateTankInternal;
import tbcbuild.category.Cate_Breakable;

import java.util.ArrayList;

import static tbcbuild.CategorySet.categoryIndex;
import static tbcbuild.Util.obtain;

public class Object_HibernateTank_02Battery extends ObjectCard implements CategoryChild, Cate_Breakable, Printer {

    public Object_HibernateTank_02Battery(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Object_HibernateTank_02Battery() {
        super();
    }

    @Override
    public String damageToBreak() {
        return "20";
    }

    @Override
    public String description() {
        return "这是一个被破坏了的冬眠仓，它本该光洁的外表上现在布满了裂痕与缺口\n" +
                "地板上还能看到狰狞的爆炸痕迹\n" +
                "可以通过造成伤害破坏这个冬眠舱，\n" +
                "强行拆开冬眠仓会耗费你 3/体质点 点体力" +
                obtain(true, new Finding_HibernateTankInternal());
    }

    @Override
    public InteractiveList interactiveList() {
        return null;
    }

    @Override
    public ArrayList<String> categories() {
        return new ArrayList<>() {{
            add(categoryIndex(Cate_Breakable.class));
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
            public tbcbuild.cardGenerator.InteractiveList fpIl() {
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
                return new CateCard(Cate_Breakable.class).getReferName();
            }

            @Override
            public String description() {
                return "This is a broken hibernation tank. Its smoothy surface now is full of cracks and gaps.\n" +
                        "The scary explosion track is still visible on the floor.\n" +
                        "You can break the tank by causing enough damage.\n" +
                        "You can also force open this tank. That will take 3 points of physical power, and 粗" +
                        obtain(true, new Finding_HibernateTankInternal());
            }
        };
    }
}
