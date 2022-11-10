package tbcbuild.specialText.oldWorld;

import tbcbuild.base.STLevel;
import tbcbuild.cardType.SpecialText;

import java.util.ArrayList;

public class OldWorld extends STLevel {
    @Override
    public ArrayList<SpecialText> specialTexts() {
        return new ArrayList<>() {{
            add(new WorldBackground());
            add(new NewWorldExplorationGuideline());
        }};
    }
}
