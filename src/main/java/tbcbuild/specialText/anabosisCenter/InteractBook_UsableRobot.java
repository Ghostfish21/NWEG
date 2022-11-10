package tbcbuild.specialText.anabosisCenter;

import tbcbuild.card.level1.Item_MapOfAnabosisFloor;
import tbcbuild.card.level1.Item_PersonalPanel_WangHao;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.PagesPureDescription;
import tbcbuild.cardType.SpecialText;

import static tbcbuild.Util.obtain;
import static tbcbuild.Util.obtainSt;

public class InteractBook_UsableRobot extends SpecialText implements Printer {
    @Override
    public String description() {
        return "页码 1\n" +
                "\n" +
                "欢迎来到新世界，我是亦亚\n" +
                "你好，王浩探员，欢迎回来\n" +
                "请问有什么需要帮助的吗\n" +
                "\n" +
                "A：这里怎么了？（转到页码2）\n" +
                "B：现在是什么时候？（转到页码3）\n" +
                "C：我没有个人终端，请问要怎样获得（转到页码10）\n" +
                "\n" +
                "\n" +
                "页码 2\n" +
                "\n" +
                "我听不懂你的问题。\n" +
                "如果你需要基地地图相关的帮助，我可以帮助你\n" +
                "如果需要开启高级AI模式，请寻求基地技术组的协助\n" +
                "\n" +
                "A：你还记得你关机前发生的最后一件事吗？（转到页码4）\n" +
                "B：可以给我一张基地地图吗？（转到页码5）\n" +
                "C：开启高级AI模式（转到页码6）\n" +
                "\n" +
                "\n" +
                "页码3\n" +
                "\n" +
                "无法从基地网络获取当前精准时间。本机时间为2180年5月10号，早上9点26分。\n" +
                "\n" +
                "你好，请问还有其他我可以为你做的吗？\n" +
                "\n" +
                "\n" +
                "页码 4\n" +
                "\n" +
                "我听不懂你的问题。\n" +
                "如果需要访问亦亚黑盒子，或需要访问基地监控记录，请寻求基地技术组的协助\n" +
                "\n" +
                "你好，请问还有其他我可以为你做的吗？（其他所有选项都适用）\n" +
                "\n" +
                "\n" +
                "页码 5\n" +
                "\n" +
                "亦亚尚未连接到基地数据库，无法获取基地的全局地图。本层地图已经发送到您的个人终端，请注意查收\n" +
                "（" + obtain(true, new Item_MapOfAnabosisFloor()) + "）\n" +
                "\n" +
                "A：火种复苏中心外是什么？ （转到页码9）\n" +
                "\n" +
                "\n" +
                "页码 9\n" +
                "\n" +
                "火种复苏中心大门外从近到远依次是火种生活单元，火种运动馆与火种训练场。\n" +
                "欢迎来到新世界，您在这里将开启完全崭新的生活。\n" +
                "\n" +
                "你好，请问还有其他我可以为你做的吗？（其他所有选项都适用）\n" +
                "\n" +
                "\n" +
                "页码 6\n" +
                "\n" +
                "你没有相应的权限，王皓探员。请寻求基地技术组的协助\n" +
                "\n" +
                "你好，请问还有其他我可以为你做的吗？（其他所有选项都适用）\n" +
                "\n" +
                "\n" +
                "页码 10\n" +
                "\n" +
                "我听不懂你的问题。如果是个人终端意外丢失，请联系基地技术组联络号 58142_EKVACIAD 冻结旧设备并补办新设备。技术组较为繁忙，请提前准备好个人身份信息档案，以节省后续的时间\n" +
                "\n" +
                "你好，请问还有其他我可以为你做的吗？（其他所有选项都适用）\n" +
                "\n" +
                "\n" +
                "结束\n" +
                "\n" +
                "很高兴为您服务，欢迎来到新世界，祝您的旅途愉快。我们下次再见";
    }

    @Override
    public String nameTag() {
        return "Robot Interact Book with Some Permissions";
    }

    @Override
    public CardPrinter printer() {
        return new PagesPureDescription() {{
            add("""
                    Page 1
                    
                    Hello, welcome to the new world, I am IA.
                    Good morning, Wang Hao
                    Is there anything I can help with?
                    
                    A: What happens here? (Page 2)
                    B: What time is it now? (Page 3)
                    C: I don't have a personal panel,how may I get one? (Page 10)
                    """);
            add("""
                    Page 2
                    
                    I don't understand.
                    If you need help with the map, I can help you
                    If you intend to turn on advanced AI mod, please seek for technical department's assistance
                    
                    A: Do you remember the last thing before you shut down? (Page 4)
                    B: May I have a map of the basement? (Page 5)
                    C: Turn on advanced AI mod (Page 6)
                    """);
            add("""
                    Page 3
                    
                    Can not pull the current time from the network. Local time recorded on this device is 2180, May 10th. Nine twenty six in the morning.
                    
                    Hello, is there anything else I could help you today?
                    """);
            add("""
                    Page 4
                    
                    I don't understand.
                    If you need to access IA black box, or the CCTV record, please seak for technical department's assistance.
                    
                    Hello, is there anything else I could help you today?
                    """);
            add("""
                    Page 5
                    
                    IA is not connected to the basement database, failed to obtain the general map of the basement. 
                    I sent the map of this floor to your personal panel, feel free to check it.
                    
                    B: What's beyond the anabosis center (Page 9)
                    """);
            add("""
                    Page 6
                    
                    You don't have the corresponding permission, Mr. Wanghao. Please seek the technical department's assistance.
                    
                    Hello, is there anything else I could help you today?
                    """);
            add("""
                    Page 9
                    
                    Beyond the anabosis center, there are living zone, fitting building, cafeteria, entertainment hall, etc.
                    Welcome to the new world, you will start a brand new life here.
                    
                    Hello, is there anything else I could help you today?
                    """);
            add("""
                    Page 10
                    
                    I don't understand. 
                    If the personal panel is lost, please contact Basement Technical Department's contact num 58142_EKVACIAD.
                    Freeze the old device, and make up a new device. 
                    Due to high volume of visitors at the technical department, please prepare your ID prior to your arrival, in order to save following time
                    
                    Hello, is there anything else I could help you today?
                    """);
            add("""
                    End
                    
                    It's my honor to serve for you! Welcome to the new world, hope you have a delight trip, see you next time!
                    """);
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
                return null;
            }

            @Override
            public String description() {
                return "";
            }
        };
    }
}
