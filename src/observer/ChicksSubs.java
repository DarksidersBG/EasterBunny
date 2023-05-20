package observer;

public class ChicksSubs implements ObserverChicks{
    private ObservableBag topic;
    private String name;

    public ChicksSubs(String name)
    {
        this.name=name;
    }

    @Override
    public void update() {
        System.out.println(this.getName()+ "The eggs are ready!" +this.topic.getUpdate());
    }

    public String getName() {
        return name;
    }

    @Override
    public void setTopic(ObserverChicks observer) {
        this.topic=topic;
    }
}
