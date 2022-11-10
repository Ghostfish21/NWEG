package tbcbuild;

import tbcbuild.cardType.SpecialText;
import tbcbuild.specialText.anabosisCenter.AnabosisCenter;
import tbcbuild.specialText.friendIA.FriendIA;
import tbcbuild.specialText.oldWorld.OldWorld;

import java.util.HashMap;

public class SpecialTextSet {
    public static final HashMap<String, Class<? extends SpecialText>> stSet = new HashMap<>();
    public static final HashMap<Class<? extends SpecialText>, String> indices = new HashMap<>();
    public static final HashMap<Class<? extends SpecialText>, SpecialText> instance = new HashMap<>();
    public static int stMainCount = 0;

    public SpecialTextSet() {
        new OldWorld().register();
        new AnabosisCenter().register();
        new FriendIA().register();
    }

    public static String stIndex(Class<? extends SpecialText> st) {
        return indices.getOrDefault(st, "未知");
    }
}