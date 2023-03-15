package world_of_java.world;

import world_of_java.map.Coordonnes;
import world_of_java.objets.Armes;
import world_of_java.objets.Bouclier;

public class Personnage extends Combattant {

    private Armes armes;
    private Bouclier bouclier;

    public Personnage(Integer pointDeVieMax, String nom, Integer force, Integer endurance, Integer pointDeVie, Coordonnes coordonnes){
        super(nom, pointDeVieMax, force, endurance, pointDeVie, coordonnes);
    }


    public String toString(){
        return super.toString();
    }

    @Override
    public void setEndurance(Integer endurance) {

    }

    public Armes getArmes() {
        return armes;
    }

    public void setArmes(Armes armes) {
        this.armes = armes;
    }

    @Override
    public Bouclier getBouclier() {
        return bouclier;
    }

    @Override
    public void setBouclier(Bouclier bouclier) {
        this.bouclier = bouclier;
    }



}
