package tbcbuild.cardGenerator;

import tbcbuild.cardType.Card;

import java.util.ArrayList;
import java.util.Arrays;

public class InteractiveChoice {
    public String description;
    public boolean isImportant;
    public boolean isTrash;
    public ArrayList<String> condition;

    public InteractiveChoice(String description, boolean isImportant, ArrayList<String> condition) {
        this.condition = condition;
        this.isImportant = isImportant;
        this.description = description;
    }

    public static InteractiveChoice ic(String description) {
        return new InteractiveChoice(description, false, new ArrayList<>());
    }

    public static InteractiveChoice ic(String description, boolean isImportant) {
        return new InteractiveChoice(description, isImportant, new ArrayList<>());
    }

    public static InteractiveChoice ic(String description, boolean isImportant, Card... condition) {
        ArrayList<Card> handables = new ArrayList<>(Arrays.asList(condition));
        ArrayList<String> strHandables = new ArrayList<>() {{
            for (Card card : handables)
                add(card.getReferName());
        }};
        return new InteractiveChoice(description, isImportant, strHandables);
    }

    public InteractiveChoice tc() {
        this.isTrash = true;
        return this;
    }
}
