package Factory;

public abstract class MagicBagFactory {
    public abstract MagicBag createEgg(String eggName);

    public MagicBag produceEgg(String eggName) {
        MagicBag egg=createEgg(eggName);
        egg.create();
        return egg;
    }
}
