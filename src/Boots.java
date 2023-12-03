public class Boots implements defEquipment {
    protected String type;
    protected int def,speed;
    public Boots(){
        this.def = 2;
        this.speed = 6;
        this.type = "boots";
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
    public int def() {
        return def;
    }
}
