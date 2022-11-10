package tbcbuild.card.level1;

import tbcbuild.cardGenerator.InteractiveList;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.InfoedNormalCard;
import tbcbuild.cardType.FindingCard;
import tbcbuild.base.InfoCarrier;

public class Finding_ElectricWell extends FindingCard implements InfoCarrier, Printer {
    public Finding_ElectricWell(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Finding_ElectricWell() {
        super();
    }

    @Override
    public String description() {
        return "小铁门内是一簇又一簇，整整齐齐的电线捆。你抬头看去，他们来自漆黑的上方。低下头看去，他们去向深渊般的地下。\n" +
                "铁管内隐隐约约能听到呼啸的风声，在空无一人的世界里，这唯一的声音格外的诡异与不详。\n" +
                "\n";
    }

    @Override
    public String carriedInfo() {
        return "ue_li";
    }

    @Override
    public CardPrinter printer() {
        return new InfoedNormalCard() {
            @Override
            public String getCarriedInfo() {
                return "ue_li";
            }

            @Override
            public InteractiveList fpIl() {
                return null;
            }

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
                return "Inside the little iron door were clusters of neat bundles of wire. You look up, they came from above. Look down, they are going toward the abyss.\n" +
                        "The whistling wind can be faintly heard inside the iron pipe. In the empty world, this only sound is particularly strange and ominous." +
                        "\n";
            }
        };
    }
}
