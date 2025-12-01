package observerPattern;

public class NewsSubscriptionService {
    public static void main(String[] args) {

        // 1. Create the NewsAgency (Subject)
        NewsAgency agency = new NewsAgency();

        // 2. Create Subscribers (Observers)
        ConcreteSubscriber sub1 = new ConcreteSubscriber();
        sub1.setSubscriberName("Maria");

        ConcreteSubscriber sub2 = new ConcreteSubscriber();
        sub2.setSubscriberName("Juan");

        ConcreteSubscriber sub3 = new ConcreteSubscriber();
        sub3.setSubscriberName("Oliver");

        // 3. Subscribers subscribe to the agency
        agency.subscribe(sub1);
        agency.subscribe(sub2);
        agency.subscribe(sub3);

        // 4. Agency publishes breaking news
        // All three subscribers should receive this
        agency.setLatestNews("Typhoon update: Signal No. 2 raised in Metro Manila.");

        // 5. Dynamic Update: Juan unsubscribes, Jerry subscribes
        agency.unsubscribe(sub2);

        ConcreteSubscriber sub4 = new ConcreteSubscriber();
        sub4.setSubscriberName("Jerry");
        agency.subscribe(sub4);

        // 6. Agency publishes new breaking news
        // Maria, Oliver, and Jerry receive it. Juan does not.
        agency.setLatestNews("Classes suspended in all levels for tomorrow.");
    }
}
