package tbcbuild.cardType;

import tbcbuild.CardSet;
import tbcbuild.CategorySet;
import tbcbuild.Util;
import tbcbuild.base.*;

import java.util.ArrayList;

import static tbcbuild.CardSet.*;

public class Card implements Obtainable {
    public Card(boolean bypassValidCheck) {}

    public Card() {
        isCardRegistered();
    }

    public void register() {
        if (this instanceof Parent repeating) {
            ArrayList<Card> variant = repeating.variant();
            for (int i = 0; i < variant.size(); i++) {
                cardSet.put(cardMainCount + 1 + "-" + (i + 1), variant.get(i).getClass());
                indices.put(variant.get(i).getClass(), cardMainCount + 1 + "-" + (i + 1));
                instance.put(variant.get(i).getClass(), variant.get(i));
            }
        } else {
            cardSet.put(cardMainCount + 1 + "", getClass());
            indices.put(getClass(), cardMainCount + 1 + "");
            instance.put(getClass(), this);
        }
        cardMainCount++;
    }
    public String c() {
        isCardRegistered();
        return "";}

    public String export() {
        String export = "";
        export += getReferName() + "\n\n";

        if (this instanceof CategoryChild categoryChild)
            export += categoryChild.exportText()+"\n\n";
        if (this instanceof ItemCard itemCard)
            export += "占地 " + itemCard.space() + "\n\n";
        if (this instanceof Describable describable)
            export += describable.description() + "\n\n";
        if (this instanceof Explorable explorable && explorable.interactiveList() != null)
            export += explorable.interactiveList().exportText() + "\n\n";
        if (this instanceof QuestionCard questionCard)
            export += questionCard.exportText() + "\n\n";
        if (this instanceof CategoryChild categoryChild)
            export += categoryChild.exportCateText() + "\n\n";
        if (this instanceof InfoCarrier infoCarrier)
            export += "卡牌上印有信息： " + infoCarrier.carriedInfo() + "\n\n";
        if (this instanceof Duplicate duplicate)
            export += "\n该卡牌一共有 " + duplicate.amount() + " 个";

        return export;
    }

    public String getReferName() {
        isCardRegistered();
        String index = Util.cardIndex(getClass());
        if ((getMainIndex()+"").length() == 1)
            index = "00"+index;
        else if ((getMainIndex()+"").length() == 2)
            index = "0"+index;
        String typeName = Util.typeName(instance.get(getClass()));
        return index + " " + typeName;
    }

    public int getMainIndex() {
        String index = Util.cardIndex(getClass());
        if (index.contains("-"))
            return Integer.parseInt(index.split("-")[0]);
        return Integer.parseInt(index);
    }

    public int getSubIndex() {
        String index = Util.cardIndex(getClass());
        if (index.contains("-"))
            return Integer.parseInt(index.split("-")[1]);
        return -1;
    }

    public void isCardRegistered() {
        if (this instanceof CateCard card) {
            if (CategorySet.indices.containsKey(card.cateClazz)) return;
        } else {
            if (indices.containsKey(getClass())) return;
        }
        if (this instanceof CateCard card) {
            System.out.println(card.cateClazz.toString());
        } else {
            System.out.println(getClass().toString());
        }
        new ComponentNotRegisteredException().printStackTrace();
        System.exit(1);
    }
}
