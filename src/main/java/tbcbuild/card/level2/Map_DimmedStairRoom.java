package tbcbuild.card.level2;

import tbcbuild.card.level1.Map_FireSeedAnabiosisCenter;
import tbcbuild.cardGenerator.InteractiveChoice;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.MapCard;
import tbcbuild.base.InteractiveList;

import static tbcbuild.Util.obtain;
import static tbcbuild.base.InteractiveChoice.ic;

public class Map_DimmedStairRoom extends MapCard implements Printer {
    public Map_DimmedStairRoom(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Map_DimmedStairRoom() {
        super();
    }

    @Override
    public String description() {
        return "这是一间阴暗的楼梯间。尽管墙面是有白色瓷砖铺设的，但在这里，他们完全失去了原有的光泽和质感。\n" +
                "风声从你耳边流过，哐当！你来时的门猛地关上了。你折返回去，重新把门拉开，就像外面的世界能带给你一些勇气一样。但是很快，门又狠狠的被风关上。\n" +
                "你放弃了，仔细听时，你听到了风摇晃铁百叶窗的声音，而且，好像还隐隐约约能听到有人说话...？\n" +
                "\n" +
                obtain(true, new Plot_IAIsComing());
    }

    @Override
    public InteractiveList interactiveList() {
        return new InteractiveList() {{
            add(ic("下楼"), new Map_DimmedStairRoom_N1());
            add(ic("拉开左侧的门"), new Map_FireSeedAnabiosisCenter());
            add(ic("拉开右侧的门"), new Object_RightDoorOutsideAnabosisCenter());
        }};
    }

    @Override
    public CardPrinter printer() {
        return new NormalCard() {
            @Override
            public tbcbuild.cardGenerator.InteractiveList fpIl() {
                return new tbcbuild.cardGenerator.InteractiveList() {{
                    add(InteractiveChoice.ic("Downstairs "), new Map_DimmedStairRoom_N1());
                    add(InteractiveChoice.ic("Open the door on the left"), new Map_FireSeedAnabiosisCenter());
                    add(InteractiveChoice.ic("Open the door on the right"), new Object_RightDoorOutsideAnabosisCenter());
                }};
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
                return "It's a dark stairwell. Although the walls are covered with white tiles, here they have completely lost their original luster and texture.\n" +
                        "The sound of the wind flows through your ears, bang! The door slammed shut when you came. You turn back and open the door again, just as the outside world can give you some courage. But soon, the door was slammed shut by the wind.\n" +
                        "You gave up, and when you listened carefully, you heard the sound of the wind shaking the iron shutters, and, as if you could vaguely hear someone talking...?\n" +
                        "\n粗" +
                        obtain(true, new Plot_IAIsComing());
            }
        };
    }
}
