package tbcbuild.base;

import java.util.ArrayList;

public interface CategoryChild {
    ArrayList<String> categories();

    default String exportText() {
        String export = "类目卡 ";
        ArrayList<String> cate = categories();
        for (String index : cate)
            export += index + ", ";
        export = export.substring(0, export.length()-2);
        return export;
    }

    String exportCateText();
}
