package tbcbuild.card.level1;

import tbcbuild.cardGenerator.InteractiveList;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.InfoedNormalCard;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.ItemCard;
import tbcbuild.base.InfoCarrier;

public class Item_BoxBattery_Info1 extends ItemCard implements InfoCarrier, Printer {
    public Item_BoxBattery_Info1(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Item_BoxBattery_Info1() {
        super();
    }

    @Override
    public int space() {
        return 3;
    }

    @Override
    public String description() {
        return "这似乎是一块电池。一大块黑色的东西，像砖头一样。你毫不怀疑只要用力就可以拿这块砖头对别人造成可观的伤害。\n" +
                "\n" +
                "正面是电池的渲染图\n" +
                "背面是电池上的信息\n" +
                "Rodríguez兄弟工业集团\n" +
                "石墨烯电池\n" +
                "12V 48Ah 328A(5AE)\n" +
                "型号：EKCG5E\n" +
                "警告\n" +
                "可能引发明火或持续燃烧。请不要尝试拆解，重击，燃烧，或穿刺本产品\n" +
                "日本制造\n" +
                "可回收";
    }

    @Override
    public String carriedInfo() {
        return "Finding";
    }

    @Override
    public CardPrinter printer() {
        return new InfoedNormalCard() {
            @Override
            public String getCarriedInfo() {
                return carriedInfo();
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
                return "Occupies 3\n\nThis appears to be a battery. A big black thing, like a brick. You have no doubt that you can do considerable damage to someone with a single hit with this brick.\n" +
                        "\n" +
                        "Rodriguez Brothers Collective Force\n" +
                        "Graphene Battery\n" +
                        "12V 48Ah 328A(5AE)\n" +
                        "Model：EKCG5E\n" +
                        "Warning\n" +
                        "May cause open fire and continue burning. Do not attempt to disassemble, pound, burn, or puncture this product\n" +
                        "Made in Japan\n" +
                        "Recyclable";
            }
        };
    }
}
