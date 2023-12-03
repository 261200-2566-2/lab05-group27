public class Thief extends Assassin{
    @Override
    public void stab(Character p) {
        super.stab(p);
    }
    public void evade() {super.evade();}
    public Thief(){
        hp = 30;
        atk = 15;
        def = 5;
        mana = 15;
        maxMana = mana;
        speed = 30;
        Class = "Thief";
    }
}
