package tbcbuild.cardGenerator;

import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public class Util {
    public static void setTitleFont(Graphics2D g2d) {
        g2d.setColor(new Color(255,255,255));
        g2d.setFont(new Font("Serif", Font.BOLD, 55));
    }

    public static void setDescriptionFont(Graphics2D g2d) {
        g2d.setColor(new Color(255,255,255));
        g2d.setFont(new Font("Serif", Font.PLAIN, 40));
    }

    public static int getStringWidth(Graphics2D g2d, String str) {
        int width = 0;
        Font font = g2d.getFont();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '粗')
                g2d.setFont(new Font(g2d.getFont().getName(), Font.BOLD, g2d.getFont().getSize()));
            else if (c == '细')
                g2d.setFont(new Font(g2d.getFont().getName(), Font.PLAIN, g2d.getFont().getSize()));
            else {
                width += g2d.getFontMetrics().stringWidth(String.valueOf(c));
            }
        }
        g2d.setFont(font);
        return width;
    }

    public static int getCharWidth(Graphics2D g2d, char c) {
        if (c == '粗')
            g2d.setFont(new Font(g2d.getFont().getName(), Font.BOLD, g2d.getFont().getSize()));
        else if (c == '细')
            g2d.setFont(new Font(g2d.getFont().getName(), Font.PLAIN, g2d.getFont().getSize()));
        else
            return g2d.getFontMetrics().stringWidth(String.valueOf(c));
        return 0;
    }

    public static LinkedList<String> splitToLinesByWidth(Graphics2D g2d, String str, int width) {
        Font font = g2d.getFont();
        LinkedList<String> lines = new LinkedList<>();
        StringBuilder current = new StringBuilder();
        int curWidth = 0;
        for (int i = 0; i < str.length(); i++) {
            current.append(str.charAt(i));
            curWidth += getCharWidth(g2d, str.charAt(i));
            if (str.charAt(i) == '\n' || curWidth >= width) {
                lines.add(current.toString());
                current = new StringBuilder();
                curWidth = 0;
            }
        }
        if (!current.toString().equals("")) {
            lines.add(current.toString());
        }
        g2d.setFont(font);

        for (int i = 0; i < lines.size(); i++) {
            String str1 = lines.get(i);
            while (str1.endsWith(" ")) {
                str1 = str1.substring(0, str1.length()-1);
            }
            lines.set(i, str1);
        }

        return lines;
    }

    public static void setCateFont(Graphics2D g2d) {
        g2d.setColor(new Color(255,255,255));
        g2d.setFont(new Font("Serif", Font.BOLD, 40));
    }

    public static int findLongest(Graphics2D g2d, List<String> list) {
        int width = -1;
        for (String str : list) {
            int curWidth = getStringWidth(g2d, str);
            if (curWidth > width) width = curWidth;
        }
        return width;
    }

    public static void setDescriptionBoldFont(Graphics2D g2d) {
        g2d.setColor(new Color(255,255,255));
        g2d.setFont(new Font("Serif", Font.BOLD, 40));
    }

    public static void drawString(Graphics2D g2d, String content, int x, int y) {
        for (int i = 0; i < content.length(); i++) {
            char c = content.charAt(i);
            if (c == '粗')
                g2d.setFont(new Font(g2d.getFont().getName(), Font.BOLD, g2d.getFont().getSize()));
            else if (c == '细')
                g2d.setFont(new Font(g2d.getFont().getName(), Font.PLAIN, g2d.getFont().getSize()));
            else {
                g2d.drawString(String.valueOf(c), x, y);
                x += g2d.getFontMetrics().stringWidth(String.valueOf(c));
            }
        }
    }

    public static void setCarriedInfoFont(Graphics2D g2d, String carriedInfo, int totalWidth, int totalHeight) {
        g2d.setColor(new Color(255,255,255,100));
        g2d.setFont(new Font(g2d.getFont().getName(), Font.BOLD, g2d.getFont().getSize()));
        double rate = totalHeight/(double)g2d.getFont().getSize()*0.9;
        g2d.setFont(new Font(g2d.getFont().getName(), Font.BOLD, (int) (g2d.getFont().getSize()*rate)));
        if (g2d.getFontMetrics().stringWidth(carriedInfo) < totalWidth) return;

        while (!(g2d.getFontMetrics().stringWidth(carriedInfo) < totalWidth)) {
            g2d.setFont(new Font(g2d.getFont().getName(), Font.BOLD, g2d.getFont().getSize() - 1));
        }
    }
}
