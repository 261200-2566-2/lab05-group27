public class Gloves implements defEquipment {
    protected String type;
    protected int def,speed;
    public Gloves(){
        this.def = 4;
        this.speed = 2;
        this.type = "gloves";
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
