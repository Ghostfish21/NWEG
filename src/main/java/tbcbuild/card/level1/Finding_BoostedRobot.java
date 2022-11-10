package tbcbuild.card.level1;

import tbcbuild.cardGenerator.InteractiveList;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.InfoedNormalCard;
import tbcbuild.cardType.FindingCard;
import tbcbuild.base.InfoCarrier;
import tbcbuild.specialText.anabosisCenter.InteractBook_TheRobot;

import static tbcbuild.Util.obtain;
import static tbcbuild.Util.obtainSt;

public class Finding_BoostedRobot extends FindingCard implements InfoCarrier, Printer {
    public Finding_BoostedRobot(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Finding_BoostedRobot() {
        super();
    }

    @Override
    public String description() {
        return "装上电池后不久，机器人猛地一颤，同时，垂下的头缓缓发出淡蓝色的光芒，照亮了它所朝向的地板，成为了黑暗中唯一的光源。\n" +
                "它抬起了头，环顾着四周，最后发现了你，并站了起来看着你\n" +
                "\n" +
                "正面是电池被安装上并且发出蓝光\n" +
                "背面是机器人抬头，眼睛里也散发出光芒，并站了起来看向你\n" +
                obtainSt(true, new InteractBook_TheRobot()) + "\n" +
                "\n" +
                "如果玩家当前没有该卡牌，则" + obtain(true, new Misc_IAIntro(), new Misc_PersonalPanelChoice());
    }

    @Override
    public String carriedInfo() {
        return "gh";
    }

    @Override
    public CardPrinter printer() {
        return new InfoedNormalCard() {
            @Override
            public String getCarriedInfo() {
                return "gh";
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
                return "Shortly after the battery was installed, the robot shaked and its downcast head slowly glowed pale blue, illuminating the floor it was facing and becoming to the only source of light in the darkness.\n" +
                        "It raises its head, looks around, finally sees you, and stands up to look at you\n" +
                        "\n粗" +
                        obtainSt(true, new InteractBook_TheRobot()) + "细\n" +
                        "\n" +
                        "If the player does not currently have the card, then 粗" + obtain(true, new Misc_IAIntro(), new Misc_PersonalPanelChoice());
            }

            @Override
            public InteractiveList fpIl() {
                return null;
            }
        };
    }
}
