package tbcbuild.card.level1;

import tbcbuild.cardGenerator.InteractiveList;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.ItemCard;

public class Item_ScrewDriver extends ItemCard implements Printer {
    public Item_ScrewDriver(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Item_ScrewDriver() {
        super();
    }

    @Override
    public int space() {
        return 0;
    }

    @Override
    public String description() {
        return "螺丝刀，可用于拆卸设备";
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
                return "Occupies "+space()+"\n\nThis is a screwdriver, used to disassemble devices";
            }
        };
    }
}
