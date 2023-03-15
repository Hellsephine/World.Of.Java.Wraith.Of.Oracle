package world.of.java.factory;

import world.of.java.map.Coordonnes;
import world.of.java.world.Personnage;

import java.util.Random;

public class PersonnageFactory {

    /**
     * Créer un personnage avec tous ses attributs.
     * Demande a l'utilisateur d'entrer le nom du personnage.
     * retour: une instance de la classe Personnage correctement instancié.
     **/
    public static Personnage build(){
        String nom = heroNom[new Random().nextInt(heroNom.length)];
        Integer force = new Random().nextInt(5,11);
        Integer pdv = new Random().nextInt(50,101);
        int xRandom = new Random().nextInt(0,10);
        int yRandom = new Random().nextInt(0,10);
        Coordonnes coordonne = new Coordonnes(xRandom, yRandom);

        return new Personnage(pdv,nom,force, 100,pdv, coordonne);

        // Personnage personnage = new Personnage(pdv,nom,force, 100,pdv, coordonne);
        // return personnage;
    }

    public static String[] heroNom = new String[] {
            "Aiden","Aurora","Blade","Cassius","Diana","Dante","Ember","Shaolan",
            "Gwyneth","Haruki","Isadora","Jaxon","Kaida","Lysandra","Maximus","Nadia",
            "Orion","Phoenix","Raine","Thorin"
    };
}
