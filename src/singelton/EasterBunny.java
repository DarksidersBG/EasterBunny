package singelton;

public class EasterBunny {
    private static EasterBunny uniqueInstance;

    private EasterBunny(){



    }
    public static EasterBunny getInstance(){
        if(uniqueInstance==null){
            uniqueInstance= new EasterBunny();

        }

        return uniqueInstance;
    }
    public void imp(String bunny){
        System.out.println("The" + bunny+ "is here! Happy Easter!");
    }
}
