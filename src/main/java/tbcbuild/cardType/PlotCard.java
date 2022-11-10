package tbcbuild.cardType;

import tbcbuild.base.Describable;
import tbcbuild.cardType.Card;

public abstract class PlotCard extends Card implements Describable {
    public PlotCard(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public PlotCard() {
        super();
    }
}
