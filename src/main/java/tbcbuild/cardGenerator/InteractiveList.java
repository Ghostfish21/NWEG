package tbcbuild.cardGenerator;

import tbcbuild.cardType.Card;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;

public class InteractiveList {
    public LinkedHashMap<InteractiveChoice, ArrayList<String>> interactiveList = new LinkedHashMap<>();

    public void add(InteractiveChoice ic, ArrayList<String> cards) {
        interactiveList.put(ic, cards);
    }

    public void add(InteractiveChoice ic, String... cards) {
        interactiveList.put(ic, new ArrayList<>(Arrays.asList(cards)));
    }

    public void add(InteractiveChoice ic, Card... cards) {
        interactiveList.put(ic, new ArrayList<>() {{
            for (Card card : cards) {
                add(card.getReferName());
            }
        }});
    }

    public ArrayList<String[]> getLefts() {
        ArrayList<String[]> result = new ArrayList<>() {{
            add(new String[] {"Choices"});
        }};

        ArrayList<InteractiveChoice> indices = new ArrayList<>(interactiveList.keySet());
        StringBuilder line1;
        StringBuilder line2 = null;
        for (InteractiveChoice ic : indices) {
            line1 = new StringBuilder(ic.description);
            if (ic.isImportant) line1.append(" ⭐");
            if (ic.isTrash) line1.append(" ×");

            if (ic.condition != null && ic.condition.size() != 0) {
                line2 = new StringBuilder();
                for (String handable : ic.condition)
                    line2.append(handable).append(", ");
                try {
                    line2 = new StringBuilder(line2.substring(0, line2.length() - 2));
                } catch (StringIndexOutOfBoundsException e) {
                    e.printStackTrace();
                }
            }

            if (line2 == null) result.add(new String[] {line1.toString()});
            else result.add(new String[] {line1.toString(), line2.toString()});
            line2 = null;
        }

        return result;
    }

    public ArrayList<String> getRights() {
        ArrayList<String> result = new ArrayList<>() {{
            add("Consequence");
        }};

        ArrayList<InteractiveChoice> indices = new ArrayList<>(interactiveList.keySet());
        StringBuilder line1 = new StringBuilder();
        for (InteractiveChoice ic : indices) {
            ArrayList<String> cards = interactiveList.get(ic);
            for (String card : cards)
                line1.append(card).append(", ");
            line1 = new StringBuilder(line1.substring(0, line1.length() - 2));
            result.add(line1.toString());
            line1 = new StringBuilder();
        }

        return result;
    }
}
