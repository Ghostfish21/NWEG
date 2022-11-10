package tbcbuild.card.level1;

import tbcbuild.base.Explorable;
import tbcbuild.base.InteractiveList;
import tbcbuild.cardGenerator.InteractiveChoice;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.ItemCard;

import static tbcbuild.base.InteractiveChoice.ic;

public class Item_PersonalPanel_WangHao extends ItemCard implements Explorable, Printer {
    public Item_PersonalPanel_WangHao(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Item_PersonalPanel_WangHao() {
        super();
    }

    @Override
    public int space() {
        return 5;
    }

    @Override
    public String description() {
        return "这是一块随身平板电脑。开机键按了好一会，但是无论按多久，平板就是打不开。可能是因为没有电了\n" +
                "平板电脑外面套了一层黑色的壳子，上面印着一只黄色的老鼠。在它的一角，还挂着一个黄色老鼠的吊坠";
    }

    @Override
    public InteractiveList interactiveList() {
        return new InteractiveList() {{
            add(ic("继续按开机键").tc(), new Finding_PPOpen());
        }};
    }

    @Override
    public CardPrinter printer() {
        return new NormalCard() {
            @Override
            public tbcbuild.cardGenerator.InteractiveList fpIl() {
                return new tbcbuild.cardGenerator.InteractiveList() {{
                    add(InteractiveChoice.ic("Keep trying to boost the device").tc(), new Finding_PPOpen());
                }};
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
                return "Occupies "+space()+"\n\nThis is a portable tablet. You pressed the power button for a while, but no matter how long you pressed it, the tablet wouldn't open. Probably because there's no electricity\n" +
                        "The tablet is covered in a black case with a yellow mouse printed on it. In one corner, there was a yellow mouse pendant";
            }
        };
    }
}
