public class MeleeFighter extends CharacterWNormalAttack{
    protected boolean isGuard;
    protected void attack(Character p){
        normalAttack(p);
    }
    protected void guard(String guard){
        if(mana < 5){
            System.out.println("Not enough mana");
            return;
        }
        if(guard.equals("activate") && !isGuard){
            isGuard = true;
            def *= 2;
            mana -= 5;
        }else if(guard.equals("deactivate") && isGuard){
            isGuard = false;
            def /= 2;
        }else{
            System.out.println("wrong input");
        }
    }
}

