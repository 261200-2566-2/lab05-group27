public class Lab05 {
    public static void main(String[] args) {

        Knight Knight = new Knight();
        Accessory sword = new Sword();
        Knight.equip(sword);
        printChar(Knight,1);
        Thief Thief = new Thief();
        printChar(Thief,2);

        Thief.stab(Knight);
        Knight.attack(Thief);

        System.out.println(" ");
        System.out.println("summarize");
        System.out.println(" ");
        Knight.roundEnd();
        Thief.roundEnd();
        printChar(Knight,1);
        printChar(Thief,2);

        Thief.evade();
        Knight.attack(Thief);

        System.out.println(" ");
        System.out.println("summarize");
        System.out.println(" ");
        Knight.roundEnd();
        Thief.roundEnd();
        printChar(Knight,1);
        printChar(Thief,2);
        System.out.println(" ");

        Wizard Wizard = new Wizard();
        Accessory Gloves = new Gloves();
        Wizard.equip(Gloves);
        printChar(Wizard,3);
        printChar(Thief,2);
        System.out.println(" ");

        Thief.stab(Wizard);
        Wizard.cast(Thief);

        System.out.println("summarize");
        System.out.println(" ");
        Knight.roundEnd();
        Thief.roundEnd();
        printChar(Wizard,3);
        printChar(Thief,2);
        System.out.println(" ");
    }
    public static void printChar(Character p, int i){
        System.out.println("player " + i + " (" + p.Class + ") (" + p.Accessory + ")");
        p.print();
    }
}
