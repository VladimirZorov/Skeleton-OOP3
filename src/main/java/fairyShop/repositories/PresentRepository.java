package fairyShop.repositories;

import fairyShop.models.Present;

import java.util.ArrayList;
import java.util.Collection;

public class PresentRepository implements Repository<Present>{

    private Collection<Present> presents;

    public PresentRepository() {
        this.presents = new ArrayList<>();
    }

    @Override
    public Collection<Present> getModels() {
        return null;
    }

    @Override
    public void add(Present present) {

    }

    @Override
    public boolean remove(Present present) {
        return false;
    }

    @Override
    public Present findByName(String name) {
        return null;
    }
}
