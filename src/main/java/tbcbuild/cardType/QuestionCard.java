package tbcbuild.cardType;

import tbcbuild.base.Describable;
import tbcbuild.base.Handable;
import tbcbuild.cardType.Card;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class QuestionCard extends Card implements Describable, Handable {

    public QuestionCard(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public QuestionCard() {
        super();
    }

    public abstract String correctAnswer();

    /**
     * 返回可选答案集
     */
    public abstract HashMap<String, String> answers();

    public String exportText() {
        String export = correctAnswer();

        HashMap<String, String> answers = answers();

        if (answers != null && answers.size() != 0) {
            ArrayList<String> indices = new ArrayList<>(answers.keySet());
            for (String index : indices)
                export += "\n\n" + index + " - " + answers.get(index);
        }

        return export;
    }
}
