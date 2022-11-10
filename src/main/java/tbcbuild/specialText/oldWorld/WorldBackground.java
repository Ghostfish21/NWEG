package tbcbuild.specialText.oldWorld;

import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.PureDescriptions;

public class WorldBackground extends tbcbuild.cardType.SpecialText implements Printer {
    @Override
    public String description() {
        return "During World War III in the 22nd century, Pansolar United Pharmaceuticals developed a weapon code-named Luca. Development of the weapon was halted shortly after the project was approved because it was too powerful, and the material was classified and sealed.\n" +
                "\n" +
                "Later, as the war became more tense, several countries sandwiched between the great powers collapsed and became scorched. One of these countries stole part of Luca's material and reduced it to Luca's reagent. It was too powerful, but when it got out, it spread like wildfire in many countries around the world, mutating rapidly wherever it went, whether it was plants or animals or people.\n" +
                "\n" +
                "In the aftermath of the disaster, governments tried, but failed, to slow things down, and eventually looked to space to ferry the remaining survivors to colonies beyond Earth\n" +
                "\n" +
                "But in any case, only some of them left. For example, in most parts of the Americas, there are aristocrats, employees and technical talents and a small number of lottery people, in Russia, there are warlords and technical talents, and in East Asia, there are mainly dignitaries, technical talents and lottery decisions\n" +
                "\n" +
                "In this context, the Jiangbei People's Self-Rescue Association was established, which played an important role in the early movement against interstellar escape, though it did not succeed in the end.\n" +
                "\n" +
                "After the interstellar escape, SRA gradually retreat to the Anbei region under the siege of the deteriorating natural environment and human mutants (zombies).\n" +
                "\n" +
                "Communication between the remaining human organizations on the surface began to break down, and as people began to despair of the situation, SRA discovered the existence of the new world, sending a total of more than 1,000 people early on to explore it\n" +
                "\n" +
                "The situation on the other world is not optimistic, but it is obviously much better than living conditions on Earth. As the situation ON THE surface deteriorates, SRA plans to deploy another 3,000 people of all kinds of talents and forces to the other world as a talent reserve, and to relieve the population pressure on the surface. The player will play as one of the 3,000 people who will enter the other world in a hibernate tank and wait to be awakened when the other world population becomes free. Before entering the other world, the player has already passed the skill training of SRA, and memorized the new world exploration guide";
    }

    @Override
    public String nameTag() {
        return "World Background";
    }

    @Override
    public CardPrinter printer() {
        return new PureDescriptions(WorldBackground.this.description()) {
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
                return WorldBackground.this.description();
            }
        };
    }
}
