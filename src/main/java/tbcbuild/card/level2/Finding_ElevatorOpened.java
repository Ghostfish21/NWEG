package tbcbuild.card.level2;

import tbcbuild.cardGenerator.InteractiveList;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.PlotCard;

import static tbcbuild.Util.obtain;

public class Finding_ElevatorOpened extends PlotCard implements Printer {
    public Finding_ElevatorOpened(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Finding_ElevatorOpened() {
        super();
    }

    @Override
    public String description() {
        return "你用尽了全身的力气，但是和你想象中不一样的是，电梯门竟然被你打开了\n" +
                "还好你没有着急往里面走，因为电梯并没有停在你现在所在的楼层。\n" +
                "电梯井和电井一样，仿佛从头顶的黑暗里凭空浮现，却又消失在脚底的深渊。一眼望不到头\n" +
                "突然，你注意到电梯间上面闪过一道橙光，但是像走马灯一般的迅速又消失不见。\n" +
                "世界仍然是黑暗的，仿佛刚才的光芒只是一种错觉\n" +
                "\n" +
                "这个时候，你注意到在电梯井里距离你不远的地方有一个齿轮一样的东西。它正面朝着你，齿轮的中间印着一个笑容\n" +
                "只是，这个笑容与其说是幸福的笑容，不如说是它在不怀好意的裂开嘴看着你。\n" +
                "哈哈哈\n" +
                "\n" +
                "你看着旁边的电梯索绳，感觉去获得那颗齿轮并不是什么难事。只要你轻轻一跳，抓住电梯的绳索，然后齿轮便唾手可得\n" +
                "可以投掷一次1d6骰子，并" + obtain(true, new Plot_PlayerFall());
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
                return "You exhausted all your strength, but unlike what you imagined, the elevator door was opened by you\n" +
                        "Fortunately, you didn't rush to go inside, because the elevator didn't stop at the floor where you are now.\n" +
                        "The elevator shaft, like the electric well, seems to emerge out of thin air from the darkness overhead, but disappears into the abyss at the bottom of the foot. Can't see the end\n" +
                        "Suddenly, you notice a flash of orange light in the shaft, but it disappears quickly like a trotting horse lamp.\n" +
                        "The world is still dark, as if the light just now was just an illusion\n" +
                        "\n" +
                        "At this point, you notice a gear-like thing in the shaft not far from you. It's facing toward you, with a smile in the middle of the gear\n" +
                        "However, this smile is not so much a happy smile as it is looking at you with malicious intent.\n" +
                        "Hahaha\n" +
                        "\n" +
                        "You look at the elevator ropes next to you and feel that it is not difficult to get the gear. As long as you hop, grab the ropes of the elevator, and the gears are at your fingertips\n" +
                        "Can roll 1d6 dice once and 粗" + obtain(true, new Plot_PlayerFall());
            }
        };
    }
}
