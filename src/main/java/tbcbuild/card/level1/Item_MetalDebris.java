package tbcbuild.card.level1;

import tbcbuild.cardGenerator.InteractiveList;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.ItemCard;
import tbcbuild.base.Duplicate;

public class Item_MetalDebris extends ItemCard implements Duplicate, Printer {
    public Item_MetalDebris(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Item_MetalDebris() {
        super();
    }

    @Override
    public int space() {
        return 2;
    }

    @Override
    public String description() {
        return "这是破坏了的钢板的残片，看起来它的边缘处很锋利，请务必小心使用\n" +
                "看起来很有攻击性，但是在造成伤害的同时有一半的机率对自己产生同等的反伤\n";
    }

    @Override
    public int amount() {
        return 2;
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
                return "Occupies "+space()+"\n\nThis is a piece of broken steel plate. It is sharp at the edge. Please use it carefully\n" +
                        "Looks aggressive, but it has a same chance of doing the SAME DAMAGE to yourself\n";
            }
        };
    }
}
