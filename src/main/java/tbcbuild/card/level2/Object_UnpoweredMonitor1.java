package tbcbuild.card.level2;

import tbcbuild.base.InteractiveList;
import tbcbuild.base.Parent;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.Card;
import tbcbuild.cardType.ObjectCard;

import java.util.ArrayList;

public class Object_UnpoweredMonitor1 extends ObjectCard implements Parent, Printer {
    public Object_UnpoweredMonitor1(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Object_UnpoweredMonitor1() {
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
    public ArrayList<Card> variant() {
        return new ArrayList<>() {{
            add(new Object_UnpoweredMonitor1(true));
            add(new Object_UnpoweredMonitor2(true));
        }};
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
