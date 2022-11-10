package tbcbuild.cardType;

import tbcbuild.Util;
import tbcbuild.base.Describable;
import tbcbuild.base.NameTag;
import tbcbuild.base.Obtainable;

import static tbcbuild.SpecialTextSet.instance;


public abstract class SpecialText implements Describable, NameTag, Obtainable {
    public String getReferName() {
        String index = Util.specialTextIndex(getClass());
        String stName = instance.get(getClass()).nameTag();
        return index + " " + stName;
    }

    public String export() {
        return nameTag() + "\n\n" + description();
    }
}
