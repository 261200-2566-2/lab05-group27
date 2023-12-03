public class Sniper extends RangeFighter{
    @Override
    protected void shoot(Character p) {
        super.shoot(p);
    }

    @Override
    public void evade() {
        super.evade();
    }

    public Sniper(){
        hp = 25;
        atk = 20;
        def = 10;
        mana = 15;
        maxMana = mana;
        speed = 5;
        Class = "Sniper";
    }
}
