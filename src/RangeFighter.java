public class RangeFighter extends CharacterEvadable{
    protected void shoot(Character p){
        if(!isAlive()){
            System.out.println("Your character has died.");
            return;
        }
        if(!p.isAlive()){
            System.out.println("You cannot attack dead characters.");
            return;
        }
        if(p.isEvade()){
            System.out.println("You missed your attack.");
            return;
        }
        p.hp -= atk;
        if(p.hp < 0) {
            p.hp = 0;
        }
        mana += 2;
        if(mana > maxMana) mana = maxMana;
    }
}
