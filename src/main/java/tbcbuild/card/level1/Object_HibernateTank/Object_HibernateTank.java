package tbcbuild.card.level1.Object_HibernateTank;

import tbcbuild.cardType.Card;
import tbcbuild.cardType.ObjectCard;
import tbcbuild.base.InteractiveList;
import tbcbuild.base.Parent;

import java.util.ArrayList;

public class Object_HibernateTank extends ObjectCard implements Parent {
    public Object_HibernateTank(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Object_HibernateTank() {
        super();
    }

    @Override
    public String description() {
        return "";
    }

    @Override
    public InteractiveList interactiveList() {
        return null;
    }

    @Override
    public ArrayList<Card> variant() {
        return new ArrayList<>() {{
            add(new Object_HibernateTank_01(true));
            add(new Object_HibernateTank_02Battery(true));
            add(new Object_HibernateTank_03(true));
            add(new Object_HibernateTank_04PrivateSpace(true));
            add(new Object_HibernateTank_05(true));
            add(new Object_HibernateTank_06(true));
            add(new Object_HibernateTank_07(true));
            add(new Object_HibernateTank_08(true));
            add(new Object_HibernateTank_09(true));
            add(new Object_HibernateTank_10(true));
            add(new Object_HibernateTank_11(true));
            add(new Object_HibernateTank_12(true));
            add(new Object_HibernateTank_13ScrewDriver(true));
            add(new Object_HibernateTank_14(true));
            add(new Object_HibernateTank_15(true));
            add(new Object_HibernateTank_16(true));
        }};
    }
}
