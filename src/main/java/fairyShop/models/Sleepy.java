package fairyShop.models;

public class Sleepy extends BaseHelper{

    private static final int ENERGY = 50;
    private int energy;

    public Sleepy(String name) {
        super(name, ENERGY);
    }

    @Override
    public void work() {
        if (energy - 15 < 0) {
            energy = 0;
        } else {
            energy -= 15;
        }
    }
}
