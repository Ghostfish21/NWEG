package tbcbuild.specialText.friendIA;

import tbcbuild.card.level1.Item_SmallCoolant;
import tbcbuild.card.level1.Misc_PersonalId;
import tbcbuild.card.level1.Misc_PersonalPanelChoice;
import tbcbuild.card.level2.*;
import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.PagesPureDescription;
import tbcbuild.cardType.SpecialText;

import static tbcbuild.Util.obtain;

public class InteractBook_IA extends SpecialText implements Printer {
    @Override
    public String description() {
        return "第一页\n" +
                "\n" +
                "亦亚：自我介绍一下，在基地被废弃前，我是协助总长管理各种大小事务的人工智能，亦亚。请不要把我当作机器人，我是真正的AI生命\n" +
                "\n" +
                "是我设置的唤醒程序，引导你的复苏。很对不起在你醒来的时候我没有赶到你身边，我刚才在做东西，一看时间才发现你大概已经醒了\n" +
                "\n" +
                "基地现在已经废弃很久了，现在非常危险。我想要终结这一切，但是作为一个人工智能，有很多地方我没有进入的权限，这也就是我唤醒你的原因\n" +
                "在接下来的很长一段时间内，我们都将一起探索这座废弃的基地！请多多指教啦！你愿意帮助我的对吧？\n" +
                "\n" +
                "我：嗯\n" +
                "\n" +
                "亦亚：好耶！\n" +
                "这个飞行小机器人只是我的一个终端，平常的时候我只能设置自动程序伴飞，有情况的话可以呼叫我，或者我看到了，也会主动切过来的！\n" +
                "\n" +
                "A: 我不知道接下来往哪里走... （第二页）\n" +
                "B: 基地里存在危险吗？ （第九页）\n" +
                "C: 没有其他问题了\n" +
                "\n" +
                "第二页\n" +
                "\n" +
                "亦亚：啊，我忘记了，你刚来对吧！我们要先去给你找身趁手的装备，然后去领取一个崭新的个人面板和身份卡。这些都在技术部呢，就在楼下！不过安全起见，我们还是先去找装备吧！\n" +
                "\n" +
                "A: " + new Misc_PersonalPanelChoice().getReferName() + "（没有则忽略）（第三页）\n" +
                "B: " + new Misc_PersonalId().getReferName() + "（没有则忽略）（第七页）\n" +
                "C: 什么是个人面板呀？（第八页）\n" +
                "D: 什么是身份卡呀？（第十二页）\n" +
                "\n" +
                "第三页\n" +
                "\n" +
                "亦亚: 嗯...我们可以直接取一个新的，反正都在技术部。你看到的那个应该是王浩的，如果要正常使用的话，还是需要刷机重置。个人面板是绑定指纹，虹膜，以及身份卡的，有很多繁琐的配置需要做。它可以获得基地大部分的资料，当然现在不行了，机房都空啦。\n" +
                "\n" +
                "A: 机房被搬空了吗？（第四页）\n" +
                "B: 那它还能做什么呢？（第五页）\n" +
                "\n" +
                "第四页\n" +
                "\n" +
                "亦亚：嗯。基地废弃掉的时候，有一些机箱被损坏，最后全都被运到新家园里去了！\n" +
                "\n" +
                "A: 你没有一起去吗？（第六页）\n" +
                "\n" +
                "第五页\n" +
                "\n" +
                "亦亚：好问题！真聪明，不愧是最后一个从冬眠仓出来的人类呢！它现在可以存储一些我发给你的资料啊，安装一些离线的小程序之类的，以后会用到的！\n" +
                "\n" +
                "第六页\n" +
                "\n" +
                "亦亚：......他们把我落在这里了。我们不要讨论这个话题了，好吗？\n" +
                "\n" +
                "第七页\n" +
                "\n" +
                "亦亚：没错，就是那个！吧身份卡带在身边的话，一般来说，不需要刷卡，走近就会识别到你啦！电梯外面还有一个隐蔽的摄像头，通电的话，它会识别到你，同时检测你身份卡的信号的！\n" +
                "\n" +
                "第八页\n" +
                "\n" +
                "亦亚：个人面板是基地所有成员人手一份的个人终端。在基地还没有被废弃之前，大家的所有文件，数据，录像记录都存放在上面。平常视频或者语音通话，开会也会通过终端上的程序实现。技术部还从旧世界弄了几款热门游戏到个人面板上呢！可惜服务器也都被运走了\n" +
                "\n" +
                "A: 那它还能做什么呢？（第五页）\n" +
                "\n" +
                "第九页\n" +
                "\n" +
                "亦亚：当然存在！！托托马斯的福，现在基地里...一言难尽。最好的预期是你会遭遇灵质生物，你来这里之前肯定看过那本新世界探索指南了吧？你离开的时候是哪一年，现在更新到多少版本了？\n" +
                "\n" +
                "我: 2170年，第三版\n" +
                "\n" +
                "亦亚：已经这么久过去了啊... 不知道江北现在怎么样，希望他们现在已经全到新世界了。既然你看过，就一定知道灵质生物的攻击会产生无法修复的健康问题吧！和他们战斗的时候务必要小心才行！\n" +
                "\n" +
                "A: 和他们战斗有什么技巧吗？（第十页）\n" +
                "B: 为什么会有永久性的伤害呀，我这么说准确吗？（第十一页）\n" +
                "\n" +
                "第十页\n" +
                "\n" +
                "亦亚：嗯...首先，最最重要的一点，遇到战斗了要冷静，不要惊慌。第二点就是，能远程就不要近战，如果陷入必须近身作战的情景了的话，有条件的话用手炮先给它一梭子，然后迅速远离。没有手炮的话我的建议是直接跑\n" +
                "\n" +
                "第十一页\n" +
                "\n" +
                "亦亚：这么说没问题。灵质生物对我们的攻击是灵魂层面的，灵魂层面造成的伤害，我们的身体不知道要怎么才能修复。\n" +
                "\n" +
                "第十二页\n" +
                "\n" +
                "亦亚：身份卡是每个基地成员的唯一身份识别卡，基地里的绝大部分器械都会主动检测自身周围的身份卡信号，通过这样的方式来识别大家！没有身份卡的话，在基地会寸步难行的！\n" +
                "\n" +
                "没有其他问题了\n" +
                "\n" +
                "亦亚：那我们出发吧！给你这个（" + obtain(true, new Item_BlackCharger()) + "）。现在我们到火种复苏中心的楼梯间，右边的门那边，把它贴到门上！\n" +
                "根据我的记录显示，在基地彻底短线前，曾经有一位基地快反成员的终端一直留在这里。如果是这样的话，它的装备也一定还在！\n" +
                "\n" +
                "第十三页\n" +
                "\n" +
                "你将 " + new Item_BlackCharger().getReferName() + " 贴到门上后，消耗了十点电力，亦亚飞到了门的一角，过了一小会，你听到了一声卡擦的声音。门锁被解开了。你推开了门。看到了里面有一具白骨化的尸体。骨头上有战术腰带，P11手炮，和1个小型能量匣与12块冷却块。\n" +
                "\n" +
                "亦亚：好消息，我们找到武器了！坏消息，我们找到武器了...\n" +
                "\n" +
                obtain(true, new Item_P11(), new Item_TacticalBelt_3(), new Item_SmallCoolant(), new Item_SmallCoolant(), new Item_SmallEnergyRag()) +
                "\n\n" +
                "接下来我们去技术部吧！\n" +
                "\n" +
                "第十四页\n" +
                "\n" +
                "你将 " + new Item_BlackCharger().getReferName() + " 贴到门上后，消耗了十点电力，亦亚飞到了门的一角，过了一小会，你听到了一声卡擦的声音。门锁被解开了。你推开了门。" + obtain(true, new Map_TechnicalDepartment()) + "\n" +
                "\n" +
                "亦亚：这里就是技术部啦，推开前面的小门，里面可以找到崭新的个人面板和身份卡！不过我不太清楚它的密码哎，我只记得923这个数字！其他的你可以找找看\n" +
                "工作人员应该会随身携带备份吧！以免他们自己忘记了？\n" +
                "找到之后用那边那个小巧的机器就可以激活他们啦。记得用我给你的小黑盒子哦";
    }

    @Override
    public String nameTag() {
        return "IA Interact Book";
    }

    @Override
    public CardPrinter printer() {
        return new PagesPureDescription() {{
                add("""
                        Page 1

                        IA：Let me introduce myself. Before the base was abandoned, I was the A.I. who helped the General manage everything big and small, IA. Please don't treat me as a robot, I am a real AI life

                        I set the wake-up sequence to guide your resuscitation. I'm sorry that I didn't get to you when you woke up. I was making something just now, and when I looked at the time, I realized that you were probably awake

                        The base is now long abandoned, and it is very dangerous. I want to end this, but as an AI, there are a lot of places I don't have access to, which is why I woke you up
                        We'll be exploring this abandoned base together for a long time to come! Please give me more advice! You're willing to help me, aren't you?

                        You: sure!

                        IA: Yeah!
                        This flying robot is just a terminal of mine, usually I can only set up automatic program with flying, if there is a situation can call me, or I see, will take the initiative to cut over!

                        A: I don't know where to go from here... (Page 2)
                        B: Is there any danger on the base? (Page 9)
                        C: Don't have other questions""");
                add("""
                        Page 2
                        
                        IA: Oh, I forgot. You just got here, right? We're gonna go get you some gear, and then we're gonna pick up a brand new panel and ID card. It's all in Tech Department. It's downstairs! But to be safe, let's get our gear first!
                        
                        A: 43 Misc Card (ignore if N/A) (Page 3)
                        B: 41 Misc Card (ignore if N/A)(Page 7)
                        C: What is personal panel? (Page 8)
                        D: What is ID card? (Page 12)
                        """.replace("43 Misc Card", new Misc_PersonalPanelChoice().getReferName()
                        .replace("41 Misc Card", new Misc_PersonalId().getReferName())));
                add("""
                        Page 3
                        
                        IA: well... We can just get a new one. It's all in Tech Department. The one you see should be Wang Hao's. If you want to use it normally, you still need to reset the machine. The personal panel is bound to the fingerprint, iris, and ID card, there is a lot of tedious configuration to do. It has access to most of the base's data, but not anymore. The server room is empty.
                        
                        A: Has the computer room been emptied? (Page 4)
                        B: So what else can it do? (Page 5)
                        """);
                add("""
                        Page 4
                        
                        IA: Well. Some of the boxes were damaged when the base was abandoned, and they all ended up in the new homeland!
                        
                        A: Why didn't you go with them? (Page 6)
                        """);
                add("""
                        Page 5
                        
                        IA: Good question! Brilliant. The last human to emerge from the hibernacula! It can now store some of the information I sent to you, install some offline small programs and so on, will be useful in the future!
                        """);
                add("""
                        Page 6
                        
                        IA: ......They left me here. Let's not talk about it, can we?
                        """);
                add("""
                        Page 7
                        
                        IA: Yes, that's it! If the identity card is taken with you, generally speaking, you don't need to swipe the card. Just come near, the devices will recognize you. There is also a hidden camera outside the elevator. If powered up, it will recognize you and detect the signal of your ID card!
                        """);
                add("""
                        Page 8
                        
                        IA: The personal panel is a personal terminal shared by all members of the base. Before the base was abandoned, all your files, data, video recordings were stored on it. Ordinary video or voice calls, meetings will also be through the terminal program to achieve. The tech department also got a few popular games from the old world for the personal panel! Unfortunately, the servers are gone, too
                        
                        A: So what else can it do? (Page 5)
                        """);
                add("""
                        Page 9
                                                
                        IA: Of course it does!! Thanks to Thomas, the base is now... It's a long story. The best you can hope for is an encounter with a Ling creature. You must have read that New World Exploration Guideline before you came here, right? What year was it when you left, and how many editions are there now?
                                                
                        You: 2170, third edition
                                                
                        IA: It's been so long... I don't know how Jiangbei is now, I hope they have all arrived in the New world. Now that you've seen it, you know that attacks by Ling creatures can cause irreparable health problems. Be careful when you fight them!
                                                
                        A: Are there any techniques for fighting them? (Page 10)
                        B: Why would there be permanent damage? Am I accurate? (Page 11)
                        """);
                add("""
                        Page 10
                        
                        IA: Well... First and foremost, be calm and don't panic in a fight. The second point is, do not engage in melee combat if you can range. If you are in a situation where you must engage in Melee combat, give it a shuttle with your hand gun if possible and then move away quickly. Without a hand gun my advice is to just run.
                        """);
                add("""
                        Page 11
                        
                        IA: That's fine to say so. The attacks on us by Ling creatures are soul-level, and our body don't know how to fix it.
                        """);
                add("""
                        Page 12
                        
                        IA: The identity card is the unique identity card for each member of the base. Most of the equipment in the base will actively detect the identity card signal around itself, and identify everyone in this way! You won't be able to move around the base without your ID card!
                        """);
                add("""
                        Don't have other questions
                                                
                        ah: Let's go then! Here you are (please get item card 91). Now let's go to the stairwell of the Fire Anabosis Center, right by the door, and stick it to the door!
                                                
                        According to my records, there was a terminal of one of the base's fast response team member that remained here until the base was completely shorted. If so, it must still have its gear!
                        """.replace("please get item card 91", obtain(true, new Item_BlackCharger())));
                add("""
                        Page 13
                        
                        After you stick 91 ITEMS CARD to the door, consumed 10 eletric power. IA flew to the corner of the door, a few seconds later, you heard the weird sound. The door was unlocked. You push the door open and saw a white ossified body inside. The bone has a tactical belt, a P11 hand gun, and a small energy rag with 12 cooling blocks.
                        
                        IA: Good news! We found the weapon! Bad news, we found the weapon...
                        """.replace("91 ITEMS CARD", new Item_BlackCharger().getReferName()) +
                        "\n\n" + obtain(true, new Item_TacticalBelt_3(), new Item_P11(), new Item_SmallCoolant(), new Item_SmallCoolant(), new Item_SmallEnergyRag()) + "\n\n" +
                        "Let's go to technical department next!");
                add("""
                        Page 14
                        
                        After you stick 91 ITEMS CARD to the door, consumed 10 eletric power. IA flew to the corner of the door, a few seconds later, you heard the weird sound. The door was unlocked. You push the door open.
                        """.replace("91 ITEMS CARD", new Item_BlackCharger().getReferName()) +
                        obtain(true, new Map_TechnicalDepartment()) + "\n\n" +
                        "IA:  Here is the technical department. Open the small door in front of you, and you can find the brand new personal panel and ID card inside! But I don't know the password, I only remember the number 923! You can look for the parts of the password\n" +
                        "\n" +
                        "The staff should carry copies with them. In case they forget password themselves?\n" +
                        "\n" +
                        "Once we find them we can activate the panel and Id card with that little machine over there. Use the little black box I gave you");
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
