package tbcbuild.card.level1;

import tbcbuild.cardGenerator.InteractiveList;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.FindingCard;

import static tbcbuild.Util.obtain;

public class Finding_PluginAndWire extends FindingCard implements Printer {
    public Finding_PluginAndWire(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Finding_PluginAndWire() {
        super();
    }

    @Override
    public String description() {
        return "你看到柜台下有一排插座，但是上面已经空空如也。在一旁，有一根一厘米粗的电线延伸了出来\n" +
                obtain(true, new Item_Wire());
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
                return "You see a row of outlets under the counter, nothing was plug into it. On the other side, an one centimeter thick cable stretched out\n粗" +
                        obtain(true, new Item_Wire());
            }
        };
    }
}
