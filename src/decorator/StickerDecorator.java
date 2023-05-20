package decorator;

public class StickerDecorator implements EggDecorator{
    public void decorateEgg()
    {
        System.out.println("The egg got a brand new stickers");
    }
}
