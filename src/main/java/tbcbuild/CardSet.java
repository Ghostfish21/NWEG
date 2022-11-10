package tbcbuild;

import tbcbuild.card.level1.*;
import tbcbuild.card.level1.Object_HibernateTank.Object_HibernateTank;
import tbcbuild.card.level2.*;
import tbcbuild.cardType.Card;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class CardSet {
    public static final HashMap<String, Class<? extends Card>> cardSet = new HashMap<>();
    public static final LinkedHashMap<Class<? extends Card>, String> indices = new LinkedHashMap<>();
    public static final HashMap<Class<? extends Card>, Card> instance = new HashMap<>();
    public static int cardMainCount = 0;

    public CardSet() {
        new Plot_StartScene(true).register();
        new Map_FireSeedAnabiosisCenter(true).register();
        new Object_HelpDesk(true).register();
        new Object_HibernateTank(true).register();
        new Object_AnabiosisGate(true).register();
        new Object_EmergencyExit(true).register();
        new Object_TheRobot(true).register();
        new Object_TheDrawer(true).register();
        new Object_TheMonitorOnHelpDesk(true).register();
        new Finding_BloodedGate(true).register();
        new Finding_HibernateTankInternal(true).register();
        new Item_BoxBattery(true).register();
        new Finding_EmptyHolderInTank(true).register();
        new Finding_HibernateTankInside(true).register();
        new Item_DarkBluePen(true).register();
        new Item_Dairy_QingYun(true).register();
        new Item_Hair(true).register();
        new Finding_PluginAndWire(true).register();
        new Finding_RobotProductionInfo(true).register();
        new Finding_RobotNotResponding(true).register();
        new Item_ScrewDriver(true).register();
        new Finding_DismountableLid(true).register();
        new Item_WarpedMetalBoard(true).register();
        new Item_MetalDebris(true).register();
        new Item_UnbrokenMetalBoard(true).register();
        new Finding_RobotInternal(true).register();
        new Finding_EmptyRobotInternal(true).register();
        new Finding_BoostedRobot(true).register();
        new Item_PersonalPanel(true).register();
        new Item_Wire(true).register();
        new Finding_GateNotOpen(true).register();
        new Finding_InteractPadNotResponding(true).register();
        new Finding_TheSmallHoleOnHelpDesk(true).register();
        new Gear_Pray(true).register();
        new OO1_EyeBall(true).register();
        new Object_QuickResponseElevator(true).register();
        new Finding_ElevatorNotResponding(true).register();
        new Object_ElectricWellDoor(true).register();
        new Finding_ElectricWell(true).register();
        new Finding_NothingHappens_01(true).register();
        new Misc_PersonalId(true).register();
        new Misc_IAIntro(true).register();
        new Misc_PersonalPanelChoice(true).register();
        new Finding_HibernateTankInternal_Cool(true).register();
        new Finding_HibernateTankInternal_NotCool(true).register();
        new Item_SmallCoolant(true).register();
        new Object_CoolDownTank(true).register();
        new Question_PuzzleCalender(true).register();
        new Finding_PPOpen(true).register();
        new Question_PasswordPP(true).register();
        new Item_MapOfAnabosisFloor(true).register();
        new Map_DimmedStairRoom(true).register();
        new OO1_Letter(true).register();
        new Finding_ElevatorInternal(true).register();
        new Finding_Password(true).register();
        new Gear_Desire(true).register();

        new Object_DoorToCafeteriaAtN1(true).register();
        new Map_DimmedStairRoom(true).register();
        new Map_DimmedStairRoom_N1(true).register();
        new Map_TechnicalDepartment(true).register();
        new Object_RightDoorOutsideAnabosisCenter(true).register();
        new Plot_IAAppears(true).register();
        new Plot_IAIsComing(true).register();
        new Object_LeftDoorAtN1(true).register();
        new Finding_BackDoorNotResponding(true).register();
        new Object_UnpoweredMonitor1(true).register();
        new Object_SmallElevatorInTechnicalDepartment1(true).register();
        new Finding_ElevatorCantOpen(true).register();
        new Finding_ElevatorMightNotOpen(true).register();
        new Object_ProductElevator(true).register();
        new Object_BackDoorInTechnicalDepartment(true).register();
        new Object_SmallDoorInTechnicalDepartment(true).register();
        new Object_CardAndPanelActivator(true).register();
        new Finding_ElevatorOpened(true).register();
        new Finding_ElevatorOpen(true).register();
        new Map_BackRoomTechnicalDepartment(true).register();
        new Item_QZH(true).register();
        new OO1_Photo(true).register();
        new Item_PersonalID(true).register();
        new Plot_PlayerFall(true).register();
        new Item_Coins(true).register();
        new Item_TacticalBelt(true).register();
        new Item_Paper(true).register();
        new Object_Body1(true).register();
        new Item_Dairy_912(true).register();
        new OO1_OminousSmile(true).register();
        new Object_BlackServerStack(true).register();
        new Gear_Happiness(true).register();
        new Question_Password1(true).register();
        new Question_Password2(true).register();
        new Item_BlackCharger(true).register();
        new Item_P11(true).register();
        new Item_SmallEnergyRag(true).register();
    }

    public static String cardIndex(Class<? extends Card> card) {
        return indices.getOrDefault(card, "未知");
    }
}
