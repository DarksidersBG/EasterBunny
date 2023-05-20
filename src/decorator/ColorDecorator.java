package decorator;

public class ColorDecorator implements EggDecorator{

    @Override
    public void decorateEgg() {
        System.out.println("The egg was colored");
    }
}
