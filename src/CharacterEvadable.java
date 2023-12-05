public class CharacterEvadable extends Character{
    protected boolean isEvade;
    public void evade(){
        isEvade = true;
        mana -= 5;
    }
}
