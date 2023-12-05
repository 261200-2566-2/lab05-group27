public class Character {
    protected int hp,maxHp,atk,def,mana,speed,maxMana;
    protected String Class;
    protected String Accessory = "not equipped";
    protected boolean isEvade(){
        if(this instanceof CharacterEvadable p){
            return p.isEvade;
        }else{
            return false;
        }
    }
    protected boolean isAlive(){
        return hp != 0;
    }
    public void roundEnd(){
        if(this instanceof CharacterEvadable p){
            p.isEvade = false;
        }
        if(this instanceof MeleeFighter p){
            p.isGuard = false;
        }
        if(this instanceof Mage p){
            if(p.buff){
                atk /= 2;
                p.buff = false;
            }
        }
    }
    public void equip(Accessory a){
        if(a instanceof attackEquipment){
            this.atk += ((attackEquipment) a).atk();
            this.speed += ((attackEquipment) a).speed();
            this.Accessory = a.type();
        }
        else if(a instanceof defEquipment){
            this.def += ((defEquipment) a).def();
            this.speed += ((defEquipment) a).speed();
            this.Accessory = a.type();
        }
        else {
            System.out.println("Accessory doesn't exist.");
        }
    }
    public void print(){
        if(this.isAlive()){
            System.out.println("Hp: "+ this.hp + "  atk: "+this.atk+"  def: "+this.def+"  mana: "+this.mana+"  speed: "+this.speed);
        }else {
            System.out.println("Your character is dead");
        }

    }
}
