package world.of.java.objets;

import java.util.ArrayList;
import java.util.List;

public class Sac {

    private List<Items> tab;
    public Sac(){
        this.tab = new ArrayList<>();
    }

    public void addItems(Items items ){
        tab.add(items);
    }

    public Items getItems(int index){
        return tab.get(index);
    }

    public int size(){
        return tab.size();
    }

    public Items removeItems(int index){
        return tab.remove(index);
    }
}
