public class Mage extends CharacterWNormalAttack{
    protected boolean buff;
    public void cast(Character p){
        normalAttack(p);
    }
    protected void buff(){
        if(mana < 15){
            System.out.println("Not enough mana");
            return;
        }
        atk *= 2;
        hp += 5;
        if(hp > maxHp) hp = maxHp;
        mana += 2;
        if(mana > maxMana) mana = maxMana;
        buff = true;
    }
}
