package tbcbuild.card.level2;

import tbcbuild.base.InteractiveList;
import tbcbuild.cardGenerator.InteractiveChoice;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.MapCard;

import static tbcbuild.base.InteractiveChoice.ic;
import static tbcbuild.base.RandomObtainable.ro;

public class Map_BackRoomTechnicalDepartment extends MapCard implements Printer {
    public Map_BackRoomTechnicalDepartment(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public Map_BackRoomTechnicalDepartment() {
        super();
    }

    @Override
    public String description() {
        return "你轻轻的推了一下门。和你预想不同的是，门开了。一股浓重的气味铺面而来，腥味夹杂着臭味酸味和灰尘味。仅仅是闻了一下，你剧烈的咳嗽了起来。\n" +
                "\n" +
                "房间的角落中堆放着一堆发青，枯槁的尸体。这些人身上都穿着统一的青色制服，但是制服上的logo都不仅相同。有些尸体腰上缠着战术腰带，但是腰带上的武器装备却已经不在原处。\n" +
                "臭味应该就是尸体散发出来的。你暗道不妙，你的常识告诉你，尸体腐烂的地方不一定卫生。\n" +
                "\n" +
                "（在这个房间中，每获得两张新的卡牌，生命值-1）\n" +
                "\n" +
                "你退出房间，在外面又足足的吸了一大口气，重新返回到房间里，仔细地打量着这个房间。这里的墙比外面的房间要高出不少。你的正前方是一条被血迹覆盖的走道，走道前方就是你看到的尸堆，右边是墙，而左边是一排一排的黑色柜子。柜子的每一层都很薄，好像只能放下两三本书的厚度一般，难道这里是书房？\n" +
                "柜子很高，上面能顶到天花板。在柜子的中间有一个固定在半空中的走道，走道的尽头有可以爬上去的楼梯。\n" +
                "除此之外，房间里充满着大量的电线，有些躺在地上，有些则悬挂在半空中。";
    }

    @Override
    public InteractiveList interactiveList() {
        return new InteractiveList() {{
            add(ic("检查尸体1", true), new Object_Body1());
            add(ic("检查尸体2").tc(), new Object_Body2());
            add(ic("检查尸体3"), new Object_Body3());
            add(ic("检查第一排柜子"), ro(new Object_BlackServerStack().getMainIndex(), new Object_BlackServerStack().getSubIndex(), new Object_BlackServerStack_1().getSubIndex()));
            add(ic("检查第二排柜子"), ro(new Object_BlackServerStack().getMainIndex(), new Object_BlackServerStack().getSubIndex(), new Object_BlackServerStack_1().getSubIndex()));
            add(ic("检查第三排柜子"), ro(new Object_BlackServerStack().getMainIndex(), new Object_BlackServerStack().getSubIndex(), new Object_BlackServerStack_1().getSubIndex()));
            add(ic("检查第四排柜子", true), new Object_BlackServerStack_2());
            add(ic("检查第五排柜子"), ro(new Object_BlackServerStack().getMainIndex(), new Object_BlackServerStack().getSubIndex(), new Object_BlackServerStack_1().getSubIndex()));
        }};
    }

    @Override
    public CardPrinter printer() {
        return new NormalCard() {
            @Override
            public tbcbuild.cardGenerator.InteractiveList fpIl() {
                return new tbcbuild.cardGenerator.InteractiveList() {{
                    add(InteractiveChoice.ic("Examining Corpse 1", true), new Object_Body1());
                    add(InteractiveChoice.ic("Examining Corpse 2").tc(), new Object_Body2());
                    add(InteractiveChoice.ic("Examining Corpse 3"), new Object_Body3());
                    add(InteractiveChoice.ic("Check the first row of cabinets"), ro(new Object_BlackServerStack().getMainIndex(), new Object_BlackServerStack().getSubIndex(), new Object_BlackServerStack_1().getSubIndex()).getReferName());
                    add(InteractiveChoice.ic("Check the second row of cabinets"), ro(new Object_BlackServerStack().getMainIndex(), new Object_BlackServerStack().getSubIndex(), new Object_BlackServerStack_1().getSubIndex()).getReferName());
                    add(InteractiveChoice.ic("Check the third row of cabinets"), ro(new Object_BlackServerStack().getMainIndex(), new Object_BlackServerStack().getSubIndex(), new Object_BlackServerStack_1().getSubIndex()).getReferName());
                    add(InteractiveChoice.ic("Check the fourth row of cabinets", true), new Object_BlackServerStack_2());
                    add(InteractiveChoice.ic("Check the fifth row of cabinets"), ro(new Object_BlackServerStack().getMainIndex(), new Object_BlackServerStack().getSubIndex(), new Object_BlackServerStack_1().getSubIndex()).getReferName());
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
                return "You pushed the door lightly. Contrary to what you expected, the door opened. A strong smell hit you hardly, the fishy smell was mixed with the smell of sour and dust. Just smelling it, you coughed violently.\n" +
                        "\n" +
                        "In the corner of the room lay a stack of withered corpses. These people are all wearing cyan uniforms, but the logos on the uniforms are not the same. Some corpses had tactical belts wrapped around their waists, but the weapons and equipment on the belts were no longer in place.\n" +
                        "The stench must have come from the corpse. You are not feeling good, your common sense tells you that the place where the corpse rots is unhygienic and could be dangerous.\n" +
                        "\n" +
                        "(In this room, each time you get two new cards, the lose a health)\n" +
                        "\n" +
                        "You exited the room, took a deep breath outside, returned to the room, and looked at the room carefully. The walls here are much higher than the rooms outside. Right in front of you is a corridor covered in blood. In front of the corridor is the pile of corpses you see. The wall is on the right, and the rows of black cabinets are on the left. Each layer of the cabinet is very thin, as if it can only hold two or three books. Is this a library?\n" +
                        "\nThe cabinets are tall and reach the ceiling. In the middle of the cabinet there is a walkway fixed in mid-air, and at the end of the walkway there are stairs that can be climbed up.\n" +
                        "In addition to that, the room is filled with tons of electrical wires, some lying on the ground and others hanging in mid-air.";
            }
        };
    }
}
