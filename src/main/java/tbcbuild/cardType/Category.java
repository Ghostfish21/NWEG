package tbcbuild.cardType;

import tbcbuild.base.CateHandable;
import tbcbuild.base.Describable;
import tbcbuild.base.Handable;
import tbcbuild.base.NameTag;

import static tbcbuild.CategorySet.*;

public interface Category extends Describable, NameTag {
    static void register(Class<? extends Category> clazz, Category emptyInstance) {
        int index = categorySet.size() + 1;
        categorySet.put(index + "", clazz);
        indices.put(clazz, index + "");
        instance.put(clazz, emptyInstance);
    }

    static Handable handable(Class<? extends Category> clazz) {
        return new CateHandable(clazz);
    }

    static Card card(Class<? extends Category> clazz) {
        return new CateCard(clazz);
    }

    String exportLore();

    default String export() {
        return nameTag() + "\n\n" + description();
    }

    default <T extends Category> void setInstance(T instance) {}

    default Class<? extends Category> getClazz() {
        return this.getClass();
    }
}
