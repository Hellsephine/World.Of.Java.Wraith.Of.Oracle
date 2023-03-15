package world_of_java.world;

import world_of_java.factory.ArmeFactory;
import world_of_java.factory.BouclierFactory;
import world_of_java.factory.NourritureFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Equipe {
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
}
