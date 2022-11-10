package tbcbuild.card.level1;

import tbcbuild.cardGenerator.InteractiveList;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.ItemCard;
import tbcbuild.specialText.anabosisCenter.Dairy_QingYun;

import static tbcbuild.Util.obtainSt;

public class Item_Dairy_QingYun extends ItemCard implements Printer {
    public Item_Dairy_QingYun(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Item_Dairy_QingYun() {
        super();
    }

    @Override
    public int space() {
        return 3;
    }

    @Override
    public String description() {
        return "一本使用痕迹很重的黑色日记本\n" +
                "日记本的封面印着星星和鲸鱼，它让你在黑暗的环境里稍微放松了些许\n" +
                "\n" +
                "玩家可以翻阅本物品（"+obtainSt(true, new Dairy_QingYun())+"），也可以在笔记本上写字。\n" +
                "拥有此笔记本后玩家可以用笔在纸上记录";
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
                return null;
            }

            @Override
            public String description() {
                return "Occupies "+space()+"\n\nA heavily used black diary\n" +
                        "\n" +
                        "The diary has stars and whales on the cover. These relax you a bit in the dark\n" +
                        "Players can read through this item (粗"+obtainSt(true, new Dairy_QingYun())+"细).\n"
                        ;
            }
        };
    }
}
