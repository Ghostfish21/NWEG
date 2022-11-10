package tbcbuild.specialText.anabosisCenter;

import tbcbuild.base.STLevel;
import tbcbuild.cardType.SpecialText;

import java.util.ArrayList;

public class AnabosisCenter extends STLevel {
    @Override
    public ArrayList<SpecialText> specialTexts() {
        return new ArrayList<>(){{
            add(new Dairy_QingYun());
            add(new Info_ItemCard());
            add(new Info_Physical());
            add(new InteractBook_TheRobot());
            add(new InteractBook_UsableRobot());
        }};
    }
}
