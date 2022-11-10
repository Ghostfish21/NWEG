package tbcbuild.specialText.friendIA;

import tbcbuild.base.STLevel;
import tbcbuild.cardType.SpecialText;

import java.util.ArrayList;

public class FriendIA extends STLevel {
    @Override
    public ArrayList<SpecialText> specialTexts() {
        return new ArrayList<>() {{
            add(new InteractBook_IA());
            add(new FilesInTechnicalDepartment());
            add(new Dairy_912());
        }};
    }
}
