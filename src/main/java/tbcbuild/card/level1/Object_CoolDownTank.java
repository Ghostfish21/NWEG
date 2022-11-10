package tbcbuild.card.level1;

import tbcbuild.cardType.Card;
import tbcbuild.cardType.ItemCard;
import tbcbuild.base.Parent;

import java.util.ArrayList;

public class Object_CoolDownTank extends ItemCard implements Parent {
    public Object_CoolDownTank(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Object_CoolDownTank() {
        super();
    }

    @Override
    public int space() {
        return 20;
    }

    @Override
    public String description() {
        return "这是一个硕大的银白色桶子";
    }

    @Override
    public ArrayList<Card> variant() {
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(new Object_CoolDownTank_Filled(true));
        cards.add(new Object_CoolDownTank_Unfilled(true));
        return cards;
    }
}
