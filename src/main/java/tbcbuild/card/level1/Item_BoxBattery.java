package tbcbuild.card.level1;

import tbcbuild.cardGenerator.InteractiveList;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.Card;
import tbcbuild.cardType.ItemCard;
import tbcbuild.base.Parent;

import java.util.ArrayList;

public class Item_BoxBattery extends ItemCard implements Parent {
    public Item_BoxBattery(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Item_BoxBattery() {
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
    public ArrayList<Card> variant() {
        ArrayList<Card> children = new ArrayList<>();
        children.add(new Item_BoxBattery_Unpowered(true));
        children.add(new Item_BoxBattery_Info1(true));
        children.add(new Item_BoxBattery_Info2(true));
        return children;
    }
}
