package tbcbuild.base;

public class RandomObtainable implements Obtainable {
    public int mainIndexStart = -1;
    public int mainIndexEnd = -1;
    public int subIndexStart = -1;
    public int subIndexEnd = -1;

    public static RandomObtainable ro(int mainIndexStart, int subIndexStart, int subIndexEnd) {
        RandomObtainable ro = new RandomObtainable();

        ro.mainIndexStart = mainIndexStart;
        ro.mainIndexEnd = mainIndexStart;
        ro.subIndexStart = Math.min(subIndexStart,subIndexEnd);
        ro.subIndexEnd = Math.max(subIndexStart,subIndexEnd);

        return ro;
    }

    public String obtain() {
        return "Please obtain" + getReferName();
    }

    public String getReferName() {
        String mainIndex;
        if (mainIndexStart == mainIndexEnd) mainIndex = mainIndexStart + "";
        else mainIndex = "(" + (mainIndexStart-1) + "+1d" + (mainIndexEnd-mainIndexStart+1) + ")";

        if (subIndexStart == -1) return "Card " + mainIndex;
        else {
            String subIndex;
            if (subIndexStart == subIndexEnd) subIndex = subIndexStart+"";
            else subIndex = "(" + (subIndexStart-1) + "+1d" + (subIndexEnd-subIndexStart+1) + ")";
            return "Card " + mainIndex + "-" + subIndex;
        }
    }
}
