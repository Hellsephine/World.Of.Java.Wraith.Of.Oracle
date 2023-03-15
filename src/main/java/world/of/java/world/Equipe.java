package world.of.java.world;

import world.of.java.factory.NourritureFactory;
import world.of.java.factory.ArmeFactory;
import world.of.java.factory.BouclierFactory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Equipe implements Iterable<ICombattants> {
    private List<ICombattants> tab;
    public Equipe(){
        this.tab = new ArrayList<>();
    }
    public void addFighter(ICombattants pCombattants ){
        tab.add(pCombattants);
    }

    public void addArmes(){
        for (ICombattants e: tab) {
            e.setArmes(ArmeFactory.build());
        }
    }
    public void addBouclier(){
        for (ICombattants e: tab) {
            e.setBouclier(BouclierFactory.build());
        }
    }

    public ICombattants chooseFighter(){
        return tab.get(0);
    }

    public void addNourritures(int numberNourriture){
        int rand = new Random().nextInt(numberNourriture);
        for(int i = 0; i < rand; i++) {
            for (ICombattants e : tab) {
                e.getSac().addItems(NourritureFactory.buildNourriture());
            }
        }
    }

    public ICombattants get(int index){
        return tab.get(index);
    }
    public int size(){
        return tab.size();
    }

    @Override
    public Iterator<ICombattants> iterator() {
        return tab.iterator();
    }

    public boolean isAlive(){
        boolean alive = false;
        for (ICombattants e: tab) {
            if(e.getPointDeVie() <= 0) {
                alive = true;
            }
        }
        return alive;
    }
}
