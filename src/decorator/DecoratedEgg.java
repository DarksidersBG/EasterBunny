package decorator;

public class DecoratedEgg implements EggDecorator{

    private EggDecorator eggDecorator;

    public DecoratedEgg(EggDecorator eggDecorator) {
        this.eggDecorator = eggDecorator;
    }

    @Override
    public void decorateEgg(){
        this.eggDecorator.decorateEgg();
    }
}
