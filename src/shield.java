public class shield implements defEquipment {
    protected String type;
    protected int def,speed;
    public shield(){
        this.def = 10;
        this.speed = -5;
        this.type = "shield";
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
