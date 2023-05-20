import Factory.ConstEggs;
import Factory.EggFactory;
import Factory.MagicBag;
import decorator.ColorDecorator;
import decorator.DecoratedEgg;
import decorator.EggDecorator;
import decorator.StickerDecorator;
import observer.Bag;
import observer.ChicksSubs;
import observer.ObserverChicks;
import singelton.EasterBunny;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        int eggCounter=0;
        EasterBunny easterBunny= EasterBunny.getInstance();

        ObserverChicks firstChick=new ChicksSubs("Eli");
        ObserverChicks secondChick=new ChicksSubs("Deni");
        ObserverChicks thirdChick=new ChicksSubs("Niki");

        Bag bag=new Bag();

        bag.subscriber(firstChick);
        bag.subscriber(secondChick);
        bag.subscriber(thirdChick);

        easterBunny.imp(" Easter Bunny ");

        EggDecorator color=new ColorDecorator();
        EggDecorator stickers=new StickerDecorator();

        EggDecorator eggColor = new DecoratedEgg(color);
        EggDecorator eggStickers=new DecoratedEgg(stickers);

        String chickenType="";
        Random random =new Random();
        EggFactory eggFactory=new EggFactory();

        //do {

            for(int i=0;i<5;i++) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Hey buddy,do you want an egg? - answer with Y or N");

                String command = sc.nextLine();


                if (command.equals("Y")) {

                    eggCounter++;
                    int eggType = random.nextInt(4);

                    switch (eggType) {
                        case 0:
                            chickenType = ConstEggs.CHICKEN_EGG;
                            break;
                        case 1:
                            chickenType = ConstEggs.QUAIL_EGG;
                            break;
                        case 2:
                            chickenType = ConstEggs.DINO_EGG;
                            break;
                    }
                    MagicBag egg = eggFactory.createEgg(chickenType);
                    System.out.println("Do you want to decorate this egg? - yes or no");
                    String answer = sc.nextLine();
                    int eggDecor = random.nextInt(2);
                    if (answer.equals("yes")) {
                        if (eggDecor == 0) {
                            color.decorateEgg();
                        } else {
                            stickers.decorateEgg();
                        }
                    }
                }
                System.out.println("You have "+eggCounter+" eggs!");
            }
//                command = sc.nextLine();
            //}

      //  }while (eggCounter>=5);
        System.out.println("Thank you,Happy Easter!");




    }
}
