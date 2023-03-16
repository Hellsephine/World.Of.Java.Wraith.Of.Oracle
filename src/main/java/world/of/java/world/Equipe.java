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

    // Permet d'ajouter un combattant a une équipe
    public void addFighter(ICombattants pCombattants ){
        tab.add(pCombattants);
    }

    // Permet d'ajouter une arme a un combattant en parcourant l'équipe
    public void addArmes(){
        for (ICombattants e: tab) {
            e.setArmes(ArmeFactory.build());
        }
    }

     // Permet d'ajouter un bouclier a un combattant en parcourant l'équipe
    public void addBouclier(){
        for (ICombattants e: tab) {
            e.setBouclier(BouclierFactory.build());
        }
    }

    // Permet de recupere le 1er commbattant de l'équipe , celui a l'index 0
    public ICombattants chooseFighter(){
        return tab.get(0);
    }

    // Permet d'ajouter de la nourriture dans l'inventaire des équipe de combattant
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
