package tbcbuild.base;

import tbcbuild.SpecialTextSet;
import tbcbuild.cardType.SpecialText;

import java.util.ArrayList;

public abstract class STLevel {
    public void register() {
        ArrayList<SpecialText> texts = specialTexts();
        for (int i = 0; i < texts.size(); i++) {
            String index = SpecialTextSet.stMainCount + "-" + (i+1);
            SpecialTextSet.stSet.put(index, texts.get(i).getClass());
            SpecialTextSet.indices.put(texts.get(i).getClass(), index);
            SpecialTextSet.instance.put(texts.get(i).getClass(), texts.get(i));
        }
        SpecialTextSet.stMainCount++;
    }

    public abstract ArrayList<SpecialText> specialTexts();
}
