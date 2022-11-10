package tbcbuild.cardGenerator.card;

import tbcbuild.cardGenerator.Painter;

public interface CardPrinter extends Painter {
    String cardName();
    String title();
    String cate();
    String description();
}
