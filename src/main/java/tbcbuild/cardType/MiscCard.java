package tbcbuild.cardType;

import tbcbuild.base.Describable;
import tbcbuild.base.Handable;
import tbcbuild.cardType.Card;

public abstract class MiscCard extends Card implements Handable, Describable {
    public MiscCard(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public MiscCard() {
        super();
    }
}
