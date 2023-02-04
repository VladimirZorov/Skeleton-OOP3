package fairyShop.models;

public class Sleepy extends BaseHelper{

    private static final int ENERGY = 50;

    public Sleepy(String name) {
        super(name, ENERGY);
    }

    @Override
    public void work() {
        if (getEnergy() - 5 < 0) {
            setEnergy(0);
        } else {
            setEnergy(getEnergy() - 5);
        }
    }
}
