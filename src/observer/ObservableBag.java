package observer;

import decorator.EggDecorator;

public interface ObservableBag {
    void subscriber(ObserverChicks observerChicks);
    void addEgg(EggDecorator egg);
    void notifyObservers();
    String getUpdate();
}
