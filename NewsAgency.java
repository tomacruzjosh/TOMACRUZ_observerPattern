package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements Subject {

    private String latestNews;
    private List<Subscriber> subscriberList;

    public NewsAgency() {
        this.subscriberList = new ArrayList<>();
    }

    public void setLatestNews(String newNews) {
        this.latestNews = newNews;
        System.out.println("--------------------------------------------------");
        System.out.println("BREAKING NEWS PUBLISHED: " + newNews);
        System.out.println("--------------------------------------------------");
        notifySubscribers(); // Automatically notify everyone when news changes
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscriberList.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber subscriber : subscriberList) {
            subscriber.update(latestNews);
        }
    }
}
