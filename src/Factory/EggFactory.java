package Factory;

public class EggFactory extends MagicBagFactory{
    @Override
    public MagicBag createEgg(String eggName) {
        if (eggName.equals(ConstEggs.CHICKEN_EGG)) {
            return new ChickenEgg();
        }
        if (eggName.equals(ConstEggs.DINO_EGG)) {
            DinoEgg dino = new DinoEgg();
            dino.create();
            return dino;
        }
        if (eggName.equals(ConstEggs.QUAIL_EGG)) {
            return new QuailEgg();
        }
        System.out.println("Sorry,we can't find this egg product: " + eggName);
        return null;
    }
}
