package tbcbuild.a4Printer;

import tbcbuild.cardGenerator.TextBlock;
import tbcbuild.cardGenerator.Util;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class SuperA4 {
    int currentRow = 0;

    public ArrayList<Row> rows = new ArrayList<>() {{
        add(new Row());
    }};

    public void addCard(File front, File back) {
        if (front == null) System.out.println("front is null!");
        if (back == null) System.out.println("back is null!");
        Row row = rows.get(currentRow);
        if (row.isFull()) {
            newRow("");
            row = rows.get(currentRow);
        }

        row.addCard(front, back);
    }

    public void newRow(String noteToSet) {
        currentRow++;
        rows.add(new Row(){{
            setNote(noteToSet);
        }});
    }

    public void print() {
        String path = "D:\\New_World_Exploration_Guideline_Final\\FinalExport\\";
        for (int i = 0; i < rows.size()/2; i++)
            printPage(rows.get(i*2), rows.get(i*2+1), path);
        if (rows.size() % 2 != 0)
            printPage(rows.get(rows.size()-1), null, path);
    }

    int pgNum = 0;
    private void printPage(Row row1, Row row2, String path) {
        BufferedImage card = new BufferedImage(2480, 3508, BufferedImage.TYPE_INT_BGR);
        Graphics2D g2d = card.createGraphics();

        try {
            g2d.drawImage(ImageIO.read(getClass().getResource("/face/A4.png")),
                    0, 0, null);

            Util.setTitleFont(g2d);

            g2d.drawString(row1.note, 174, g2d.getFont().getSize());
            g2d.drawImage(ImageIO.read(row1.frontSlot1).getScaledInstance(1231, 1754, Image.SCALE_SMOOTH), 10, 0, null);
            g2d.drawImage(ImageIO.read(row1.frontSlot2).getScaledInstance(1231, 1754, Image.SCALE_SMOOTH), 1241, 0, null);
            if (row2 != null) {
                g2d.drawString(row2.note, 174, 1750 + g2d.getFont().getSize());
                g2d.drawImage(ImageIO.read(row2.frontSlot1).getScaledInstance(1231, 1754, Image.SCALE_SMOOTH), 10, 1750, null);
                g2d.drawImage(ImageIO.read(row2.frontSlot2).getScaledInstance(1231, 1754, Image.SCALE_SMOOTH), 1241, 1750, null);
            }

            ImageIO.write(card, "png", new File(path + pgNum + "_front.png"));

            g2d.drawString(row1.note, 174, g2d.getFont().getSize());
            g2d.drawImage(ImageIO.read(row1.backSlot1).getScaledInstance(1231, 1754, Image.SCALE_SMOOTH), 10, 0, null);
            g2d.drawImage(ImageIO.read(row1.backSlot2).getScaledInstance(1231, 1754, Image.SCALE_SMOOTH), 1241, 0, null);
            if (row2 != null) {
                g2d.drawString(row2.note, 174, 1750 + g2d.getFont().getSize());
                g2d.drawImage(ImageIO.read(row2.backSlot1).getScaledInstance(1231, 1754, Image.SCALE_SMOOTH), 10, 1750, null);
                g2d.drawImage(ImageIO.read(row2.backSlot2).getScaledInstance(1231, 1754, Image.SCALE_SMOOTH), 1241, 1750, null);
            }

            ImageIO.write(card, "png", new File(path + pgNum + "_back.png"));
        } catch (IOException e) {e.printStackTrace();}
    }
}
