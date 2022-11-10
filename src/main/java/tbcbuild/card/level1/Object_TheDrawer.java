package tbcbuild.card.level1;

import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.ObjectCard;
import tbcbuild.base.InteractiveList;

import static tbcbuild.Util.obtain;

public class Object_TheDrawer extends ObjectCard implements Printer {
    public Object_TheDrawer(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Object_TheDrawer() {
        super();
    }

    @Override
    public String description() {
        return "你打开的柜台的抽屉，它是一个木制的柜子，可惜里面空空如也。\n" +
                "你不死心的伸手往里面摸了摸，摸到了一个光滑的物体。" +
                obtain(true, new Item_PersonalPanel_WangHao(), new Misc_PersonalPanelChoice());
    }

    @Override
    public InteractiveList interactiveList() {
        return null;
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
                return null;
            }

            @Override
            public String description() {
                return "You opened the wooden counter drawer. However, it is empty inside.\n" +
                        "You reach inside and touch it and you feel something smooth. 粗" +
                        obtain(true, new Item_PersonalPanel_WangHao(), new Misc_PersonalPanelChoice());
            }
        };
    }
}
