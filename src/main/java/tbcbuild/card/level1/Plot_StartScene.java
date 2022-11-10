package tbcbuild.card.level1;

import tbcbuild.cardGenerator.InteractiveList;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.PlotCard;
import tbcbuild.specialText.oldWorld.NewWorldExplorationGuideline;
import tbcbuild.specialText.oldWorld.WorldBackground;

import static tbcbuild.Util.obtain;
import static tbcbuild.Util.obtainSt;

public class Plot_StartScene extends PlotCard implements Printer {


    public Plot_StartScene(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Plot_StartScene() {
        super();
    }

    @Override
    public String description() {
        return "在开始前，请阅读世界背景" + obtainSt(true, new WorldBackground(), new NewWorldExplorationGuideline()) +
                "\n\n\n\n\n\n" +
                "嘶——\n" +
                "\n" +
                "冰冷的棺材发出了漏气的声音。散发出来的寒气仿佛是死亡世界探出的触手一般，肆无忌惮的朝这个新世界挥舞着自己的爪牙\n" +
                "\n" +
                "你醒了，\n" +
                "这里就是新世界吗，你喃喃自语道。\n" +
                "\n" +
                "你成功的移民了，脱离了噩梦一般的旧世界，可是眼前的新世界也散发着令人不安的气息。\n" +
                "这个时候应该有人在冬眠仓外面接应你一开始的不适期，可是现在除了冬眠仓运行的声音外，整个世界都是静默的，也是黑暗的。\n" +
                "\n" +
                "等待眼睛逐渐熟悉黑暗的环境后，身下的冬眠仓也逐渐的没有了声响。你折腾了好半天坐了起来，缓缓的环顾四周。" +
                "\n" +
                obtain(true, new Map_FireSeedAnabiosisCenter());
    }

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
                return "Before start, please read the world background documents. 粗" + obtainSt(true, new WorldBackground(), new NewWorldExplorationGuideline()) +
                        "细\n\n\n\n\n\n" +
                        "Si——\n" +
                        "\n" +
                        "Cold coffin made a leaking sound. The cold air emit from the internal like the tentacle of the world of death, flauting its pawn to the new world like nothing could stop it.\n" +
                        "\n" +
                        "You wake up,\n" +
                        "Is this the new world? You mumbles.\n" +
                        "\n" +
                        "You successfully emigrated and detached from the nightmiry old world. However, the new world in front of you is also making you feel unsettle.\n" +
                        "There should be personel with expertise take care you during the unfit period right after anabosis. Instead, the world is silent, and dark except the sound of the hibernation tank.\n" +
                        "\n" +
                        "After your eyes get used to the dark environment, the sound that hibernation tank made underneath you gradually ceased. It took a lot effort to get up, with your unwaken body. You look around unhurried." +
                        "\n粗" +
                        obtain(true, new Map_FireSeedAnabiosisCenter());
            }
        };
    }
}
