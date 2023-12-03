public class Killer extends Assassin{
    @Override
    public void stab(Character p){
        super.stab(p);
    }

    @Override
    public void evade() {
        super.evade();
    }

    public Killer(){
        hp = 25;
        atk = 20;
        def = 10;
        mana = 15;
        maxMana = mana;
        speed = 20;
        Class = "Killer";
    }
}
