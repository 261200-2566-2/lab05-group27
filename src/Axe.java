public class Axe implements attackEquipment {
    protected String type;
    protected int atk,speed;
    public Axe(){
        this.atk = 15;
        this.speed = -6;
        this.type = "axe";
    }

    @Override
    public String type() {
        return type;
    }

    @Override
    public int speed() {
        return speed;
    }

    @Override
    public int atk() {
        return atk;
    }
}
