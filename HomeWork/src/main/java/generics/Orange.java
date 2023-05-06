package generics;

import java.util.List;

public class Orange extends Fruit {

    private float weightOrange = 1.5F;

    public float getWeightOrange() {
        return weightOrange;
    }

    public void setWeightOrange(float weightOrange) {
        this.weightOrange = weightOrange;
    }

    @Override
    public float getWeightFruit() {
        return getWeightOrange();
    }
}
