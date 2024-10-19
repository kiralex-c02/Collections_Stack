package collections.event;

import java.util.ArrayList;

public class EventKalender {

    //EventKalender Variable definieren
    private static ArrayList<Event> events = new ArrayList<>();

    // Add Method
    public void add(Event event) {
        events.add(event);
    }

    // Search event by title
    public Event getByTitle(String title) {
        for (Event e : events) {
            if (e.getTitle().equals(title)) {
                return e;
            }
        }
        //Defaultwert null
        return null;
    }

    // Search events by place
    public ArrayList<Event> getByPlace(String place) {
        ArrayList<Event> filteredEvents = new ArrayList<>();
        for (Event e : events) {
            if (e.getPlace().equals(place)) {
                filteredEvents.add(e);
            }
        }
        return filteredEvents;
    }

    // Get all Events with price between min and max
    public ArrayList<Event> getEntryPrice(double min, double max) {
        ArrayList<Event> filteredEvents = new ArrayList<>();
        for (Event e : events) {
            if (e.getPrice() >= min && e.getPrice() <= max) {
                filteredEvents.add(e);
            }
        }
        return filteredEvents;
    }

    //Get Event of specific Location with most expensive price
    public Event getMostExpensiveByPlace(String place) {
        double maxPrice = 0;
        for (Event e : events) {
            if (e.getPlace().equals(place) && e.getPrice() > maxPrice) {
                maxPrice = e.getPrice();
            }

        }
        for (Event e : events) {
            if(e.getPrice() == maxPrice){
                return e;
            }
        }
        return null;
    }

    // Avg price per Place
    public double getAvgPriveByPlace(String place) {
        double price = 0;
        int cnt = 0;
        for (Event e : events) {
            if (e.getPlace().equals(place)) {
                cnt += 1;
                price += e.getPrice();
            }
        }
        return price / cnt;
    }


    public static void main(String[] args) {
        //Variable zum Aufrufen für die Methoden
        EventKalender ek = new EventKalender();
        events.add(new Event("Herbstfest", "Graz", 2.50));
        events.add(new Event("Somerfest", "Graz", 3.50));
        events.add(new Event("Weihnachtsfeier", "Graz", 5.50));
        events.add(new Event("Geburtstag Oma", "SO", 0.0));
        events.add(new Event("Firmenfeier", "Raaba", 3.50));

        System.out.println(ek.getByTitle("Herbstfest"));
        System.out.println(ek.getByPlace("SO"));
        System.out.println(ek.getEntryPrice(2, 4));
        System.out.println(ek.getMostExpensiveByPlace("Graz"));
        System.out.println(ek.getAvgPriveByPlace("Graz"));
    }
}
