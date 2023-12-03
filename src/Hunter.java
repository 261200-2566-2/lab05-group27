public class Hunter extends RangeFighter{
    @Override
    public void shoot(Character p) {
        super.shoot(p);
    }

    @Override
    public void evade() {
        super.evade();
    }

    public Hunter(){
        hp = 30;
        atk = 10;
        def = 10;
        mana = 10;
        maxMana = mana;
        speed = 25;
        Class = "Hunter";
    }
}
