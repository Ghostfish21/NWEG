package tbcbuild.base;

import tbcbuild.cardType.ItemCard;
import tbcbuild.cardType.MiscCard;
import tbcbuild.cardType.QuestionCard;

import java.util.ArrayList;
import java.util.Arrays;

public class InteractiveChoice {
    public String description;
    public boolean isImportant;
    public boolean isTrash;
    public ArrayList<Handable> condition;

    public InteractiveChoice(String description, boolean isImportant, ArrayList<Handable> condition) {
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

    public static InteractiveChoice ic(String description, boolean isImportant, Handable... condition) {
        ArrayList<Handable> handables = new ArrayList<>(Arrays.asList(condition));
        return new InteractiveChoice(description, isImportant, handables);
    }

    public InteractiveChoice tc() {
        this.isTrash = true;
        return this;
    }

    public tbcbuild.cardGenerator.InteractiveChoice forPrint() {
        ArrayList<String> fpcondition = new ArrayList<>();
        for (Handable handable : this.condition) {
            if (handable instanceof ItemCard itemCard) fpcondition.add(itemCard.getReferName());
            else if (handable instanceof MiscCard miscCard) fpcondition.add(miscCard.getReferName());
            else if (handable instanceof CateHandable cateHandable) fpcondition.add(cateHandable.getReferName());
            else if (handable instanceof QuestionCard questionCard) fpcondition.add(questionCard.getReferName());
        }

        tbcbuild.cardGenerator.InteractiveChoice fpic = new tbcbuild.cardGenerator.InteractiveChoice(description, isImportant, fpcondition);
        if (isTrash) fpic.tc();
        return fpic;
    }
}
