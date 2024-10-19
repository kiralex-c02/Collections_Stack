package collections.pegel;

import java.util.ArrayList;

public class WasserstandManager {
    private static ArrayList<Wasserstand> wasserstands = new ArrayList<>();

    // Add Method
    public void add(Wasserstand w) {
        wasserstands.add(w);
    }

    public Wasserstand findById(int id){
        for (Wasserstand w : wasserstands) {
            if(w.getId() == id){
                return w;
            }
        }
        return null;
    }

    public ArrayList<Wasserstand> findAllByName(String name){
        ArrayList<Wasserstand> filteredList = new ArrayList<>();
        for (Wasserstand w : wasserstands) {
            if(w.getName().equals(name)){
                filteredList.add(w);
            }
        }
        return filteredList;
    }

    public ArrayList<Wasserstand> findForAlarm(){
        ArrayList<Wasserstand> filteredList = new ArrayList<>();
        for (Wasserstand w : wasserstands) {
            if (w.getValue() >= w.getValueForAlarm()){
                filteredList.add(w);
            }
        }
        return filteredList;
    }

    public double calcAvgValue(String name){
        double value = 0;
        int cnt = 0;
        for (Wasserstand w : wasserstands) {
            if(w.getName().equals(name)){
                cnt += 1;
                value += w.getValue();
            }
        }
        return value / cnt;
    }










}
