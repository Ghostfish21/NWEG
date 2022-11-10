package tbcbuild.base;

import tbcbuild.CategorySet;
import tbcbuild.cardType.Category;

public class CateHandable implements Handable {
    public Class<? extends Category> categoryClass;

    public CateHandable(Class<? extends Category> clazz) {
        this.categoryClass = clazz;
    }

    public String getReferName() {
        String typeName = "类目卡";
        String index = CategorySet.indices.get(categoryClass);
        return index + " " + typeName;
    }
}
