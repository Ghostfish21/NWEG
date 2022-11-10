package tbcbuild.specialText.friendIA;

import tbcbuild.cardGenerator.Printer;
import tbcbuild.cardGenerator.card.CardPrinter;
import tbcbuild.cardGenerator.card.PureDescriptions;
import tbcbuild.cardType.SpecialText;

public class FilesInTechnicalDepartment extends SpecialText implements Printer {
    @Override
    public String description() {
        return "一、Operation of LOL server in November\n" +
                "\n" +
                "Day\tTotal players for the day\tHeighest players in the day\tHotest time\tNew player registered during the day\n" +
                "Within last 24 hours\t723\t532\t20:28\t0\n" +
                "29\t666\t450\t20:57\t0\n" +
                "28\t334\t268\t20:23\t0\n" +
                "27\t556\t345\t20:34\t1\n" +
                "26\t153\t102\t20:11\t5\n" +
                "25\t231\t200\t20:32\t0\n" +
                "24\t253\t213\t19:59\t2\n" +
                "23\t266\t205\t20:52\t0\n" +
                "22\t636\t520\t20:15\t0\n" +
                "21\t444\t408\t19:38\t0\n" +
                "20\t463\t352\t20:25\t0\n" +
                "19\t166\t120\t20:35\t0\n" +
                "18\t332\t253\t20:18\t0\n" +
                "17\t345\t298\t20:37\t1\n" +
                "16\t548\t468\t20:59\t0\n" +
                "15\t387\t150\t21:01\t0\n" +
                "14\t534\t340\t20:54\t3\n" +
                "13\t843\t568\t20:24\t4\n" +
                "12\t432\t320\t20:19\t0\n" +
                "11\t984\t754\t20:54\t0\n" +
                "10\t543\t326\t19:32\t1\n" +
                "9\t483\t241\t19:28\t2\n" +
                "8\t157\t98\t19:52\t0\n" +
                "7\t795\t652\t19:12\t0\n" +
                "6\t543\t357\t19:25\t2\n" +
                "5\t150\t108\t19:27\t1\n" +
                "4\t253\t233\t19:05\t0\n" +
                "3\t465\t425\t19:52\t0\n" +
                "2\t524\t407\t19:26\t0\n" +
                "1\t345\t296\t19:34\t0\n" +
                "\n" +
                "Two. Monitoring double shift\n" +
                "\n" +
                "1\t2\t3\t4\t5\t6\t7\t8\t9\t10\t11\t12\n" +
                "Xiao Huang\tChen Jianhua\n" +
                "13\t14\t15\t16\t17\t18\t19\t20\t21\t22\t23\t24\n" +
                "Chen Jianhua\tXiao Huang\n" +
                "\n" +
                "Three. Application Form for Technical Department entry V3.2 - EMA\n" +
                "Nickname：EMA\n" +
                "Name：马晔\n" +
                "Filling time：2179 year 4 month 20 day\n" +
                "Address: Dormitory 1, second floor, unit 64\n" +
                "\n" +
                "Why do you want to join us: \n" +
                "I am a comrade who came as reinforcements in '76. Recently, I saw the recruitment notice of the technical Department. I am very interested in discussing and solving problems with you\n" +
                "\n" +
                "Please briefly describe your abilities: \n" +
                "Before the Apocalypse, I was working on intelligent solutions for complex tasks in Web4. The main languages used were C*, Java and IU\n" +
                "In Web4, I am familiar with VR, AR, blockchain, and smart contracts, and has worked at Apolygon for a while.\n" +
                "I also have three or four years of experience in artificial intelligence. I am familiar with AAIT and Quanteme, but I am not familiar with ATF and Electric Neuron.\n" +
                "I have done front and back end development, familiar with interactive Icon, Stackable, paper and other tools. Html, CSS can also be read.\n" +
                "Have done the development of NodeSQL and MapDB, have one or two years of experience\n" +
                "\n" +
                "Interview time：2179 Year 4 Month 26 Day\n" +
                "Approver：Chen Jianhua\n" +
                "\n" +
                "Four. NodeSQL notes\n" +
                "\n" +
                "Obtain SQL Main Node\n" +
                "SQL = GET MAIN\n" +
                "*Obtain SQL Property Node\n" +
                "属性管理器 = SQL.get(“属性管理器”) 或者 SQL.get(“property_manager”):table\n" +
                "*Example Change the cache update priority\n" +
                "属性管理器.get(“缓存”).get(“更新优先度”):enum = \n" +
                "HIGHEST *The data cache is repulled before each operation\n" +
                "MEDIUM *The pull cache is updated before each lookup operation.\n" +
                "LOW *The pull cache is updated every 30 minutes. The time gap can be modified through.get(“缓存”).get(“update_time_gap”):int\n" +
                "LOWEST *The data cache is updated at connection time, which needs to be updated manually at runtime. The update instruction is UPDATE FROM REMOTE\n" +
                "\n" +
                "5. List of base communication Bridges\n" +
                "Site\tContracting team\tIs installed\tTesting result\n" +
                "Land security division\tThis Island Group 5\t√\t√\n" +
                "Land security division\t\t√\t√\n" +
                "Base ground hall\t\t√\t√\n" +
                "This island constructing department A\t\t√\t√\n" +
                "This island constructing department B\t\t√\t\n" +
                "This island constructing department C\t\t√\t√\n" +
                "This island constructing department D\t\t√\t√\n" +
                "Ground cafeteria\t\t√\t√\n" +
                "Research institution first floor\t\t√\t√\n" +
                "Research institution second floor\t\t√\t√\n" +
                "Research institution third floor\t\t\t\n" +
                "Dormitory 1, first floor\t\t√\t√\n" +
                "Dormitory 1, second floor\t\t√\t√\n" +
                "Base quick response, first floor\t\t√\t√\n" +
                "Base quick response, second floor A\tThis Island Group 2\t\t\n" +
                "Base quick response, second floor B\t\t√\t√\n" +
                "Base quick response, third floor\t\t\t\n" +
                "Dormitory 2, first floor A\t\t√\t√\n" +
                "Dormitory 2, first floor B\t\t√\t√\n" +
                "Dormitory 2, second floor A\tThis Island Group 6\t√\t\n" +
                "Dormitory 2, second floor B\t\t√\t√\n" +
                "New world research group\t\t√\t√\n" +
                "Fire anabosis center\t\t√\t√\n" +
                "Fire living zone A\t\t\t\n" +
                "Fire living zone B\t\t\t\n" +
                "Fire living zone C\t\t√\t√\n" +
                "The fire fitting building\t\t√\t√\n" +
                "The fire training field A\t\t√\t√\n" +
                "The fire training field B\t\t√\t√\n" +
                "Underground cafeteria\t\t\t\n" +
                "Academy A\tIsland Chain Group 3\t√\t√\n" +
                "Academy B\t\t√\t√\n" +
                "Academy C\t\t√\t√\n" +
                "Academy D\t\t√\t√\n" +
                "Publicity department\t\t√\t√\n" +
                "Dormitory 3, first floor\t\t√\t√\n" +
                "Dormitory 3, second floor\t\t√\t√\n" +
                "Dormitory 3, third floor\t\t√\t√\n" +
                "Warehouse first floor A\tThis Island Group 1\t√\t√\n" +
                "Warehouse first floor B\t\t√\t√\n" +
                "Warehouse first floor C\t\t√\t√\n" +
                "Warehouse first floor D\t\t√\t√\n" +
                "Warehouse second floor A\t\t\t\n" +
                "Warehouse second floor B\t\t√\t√\n" +
                "Warehouse second floor C\t\t√\t√\n" +
                "Warehouse second floor D\tThis Island Group 2\t\t\n" +
                "Warehouse three floor A\t\t√\t√\n" +
                "Warehouse three floor B\t\t√\t√\n" +
                "Warehouse three floor C\t\t√\t√\n" +
                "Warehouse three floor D\t\t√\t\n" +
                "Old world storage area\t\t√\t√\n" +
                "Old world waiting room\n\t\t\t\n" +
                "The supreme council A\t\t√\t√\n" +
                "The supreme council B\tThis Island Group 6\t√\t√\n" +
                "The supreme council C\t\t√\t√\n" +
                "Nuclear energy research institute A\t\t√\t√\n" +
                "Nuclear energy research institute B\t\t\t\n" +
                "Nuclear storage room\t\t\t\n" +
                "Nuclear reaction zone\t\t√\t\n" +
                "Admiralty quarters unit A\tNavy Network Communication Office\t√\t√\n" +
                "Admiralty quarters unit B\t\t√\t√\n" +
                "Admiralty quarters unit C\t\t√\t√\n" +
                "Admiralty quarters unit D\t\t√\t√\n" +
                "Admiralty quarters unit E\t\t√\t√\n" +
                "Admiralty dining room\t\t\t\n" +
                "Jia shipyard A\t\t√\t√\n" +
                "Jia shipyard B\t\t√\t√\n" +
                "Yi shipyard\t\t\t\n" +
                "Bing shipyard\t\t√\t√\n" +
                "North dock A\t\t√\t√\n" +
                "North dock B\t\t√\t√\n" +
                "South dock\t\t\t\n" +
                "North lighthouse\t\t\t\n" +
                "South lighthouse\t\t\t\n" +
                "Bio lab A\tLaboratory Tech Group\t√\t√\n" +
                "Bio lab B\t\t√\t√\n" +
                "Bio lab C\t\t√\t√\n" +
                "Bio lab D\t\t√\t√\n" +
                "Bio lab E\t\t√\t√\n" +
                "Bio lab F\t\t√\t√\n" +
                "Bio lab G\t\t√\t√\n" +
                "A1\tThis Island Group 1 + Land Security Team 4\t√\t√\n" +
                "A2\t\t√\t√\n" +
                "A3\t\t√\t√\n" +
                "A4\t\t√\t√\n" +
                "A5\t\t\t\n" +
                "A6\t\t√\t\n" +
                "A7\t\t\t\n" +
                "A8\t\t\t\n" +
                "A9\t\t\t\n" +
                "A10\t\t\t\n" +
                "B1\tThis Island Group 4 + Land Security Team 2\t√\t√\n" +
                "B2\t\t√\t√\n" +
                "B3\t\t\t\n" +
                "B4\t\t√\t\n" +
                "B5\t\t\t\n" +
                "B6\t\t√\t√\n" +
                "B7\t\t√\t√\n" +
                "B8\t\t\t\n" +
                "B9\t\t\t\n" +
                "B10\t\t\t\n" +
                "C1\tIsland Chain Group 1 + Quick Response Team Li\t√\t√\n" +
                "C2\t\t√\t√\n" +
                "C3\t\t√\t√\n" +
                "C4\t\t\t\n" +
                "C5\t\t\t\n" +
                "C6\t\t\t\n" +
                "C7\t\t√\t√\n" +
                "C8\t\t√\t√\n" +
                "C9\t\t√\t\n" +
                "C10\t\t\t\n" +
                "D1\tNavy Network Communication Office\t\t\n" +
                "D2\t\t\t\n" +
                "D3\t\t√\t√\n" +
                "D4\t\t√\t√\n" +
                "D5\t\t√\t√\n" +
                "D6\t\t√\t√\n" +
                "D7\t\t\t\n" +
                "D8\t\t√\t√\n" +
                "D9\t\t\t\n" +
                "D10\t\t√\t√\n" +
                "E1\t\t√\t\n" +
                "E2\t\t√\t√\n" +
                "E3\t\t\t\n" +
                "E4\t\t√\t√\n" +
                "E5\t\t√\t√\n" +
                "E6\tIsland Chain Group 5 + Quick Response Team Wang\t\t\n" +
                "E7\t\t\t\n" +
                "E8\t\t\t\n" +
                "E9\t\t\t\n" +
                "E10\t\t√\t√\n" +
                "F1\t\t√\t√\n" +
                "F2\t\t\t\n" +
                "F3\t\t√\t√\n" +
                "F4\t\t√\t√\n" +
                "F5\t\t√\t√\n" +
                "F6\t\t√\t√\n" +
                "F7\t\t\t\n" +
                "F8\t\t√\t√\n" +
                "F9\t\t√\t√\n" +
                "F10\t\t√\t\n" +
                "G1\tNavy Network Communication Office\t√\t√\n" +
                "G2\t\t√\t√\n" +
                "G3\t\t√\t√\n" +
                "G4\t\t\t\n" +
                "G5\t\t√\t√\n" +
                "G6\t\t√\t√\n" +
                "G7\t\t\t\n" +
                "G8\t\t\t\n" +
                "G9\t\t\t\n" +
                "G10\t\t√\t√\n";
    }

    @Override
    public String nameTag() {
        return "Messy Papers on the Floor";
    }

    @Override
    public CardPrinter printer() {
        return new PureDescriptions(FilesInTechnicalDepartment.this.description()) {
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
                return null;
            }
        };
    }
}
