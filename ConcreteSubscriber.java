package observerPattern;

public class ConcreteSubscriber implements Subscriber {

    private String subscriberName;

    public String getSubscriberName() {
        return subscriberName;
    }

    public void setSubscriberName(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    @Override
    public void update(String news) {
        // This method is called by the NewsAgency when news is published
        System.out.println(subscriberName + " received news: " + news);
    }
}
