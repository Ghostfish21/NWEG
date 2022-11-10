package tbcbuild.cardType;

import tbcbuild.base.Describable;
import tbcbuild.base.Handable;
import tbcbuild.cardType.Card;

public abstract class ItemCard extends Card implements Handable, Describable {
    public ItemCard(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public ItemCard() {
        super();
    }

    public abstract int space();
}
