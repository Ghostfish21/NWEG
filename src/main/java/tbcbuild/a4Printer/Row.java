package tbcbuild.a4Printer;

import java.io.File;

public class Row {
    public String note = "";
    public File frontSlot1;
    public File frontSlot2;
    public File backSlot1;
    public File backSlot2;

    public void setNote(String note) {
        this.note = note;
    }

    public void addCard(File front, File back) {
        if (frontSlot1 == null) {
            frontSlot1 = front;
            backSlot1 = back;
        } else {
            frontSlot2 = front;
            backSlot2 = back;
        }
    }

    public boolean isFull() {
        if (frontSlot1 == null || frontSlot2 == null) return true;
        return false;
    }
}
