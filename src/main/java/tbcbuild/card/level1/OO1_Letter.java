package tbcbuild.card.level1;

import tbcbuild.base.CategoryChild;
import tbcbuild.cardGenerator.InteractiveList;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.NormalCard;
import tbcbuild.cardType.Card;
import tbcbuild.cardType.CateCard;
import tbcbuild.cardType.ItemCard;
import tbcbuild.category.Cate_SpiritualCaToken;

import java.util.ArrayList;

import static tbcbuild.CategorySet.categoryIndex;

public class OO1_Letter extends ItemCard implements CategoryChild, Cate_SpiritualCaToken, Printer {
    @Override
    public String description() {
        return "Occupies "+space()+"\n\n信\n\n" +
                "这是一封白色的信封，信口处的红色印泥已经被破坏，你打开了信，并取出了放在里面的信件\n" +
                "\n" +
                "您好 周部长，\n" +
                "\n" +
                "非常感谢您的信任与栽培\n" +
                "与岛链建设部的对接正在按照我们的计划进行。就在刚才，我接受了岛链事务部门的接待，在研讨会中，我们拿到了岛链网络接入的许可。\n" +
                "其中与我们预期不符的是，岛链提出要将这部分的数据服务器架设在岛链本土。我同意了对方的这个提议。\n" +
                "达成的具体协议内容我已经放到在附件中了，您随时可以查阅\n" +
                "在不久的将来，我们设想中的技术部岛链运营组将如约成立，\n" +
                "我相信，在技术部各位同僚的努力下，我们可以搭建一个繁荣的，开放的新世界互联网，共勉\n" +
                "\n" +
                "二一七九年 二月 十二日\n" +
                "技术部岛链业务负责人 刘笑笑\n" +
                "\n" +
                "你看完了信，将它放回了信封。这个时候你注意到这么久过去了，信件的表面依旧没有灰尘也没有磨损。你小心的试着轻轻的折了一下它，竟然没有留下丝毫痕迹。";
    }

    @Override
    public ArrayList<String> categories() {
        return new ArrayList<>() {{
            add(categoryIndex(Cate_SpiritualCaToken.class));
        }};
    }

    @Override
    public String exportCateText() {
        return this.exportLore();
    }

    public OO1_Letter(boolean bypassValidCheck) {
        super(bypassValidCheck);
    }

    public OO1_Letter() {
        super();
    }

    @Override
    public int space() {
        return 1;
    }

    @Override
    public CardPrinter printer() {
        return new NormalCard() {
            @Override
            public InteractiveList fpIl() {
                return null;
            }

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
                return new CateCard(Cate_SpiritualCaToken.class).getReferName();
            }

            @Override
            public String description() {
                return "Letter\n\n" +
                        "Occupies 1\n\n" +
                        "This is a white envelop. The red seal at the mouth has been destroyed，You opened the envelop, and took the letter out.\n" +
                        "\n" +
                        "Hello Secretary Zhou,\n" +
                        "\n" +
                        "It is a honor for me to have your trust and cultivation\n" +
                        "Docking with the Island Chain Construction Department is proceeding according to our plan. Just now, I accepted the reception of the island chain affairs department. During the seminar, we got the permission to access the island chain network.\n" +
                        "What is inconsistent with our expectation is that the island chain proposed to set up this part of the data server on their territory. I agreed to the proposal as it barely make any difference to us.\n" +
                        "I have put the specific agreement in the attachment, you can refer to it at any time\n" +
                        "In the near future, the island chain operation group of the technology department we envisage will be established as agreed.\n" +
                        "I believe that with the efforts of my colleagues in the technical department, we can build a prosperous and open new world Internet, and encourage each other.\n" +
                        "\n" +
                        "Year Two One Seven Nine, Month Two, Day Twelve\n" +
                        "Head of Island Chain Business of the Technology Department  Liu Xiaoxiao\n" +
                        "\n" +
                        "You read the letter and put it back in the envelope. At this point you notice that after all this time, the surface of the letter is still free of dust and wear. You carefully tried to fold it slightly, but there was no trace left.";
            }
        };
    }
}
