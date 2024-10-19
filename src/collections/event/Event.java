package collections.event;

public class Event {
    String title;
    String place;
    double price;

    public Event(String title, String place, double price) {
        this.title = title;
        this.place = place;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Event{" +
                "title='" + title + '\'' +
                ", place='" + place + '\'' +
                ", price=" + price +
                '}';
    }
}
