package collections.pegel;

public class Wasserstand {
    int id;
    String name;
    String place;
    double value;
    double valueForAlarm;

    public Wasserstand(int id, String name, String place, double value, double valueForAlarm) {
        this.id = id;
        this.name = name;
        this.place = place;
        this.value = value;
        this.valueForAlarm = valueForAlarm;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getValueForAlarm() {
        return valueForAlarm;
    }

    public void setValueForAlarm(double valueForAlarm) {
        this.valueForAlarm = valueForAlarm;
    }

    @Override
    public String toString() {
        return "Wasserstand{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", place='" + place + '\'' +
                ", value=" + value +
                ", valueForAlarm=" + valueForAlarm +
                '}';
    }
}
