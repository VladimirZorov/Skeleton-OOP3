package fairyShop.models;

public class Happy extends BaseHelper{

private static final int ENERGY = 100;

    public Happy(String name) {
        super(name, ENERGY);
    }

    @Override
    public void work() {
        if (getEnergy() - 10 < 0) {
            setEnergy(0);
        } else {
            setEnergy(getEnergy()-10);
        }
    }
}
