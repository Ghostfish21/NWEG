package tbcbuild.card.level2;

import tbcbuild.base.InteractiveList;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;

public class Object_UnpoweredMonitor2 extends tbcbuild.cardType.ObjectCard implements Printer {
    public Object_UnpoweredMonitor2(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Object_UnpoweredMonitor2() {
        super();
    }

    @Override
    public String description() {
        return "这是一台薄薄的黑色显示器，屏幕上的保护膜还没有被扯下来。你伸手按了按显示屏的开关。但是屏幕并没有亮起来。";
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
                return "It's a thin black monitor, and the protective film on the screen hasn't been ripped off. You reached out and pressed the boost button underneath the monitor, but it still isn't lighting up.";
            }
        };
    }
}
