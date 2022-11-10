package tbcbuild.cardGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

@AllArgsConstructor
@Data
public class TextBlock {
    public int startX;
    public int endX;
    public int startY;
    public int endY;

    public String printOn(Graphics2D g2d, String content) {
        if (content == null) return null;
        return printOn(g2d, content, null);
    }
    public String printOn(Graphics2D g2d, String content, Integer[] lastHeight) {
        if (content == null) return null;
        if (lastHeight != null) lastHeight[0] = startY;
        LinkedList<String> lines = Util.splitToLinesByWidth(g2d, content, (endX-startX));
        int i = 0;
        for (int j = 0; j < lines.size(); j++) {
            if ((startY+g2d.getFont().getSize()+i) >= endY) {
                StringBuilder sb = new StringBuilder();
                for (int o = j; o < lines.size(); o++)
                    sb.append(lines.get(o));
                return sb.toString();
            }
            String str = lines.get(j);
            Util.drawString(g2d, str, startX, startY+g2d.getFont().getSize()+i);
            if (lastHeight != null) lastHeight[0] = startY+g2d.getFont().getSize()+i;
            i += g2d.getFont().getSize();
        }
        return null;
    }

    public InteractiveList plotOn(Graphics2D g2d, InteractiveList il, int startHeight) {
        ArrayList<String[]> leftsTemp = il.getLefts();
        ArrayList<String> rights = il.getRights();
        ArrayList<String> lefts = new ArrayList<>();
        for (String[] strs : leftsTemp)
            lefts.addAll(Arrays.asList(strs));

        startHeight += 40;
        Util.setDescriptionFont(g2d);
        int leftLength = Util.findLongest(g2d, lefts);
        int rightLength = Util.findLongest(g2d, rights);
        int divider = (int) (((double)leftLength/(leftLength+rightLength))*(this.endX - this.startX-10)) + this.startX+15;
        if ((this.startX+10+25+leftLength+50+rightLength+25 < this.endX)) divider = this.startX+10+25+leftLength;
        int titleLength;
        if (rightLength < leftLength) {
            titleLength = Util.getStringWidth(g2d, "Consequence");
            if ((this.endX-this.startX-divider) < titleLength)
                divider = this.endX - 100 - titleLength;
        } else {
            titleLength = Util.getStringWidth(g2d, "Choices");
            if ((divider-this.startX) < titleLength)
                divider = this.startX + 10 + 25 + titleLength;
        }

        g2d.drawLine(this.startX+10, startHeight, this.endX, startHeight);

        for (int i = 0; i < leftsTemp.size(); i++) {
            int originalStartHeight = startHeight;

            if (i == 0) Util.setDescriptionBoldFont(g2d);
            else Util.setDescriptionFont(g2d);
            startHeight += g2d.getFont().getSize();
            String[] content = leftsTemp.get(i);
            Integer[] lastHeight2 = new Integer[] {0};
            TextBlock tb = new TextBlock(this.startX+25, divider-25, startHeight-g2d.getFont().getSize(), this.endY);
            tb.printOn(g2d, content[0], lastHeight2);
            startHeight = lastHeight2[0];
            if (content.length == 2) {
                Integer[] lastHeight1 = new Integer[] {0};
                startHeight += 10 + g2d.getFont().getSize();
                tb = new TextBlock(this.startX+25, divider-25, startHeight-g2d.getFont().getSize(), this.endY);
                tb.printOn(g2d, content[1], lastHeight1);
                startHeight = lastHeight1[0];
            }
            startHeight += 10;

            String right = rights.get(i);
            TextBlock textBlock = new TextBlock(divider+50, this.endX-25, originalStartHeight, this.endY);
            Integer[] lastHeight = new Integer[] {0};
            textBlock.printOn(g2d, right, lastHeight);

            int height = Math.max(lastHeight[0]+10, startHeight);
            if (lastHeight[0] > startHeight) startHeight = lastHeight[0]+10;
            g2d.drawLine(this.startX+10, height, this.endX, height);
            g2d.drawLine(divider+25, originalStartHeight, divider+25, height);
        }
        return null;
    }
}
