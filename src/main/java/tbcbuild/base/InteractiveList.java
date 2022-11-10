package tbcbuild.base;

import tbcbuild.CategorySet;
import tbcbuild.cardType.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class InteractiveList {
    public LinkedHashMap<InteractiveChoice, ArrayList<Obtainable>> interactiveList = new LinkedHashMap<>();

    public tbcbuild.cardGenerator.InteractiveList forPrint() {
        tbcbuild.cardGenerator.InteractiveList fpil = new tbcbuild.cardGenerator.InteractiveList();
        ArrayList<InteractiveChoice> ics = new ArrayList<>(this.interactiveList.keySet());
        for (InteractiveChoice ic : ics) {
            tbcbuild.cardGenerator.InteractiveChoice fpic = ic.forPrint();
            ArrayList<String> fpobtainables = new ArrayList<>();
            ArrayList<Obtainable> obtainables = this.interactiveList.get(ic);
            for (Obtainable card : obtainables) {
                if (card instanceof CateCard card1)
                    fpobtainables.add(card1.getReferName());
                else if (card instanceof Card card1)
                    fpobtainables.add(card1.getReferName());
                else if (card instanceof SpecialText specialText)
                    fpobtainables.add(specialText.getReferName());
                else if (card instanceof RandomObtainable ro)
                    fpobtainables.add(ro.getReferName());
            }
            fpil.add(fpic, fpobtainables);
        }

        return fpil;
    }

    public void add(InteractiveChoice ic, Obtainable... cards) {
        interactiveList.put(ic, new ArrayList<>(Arrays.asList(cards)));
    }

    public String exportText() {
        StringBuilder horizontalDivider = new StringBuilder();
        String verticalDivider = " | ";
        int maxLineLength = 0;
        ArrayList<Line> lines = new ArrayList<>();

        ArrayList<InteractiveChoice> indices = new ArrayList<>(interactiveList.keySet());
        StringBuilder line1;
        StringBuilder line2 = null;
        for (InteractiveChoice ic : indices) {
            line1 = new StringBuilder(ic.description);
            if (ic.isImportant) line1.append(" ⭐");
            if (ic.isTrash) line1.append(" ×");
            if (line2 != null) {
                if (line1.length() < line2.length()) {
                    for (int i = 0; i < (line2.length() - line1.length()); i++)
                        line1.append(" ");
                }
            }
            line1.append(verticalDivider);
            ArrayList<Obtainable> cards = interactiveList.get(ic);
            for (Obtainable card : cards) {
                if (card instanceof CateCard card1)
                    line1.append(card1.getReferName()).append(", ");
                else if (card instanceof Card card1)
                    line1.append(card1.getReferName()).append(", ");
                else if (card instanceof SpecialText specialText)
                    line1.append(specialText.getReferName()).append(", ");
                else if (card instanceof RandomObtainable ro)
                    line1.append(ro.getReferName()).append(", ");
            }
            line1 = new StringBuilder(line1.substring(0, line1.length() - 2));
            if (ic.condition != null && ic.condition.size() != 0) {
                line2 = new StringBuilder();
                for (Handable handable : ic.condition) {
                    if (handable instanceof ItemCard itemCard) line2.append(itemCard.getReferName()).append(", ");
                    else if (handable instanceof MiscCard miscCard) line2.append(miscCard.getReferName()).append(", ");
                    else if (handable instanceof CateHandable cateHandable) line2.append(cateHandable.getReferName()).append(", ");
                    else if (handable instanceof QuestionCard questionCard) line2.append(questionCard.getReferName()).append(", ");
                }
                try {
                    line2 = new StringBuilder(line2.substring(0, line2.length() - 2));
                } catch (StringIndexOutOfBoundsException e) {
                    e.printStackTrace();
                }
                if (line2.length() < line1.length()) {
                    for (int i = 0; i < (line1.length() - line2.length()); i++)
                        line2.append(" ");
                }
                line2.append(verticalDivider);
            }


            Line line = new Line();
            if (line1 != null) {
                if (line1.length() > maxLineLength) maxLineLength = line1.length();
                line.line1 = line1.toString();
            }
            if (line2 != null) {
                if (line2.length() > maxLineLength) maxLineLength = line2.length();
                line.line2 = line2.toString();
                line2 = null;
            }
            lines.add(line);
        }

        for (int i = 0; i < maxLineLength; i++)
            horizontalDivider.append("--");

        StringBuilder export = new StringBuilder();
        for (Line line : lines) {
            export.append("\n").append(horizontalDivider).append("\n");
            export.append(line.line1);
            if (line.line2 != null) {
                export.append("\n").append(line.line2);
            }
        }
        export.append("\n").append(horizontalDivider);

        return export.toString();
    }

    private static class Line {
        public String line1;
        public String line2;
    }
}
