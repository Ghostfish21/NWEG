package tbcbuild;

import tbcbuild.*;
import tbcbuild.cardType.*;

public class Util {
    public static String typeName(Card card) {
        if (card instanceof FindingCard) return "Finding Card";
        if (card instanceof ItemCard) return "Item Card";
        if (card instanceof MapCard) return "Map Card";
        if (card instanceof MiscCard) return "Misc Card";
        if (card instanceof ObjectCard) return "Object Card";
        if (card instanceof PlotCard) return "Plot Card";
        if (card instanceof QuestionCard) return "Question Card";
        return "未知";
    }

    public static String cardIndex(Class<? extends Card> card) {
        return CardSet.cardIndex(card);
    }

    public static String obtain(boolean showType, Card... cards) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Please obtain ");
        if (showType) {
            for (Card cardo : cards) {
                String index = cardIndex(cardo.getClass());
                if (index.length() == 1) index = "00"+index;
                if (index.length() == 2) index = "0"+index;
                stringBuilder.append(typeName(cardo))
                        .append(" ")
                        .append(index)
                        .append(", ");
            }
        } else {
            for (Card cardo : cards) {
                String index = cardIndex(cardo.getClass());
                if (index.length() == 1) index = "00"+index;
                if (index.length() == 2) index = "0"+index;
                stringBuilder.append("Card ")
                        .append(" ")
                        .append(index)
                        .append(", ");
            }
        }
        return stringBuilder.substring(0, stringBuilder.length()-2);
    }

    public static String obtainSt(boolean isObtainable, SpecialText... specialTexts) {
        StringBuilder stringBuilder = new StringBuilder();
        if (isObtainable) stringBuilder.append("Please obtain ");

        for (SpecialText specialText : specialTexts) {
            Class<? extends SpecialText> specialTextClass = specialText.getClass();
            stringBuilder.append(SpecialTextSet.instance.get(specialTextClass).getReferName())
                    .append(", ");
        }

        return stringBuilder.substring(0, stringBuilder.length()-2);
    }

    public static String specialTextIndex(Class<? extends SpecialText> st) {
        return SpecialTextSet.stIndex(st);
    }
}
