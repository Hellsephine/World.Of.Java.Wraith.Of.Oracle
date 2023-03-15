package world_of_java.world;

import world_of_java.map.Coordonnes;
import world_of_java.objets.Armes;
import world_of_java.objets.Bouclier;

public class Monstre extends Combattant {

    private Armes armes;
    private Bouclier bouclier;

    public Monstre(Integer pointDeVieMax, String nom, Integer force, Integer endurance, Integer pointDeVie, Coordonnes coordonnes) {
        super(nom, pointDeVieMax, force, endurance, pointDeVie, coordonnes);
    }

    public Armes getArmes() {
        return armes;
    }

    public void setArmes(Armes armes) {
        this.armes = armes;
    }

    public Bouclier getBouclier() {
        return bouclier;
    }

    public void setBouclier(Bouclier bouclier) {
        this.bouclier = bouclier;
    }

}
