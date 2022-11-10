package tbcbuild.card.level1;

import tbcbuild.cardGenerator.InteractiveChoice;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.ObjectCard;
import tbcbuild.base.InteractiveList;

import static tbcbuild.base.InteractiveChoice.ic;

public class Object_AnabiosisGate extends ObjectCard implements Printer {
    public Object_AnabiosisGate(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Object_AnabiosisGate() {
        super();
    }

    @Override
    public String description() {
        return "这是一座不小的大门。门上已经落满了灰尘，已经有很久没有人将其打开过了\n" +
                "和大厅的纯净柔和不同，这是一扇灰黑色的大铁门，铁门上有一个淡淡的血手印。\n" +
                "门上方有一个黄黑条纹样式的门框。铁门让你想起了不算遥远的过去，那段压抑，无情，麻木的日子。\n" +
                "你猛地摇了摇头，想把不愉快的事情抛出脑外。却不经意间看到了血手印的下方散落着一些小小的罐子";
    }

    @Override
    public InteractiveList interactiveList() {
        InteractiveList il = new InteractiveList();
        il.add(ic("强行打开大门，耗费两点体力"), new Finding_GateNotOpen());
        il.add(ic("与门上的显示屏交互"), new Finding_InteractPadNotResponding());
        il.add(ic("捡起地上的罐子"), new Item_SmallCoolant());
        return il;
    }

    @Override
    public CardPrinter printer() {
        return new NormalCard() {
            @Override
            public tbcbuild.cardGenerator.InteractiveList fpIl() {
                tbcbuild.cardGenerator.InteractiveList il = new tbcbuild.cardGenerator.InteractiveList();
                il.add(InteractiveChoice.ic("Use 2 points of physical power, attempt to force open the gate"), new Finding_GateNotOpen());
                il.add(InteractiveChoice.ic("Interact with the panel on the gate"), new Finding_InteractPadNotResponding());
                il.add(InteractiveChoice.ic("Pick up small containers on the floor"), new Item_SmallCoolant());
                return il;
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
                return "This is not a small gate. The door was covered with dust and had not been opened for a while.\n" +
                        "In contrast to the purity and softness of the hall, it is a large gray-black iron door with a faint bloody handprint on it.\n" +
                        "There is a yellow and black striped frame above the door. Iron gate reminds you of the distant past, that period of repression, ruthless, numb days.\n" +
                        "You shake your head violently, trying to push the unpleasant incident out of your mind. But inadvertently saw some small POTS scattered under the blood handprint.";
            }
        };
    }
}
