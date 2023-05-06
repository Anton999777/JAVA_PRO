package generics;

public class Apple extends Fruit {

    private float weightApple = 1.0F;

    public float getWeightApple() {
        return weightApple;
    }

    public void setWeightApple(float weightApple) {
        this.weightApple = weightApple;
    }

    @Override
    public float getWeightFruit() {
        return getWeightApple();
    }
}
