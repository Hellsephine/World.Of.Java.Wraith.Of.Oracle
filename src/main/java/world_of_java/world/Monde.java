package world_of_java.world;

import world_of_java.actions.Action;
import world_of_java.factory.MonstreFactory;
import world_of_java.factory.PersonnageFactory;


public class Monde {

    //Création des équipes
    Equipe heros = new Equipe();
    Equipe monstres = new Equipe();

    /**
     * Méthode qui permet de faire s'affronte un Personnage et un Monstre dans un combat à mort
     * Chacun des deux combattants attaque en tour par tour
     **/

    public enum Choix{
        MOVE,SLEEP,NOTHING
    }


    private void lancementJeu() {

        // Création des Heros & Monstres et ajout aux équipe spécifique
        heros.addFighter(PersonnageFactory.build());
        heros.addFighter(PersonnageFactory.build());
        monstres.addFighter(MonstreFactory.build());
        monstres.addFighter(MonstreFactory.build());

        // Ajout des armes aux Héros & Monstres
        heros.addArmes();
        monstres.addArmes();

        // Ajout des boucliers aux Héros & Monstres
        heros.addBouclier();
        monstres.addBouclier();

        // Ajout de la nourriture aux Sac
        heros.addNourritures(15);
        monstres.addNourritures(15);


    }

    public void demarrer() {

        System.out.println("Création du monde");
        lancementJeu();
        System.out.println("Le monde est créée");
        System.out.println("Lancement des combats");
        //Action.combat(heros.chooseFighter(), monstres.chooseFighter());


    }

}