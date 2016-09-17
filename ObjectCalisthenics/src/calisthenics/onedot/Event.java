package calisthenics.onedot;

/**
 * Created by thaodang on 18/8/15.
 */
public class Event {
    private final Probability probability;

    public Event(Probability probability) {
        this.probability = probability;
    }

    public Probability likelyHood() {
        return probability;
    }

    public double isHappening() {
        return probability.value();
    }

    public double isNotHappening() {
        return 1 - probability.value();
    }

    public double isHappeningWith(Event event) {
        return probability.value() * event.probability.value();
    }

    public double isHappeningWithExclusive(Event event) {
        return probability.value() + event.isHappening() - isHappeningWith(event);
    }
}

class Something {
    public boolean happening(Event event) {
        return event.likelyHood().value() == 1; //WARNING!!!!!!!!!!!!!!!
    }
}



