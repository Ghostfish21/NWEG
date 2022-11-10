package tbcbuild.card.level1;

import tbcbuild.cardGenerator.InteractiveList;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.FindingCard;

import static tbcbuild.Util.obtain;

public class Finding_HibernateTankInternal extends FindingCard implements Printer {
    public Finding_HibernateTankInternal(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Finding_HibernateTankInternal() {
        super();
    }

    @Override
    public String description() {
        return "你借着你发现的缺口，废了九牛二虎之力拆掉了周围其他几个半损坏的钢板，" +
                obtain(true, new Item_WarpedMetalBoard(), new Item_MetalDebris()) +
                "\n" +
                "你看到钢板上有一些坑坑洼洼的弹坑和划痕，有些甚至吧钢板切开了一部分。似乎有人破坏过这个冬眠仓\n" +
                "你向冬眠仓的内部机箱望去，发现了两块仍旧可以拆下来的物品。耗费一点体力，然后" +
                obtain(true, new Item_BoxBattery_Info1(), new Item_BoxBattery_Info2()) +
                "\n" +
                "投掷1d6骰子，点数不等于6则 " +
                obtain(true, new Finding_EmptyHolderInTank());
    }

    @Override
    public CardPrinter printer() {
        return new NormalCard() {
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
                return "You took advantage of the breach you found, and with great effort removed several other half-damaged steel plates around it, 粗" +
                        obtain(true, new Item_WarpedMetalBoard(), new Item_MetalDebris()) +
                        "细\n" +
                        "You can see some craters and scratches on the steel plate, and some of them even have part of the steel plate cut. Looks like someone's been sabotaging this hibernate tank\n" +
                        "You look into the inner case of the hibernate tank and see two pieces that can still be removed. Spend 1 point of physical power and then 粗" +
                        obtain(true, new Item_BoxBattery_Info1(), new Item_BoxBattery_Info2()) +
                        "细\n" +
                        "Draw a 1d6 die, if the face you get is not 6, then 粗" +
                        obtain(true, new Finding_EmptyHolderInTank());
            }
        };
    }
}
