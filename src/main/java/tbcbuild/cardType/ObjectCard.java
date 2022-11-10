package tbcbuild.cardType;

import tbcbuild.base.Describable;
import tbcbuild.base.Explorable;
import tbcbuild.cardType.Card;

public abstract class ObjectCard extends Card implements Describable, Explorable {
    public ObjectCard(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public ObjectCard() {
        super();
    }
}
