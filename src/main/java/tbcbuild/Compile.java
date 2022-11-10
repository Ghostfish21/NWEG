package tbcbuild;

import tbcbuild.a4Printer.SuperA4;

import java.io.File;
import java.util.HashMap;

public class Compile {
    public static final String exportPath = "D:\\New_World_Exploration_Guideline\\";

    public static void deleteAll() {
        File directory = new File(exportPath);
        if (directory.exists()) {
            File[] files = directory.listFiles();
            for (File file : files) {
                if (file.isDirectory())
                    deleteContainer(file);
                file.delete();
            }
        } else {
            directory.mkdirs();
        }
    }

    public static void deleteContainer(File container) {
        File[] files = container.listFiles();
        for (File file : files) {
            if (file.isDirectory())
                deleteContainer(file);
            file.delete();
        }
    }

    public static void main(String[] args) {
        String cardPath = "D:\\New_World_Exploration_Guideline_Final\\Card\\";
        String catePath = "D:\\New_World_Exploration_Guideline_Final\\Category\\";
        String scPath = "D:\\New_World_Exploration_Guideline_Final\\SpecialCards\\";
        String stPath = "D:\\New_World_Exploration_Guideline_Final\\SpecialTexts\\";

        SuperA4 metaA4 = new SuperA4();

        File[] cards = new File(cardPath).listFiles();
        for (File cardFolder : cards) {
            metaA4.newRow(cardFolder.getName());
            File[] files = cardFolder.listFiles();
            HashMap<Integer, File> pngs = new HashMap<>();
            for (File file : files) {
                if (file.getName().contains(".png")) {
                    try {
                        int index = Integer.parseInt(file.getName().substring(0, file.getName().lastIndexOf(".")));
                        pngs.put(index, file);
                    } catch (NumberFormatException nfe) {
                        file.delete();
                    }
                }
            }
            for (int i = 0; i < pngs.size()/2; i++)
                metaA4.addCard(pngs.get(i * 2), pngs.get(i * 2 + 1));
            if (pngs.size() % 2 != 0)
                metaA4.addCard(pngs.get(pngs.size()-1), null);
        }

        metaA4.print();
    }

//    public static void main(String[] args) {
//
//        deleteAll();
//
//        new CardSet();
//        new CategorySet();
//        new SpecialTextSet();
//
//        String cardFolderName = "Card\\";
//        File folder = new File(exportPath+cardFolderName);
//        if (!folder.exists()) folder.mkdirs();
//
//        ArrayList<String> indicesOfCards = new ArrayList<>(cardSet.keySet());
//        for (String index : indicesOfCards) {
//            Class<? extends Card> cardClass = cardSet.get(index);
//            String cardType = Util.typeName(instance.get(cardClass));
//
//            Card card = instance.get(cardClass);
//            String fileName = card.getReferName() + ".txt";
//
//            FileWriter fw = null;
//            if (card instanceof Printer) {
//                String path = exportPath+cardFolderName+card.getReferName()+"\\";
//                if (!new File(path).exists())
//                    new File(path).mkdirs();
//                try {fw = new FileWriter(path+fileName);}
//                catch (IOException e) {e.printStackTrace();}
//            } else {
//                try {fw = new FileWriter(exportPath+cardFolderName+fileName);}
//                catch (IOException e) {e.printStackTrace();}
//            }
//            try (BufferedWriter bufferedWriter = new BufferedWriter(fw)) {
//                bufferedWriter.write(card.export());
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//            if (card instanceof Printer printer) {
//                CardPrinter cp = printer.printer();
//                try {
//                    //cp.paint(exportPath+cardFolderName+card.getReferName()+"\\");
//                } catch (Exception e) {
//                    System.out.println(printer.getClass().getCanonicalName());
//                    e.printStackTrace();
//                }
//
//            }
//        }
//
//        String cateFolderIndex = "Category\\";
//        File folder1 = new File(exportPath+cateFolderIndex);
//        if (!folder1.exists()) folder1.mkdirs();
//
//        ArrayList<String> indicesOfCates = new ArrayList<>(categorySet.keySet());
//        for (String index : indicesOfCates) {
//            Class<? extends Category> cateClass = categorySet.get(index);
//
//            if (index.length() == 1)
//                index = "00"+index;
//            else if (index.length() == 2)
//                index = "0"+index;
//
//            String fileName = index + " " + "Category" + ".txt";
//
//            Category cate = CategorySet.instance.get(cateClass);
//            FileWriter fw = null;
//            if (cate instanceof Printer) {
//                String path = exportPath+cateFolderIndex+index + " " + "Category\\";
//                if (!new File(path).exists())
//                    new File(path).mkdirs();
//                try {fw = new FileWriter(path+fileName);}
//                catch (IOException e) {e.printStackTrace();}
//            } else {
//                try {fw = new FileWriter(exportPath+cateFolderIndex+fileName);}
//                catch (IOException e) {e.printStackTrace();}
//            }
//            try (BufferedWriter bufferedWriter = new BufferedWriter(fw)) {
//                bufferedWriter.write(cate.export());
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//            if (cate instanceof Printer printer) {
//                CardPrinter cp = printer.printer(cateClass);
//                cp.paint(exportPath+cateFolderIndex+index + " " + "Category\\");
//            }
//        }
//
//        String stFolderIndex = "SpecialTexts\\";
//        File folder2 = new File(exportPath+stFolderIndex);
//        if (!folder2.exists()) folder2.mkdirs();
//
//        ArrayList<String> indicesOfSt = new ArrayList<>(stSet.keySet());
//        for (String index : indicesOfSt) {
//            Class<? extends SpecialText> stClass = stSet.get(index);
//
//            SpecialText st = SpecialTextSet.instance.get(stClass);
//            String fileName = st.getReferName() + ".txt";
//            FileWriter fw = null;
//            if (st instanceof Printer) {
//                String path = exportPath+stFolderIndex+ st.getReferName() + "\\";
//                if (!new File(path).exists())
//                    new File(path).mkdirs();
//                try {fw = new FileWriter(path+fileName);}
//                catch (IOException e) {e.printStackTrace();}
//            } else {
//                try {fw = new FileWriter(exportPath+stFolderIndex+fileName);}
//                catch (IOException e) {e.printStackTrace();}
//            }
//            try (BufferedWriter bufferedWriter = new BufferedWriter(fw)) {
//                bufferedWriter.write(SpecialTextSet.instance.get(stClass).export());
//            }
//            catch (IOException e) {e.printStackTrace();}
//
//            if (st instanceof Printer printer) {
//                //CardPrinter cp = printer.printer();
//                //cp.paint(exportPath+stFolderIndex+st.getReferName()+"\\");
//            }
//        }
//    }
}
