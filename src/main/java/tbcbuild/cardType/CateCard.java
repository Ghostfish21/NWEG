package tbcbuild.cardType;

import tbcbuild.CategorySet;
import tbcbuild.base.Describable;
import tbcbuild.base.Handable;

public class CateCard extends Card {
    public Class<? extends Category> cateClazz;

    public CateCard(Class<? extends Category> clazz) {
        super(true);
        this.cateClazz = clazz;
    }

    public CateCard() {
        super();
    }

    public String getReferName() {
        String typeName = "Category";
        String index = CategorySet.indices.get(cateClazz);
        if (index.length() == 1) index = "00"+index;
        else if (index.length() == 2) index = "0"+index;
        return index + " " + typeName;
    }
}
