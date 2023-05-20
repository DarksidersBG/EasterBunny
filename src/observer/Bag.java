package observer;

import decorator.EggDecorator;

import java.util.ArrayList;
import java.util.List;

public class Bag implements ObservableBag{
    private String topic;
    private List<ObserverChicks> chicksList = new ArrayList<>(3);
    private List<EggDecorator> eggList;

    public Bag(){
        this.eggList=new ArrayList<EggDecorator>();
        this.chicksList=new ArrayList<>();
    }

    public List<EggDecorator> getEggList() {
        return eggList;
    }

    @Override
    public void subscriber(ObserverChicks observerChicks) {
        this.chicksList.add(observerChicks);
    }

    @Override
    public void addEgg(EggDecorator egg) {

        if(eggList.size()<=5) {
            this.eggList.add(egg);
        }
        else{
            notifyObservers();
        }
    }

    @Override
    public void notifyObservers() {
        for(ObserverChicks ob : this.chicksList){
            ob.update();
        }
    }

    @Override
    public String getUpdate() {
        return topic;
    }
    public void setTopic(String topic){
        this.topic=topic;
        this.notifyObservers();
    }
}
