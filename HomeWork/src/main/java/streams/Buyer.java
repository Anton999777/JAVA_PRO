package streams;

import java.util.concurrent.Callable;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class Buyer implements Callable<Double> {

    private double amountPetrol;
    PetrolStation petrolStation;

    public Buyer(double amountPetrol, PetrolStation petrolStation) {
        this.amountPetrol = amountPetrol;
        this.petrolStation = petrolStation;
    }

    public double getAmountPetrol() {
        return amountPetrol;
    }

    @Override
    public Double call() throws Exception {
        petrolStation.doRefuel(amountPetrol);

        return petrolStation.getAmount();
    }
}
