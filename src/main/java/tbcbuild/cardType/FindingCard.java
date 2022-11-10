package tbcbuild.cardType;

import tbcbuild.base.Describable;
import tbcbuild.cardType.Card;

public abstract class FindingCard extends Card implements Describable {
    public FindingCard(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public FindingCard() {}
}
