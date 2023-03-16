package world.of.java.world;

import world.of.java.map.Coordonnes;
import world.of.java.objets.Armes;
import world.of.java.objets.Bouclier;

/**
 * Permet de creer une instance de Monstre
 * nécessisant Des pdv, nom, force, endurance , coordonnées
 */
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
