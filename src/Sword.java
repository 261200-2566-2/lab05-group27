public class Sword implements attackEquipment {
    protected String type;
    protected int atk,speed;
    public Sword(){
        this.atk = 10;
        this.speed = -3;
        this.type = "sword";
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
