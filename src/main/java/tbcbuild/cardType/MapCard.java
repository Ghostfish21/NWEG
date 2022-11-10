package tbcbuild.cardType;

import tbcbuild.base.Describable;
import tbcbuild.base.Explorable;
import tbcbuild.cardType.Card;

public abstract class MapCard extends Card implements Describable, Explorable {
    public MapCard(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public MapCard() {
        super();
    }
}
