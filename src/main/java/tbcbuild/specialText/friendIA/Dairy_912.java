package tbcbuild.specialText.friendIA;

import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.PureDescriptions;
import tbcbuild.cardType.SpecialText;

public class
Dairy_912 extends SpecialText implements Printer {
    @Override
    public String description() {
        return "\n" +
                "April. 24\n" +
                "It's really getting cool\n" +
                "Ms. Jiu who have been running for the whole day now just want some sleep" +
                "\n" +
                "April. 25\n" +
                "New courses after another after another, tried but fruitful" +
                "My nNew dairy looks great!\n" +
                "\n" +
                "April. 26\n" +
                "Time past so fast!!\n" +
                "Another day laying on bed\n" +
                "\n" +
                "April 27\n" +
                "Happy North festival!\n" +
                "Just made a video call with my dad and mom, I want to cry after realize I am alone now\n" +
                "Wish they could move to the new world now\n" +
                "\n" +
                "April 28\n" +
                "Morning 8 class start tomorrow\n" +
                "I haven't start my class work!!\n" +
                "It also doesn't feel right these days!! Mood in the basement is quite weird";
    }

    @Override
    public String nameTag() {
        return "Dairy 912";
    }

    @Override
    public CardPrinter printer() {
        return new PureDescriptions(Dairy_912.this.description()) {
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
                return "";
            }
        };
    }
}
