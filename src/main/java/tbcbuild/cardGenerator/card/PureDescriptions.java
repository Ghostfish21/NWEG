package tbcbuild.cardGenerator.card;

import lombok.AllArgsConstructor;
import tbcbuild.cardGenerator.face.PureDescription;

@AllArgsConstructor
public abstract class PureDescriptions implements CardPrinter {
    private final String description;

    @Override
    public String paint(String path) {
        String left = description;
        int i = 0;
        while (left != null) {
            left = new PureDescription(left).paint(path+i+".png");
            i++;
        }
        return null;
    }
}
