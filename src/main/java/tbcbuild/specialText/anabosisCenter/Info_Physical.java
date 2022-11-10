package tbcbuild.specialText.anabosisCenter;

import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.PureDescriptions;
import tbcbuild.cardType.SpecialText;

public class Info_Physical extends SpecialText implements Printer {
    @Override
    public String description() {
        return "粗Physical Card description细\n\n\nPlayer own 20 physical points in total";
    }

    @Override
    public String nameTag() {
        return "Physical Point Description";
    }

    @Override
    public CardPrinter printer() {
        return new PureDescriptions(Info_Physical.this.description()) {
            @Override
            public String cardName() {
                return getReferName();
            }

            @Override
            public String title() {
                return getReferName();
            }

            @Override
            public String cate() {
                return null;
            }

            @Override
            public String description() {
                return "";
            }
        };
    }
}
