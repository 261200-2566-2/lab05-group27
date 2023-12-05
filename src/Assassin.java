public class Assassin extends CharacterEvadable{
    protected void stab(Character p){
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
        int passiveAtk;
        if(this.speed > p.speed && this.mana >= maxMana){
            passiveAtk = atk+5;
        }else {
            passiveAtk = atk;
        }
        int damage = passiveAtk - p.def;
        if(damage <= 0) {
            System.out.println("Your attack power is too low to deal damage.");
            return;
        }
        p.hp -= damage;
        if(p.hp < 0) {
            p.hp = 0;
        }
        mana += 2;
        if(mana > maxMana) mana = maxMana;
    }
}
