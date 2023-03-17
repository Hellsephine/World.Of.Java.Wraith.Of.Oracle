package world.of.java.world;

import world.of.java.actions.Action;
import world.of.java.actions.Combat;
import world.of.java.map.Map;
import world.of.java.factory.MonstreFactory;
import world.of.java.factory.PersonnageFactory;


public class Monde {

    //Création des équipes
    Equipe heros = new Equipe();
    Equipe monstres = new Equipe();
    Map map = new Map();

    /**
     * Méthode qui permet de faire s'affronte un Personnage et un Monstre dans un combat à mort
     * Chacun des deux combattants attaque en tour par tour
     **/

    public enum Choix{
        MOVE,SLEEP,NOTHING
    }

    /**
     * Methode qui regroupe les différent objet
     * a instancier et a regroupe dans les
     * sac et & equipe respective
     */
    public void lancementJeu() {

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

        // Creation du monde & placement des héros et monstres
        map.create();
        for (int i = 0; i < heros.size(); i++) {
            map.placerJoueur(heros.get(i));
        }
        for (int i = 0; i < monstres.size(); i++) {
            map.placerJoueur(monstres.get(i));
        }

    }

    /**
     * Methode qui boucle sur l'équipe des héros et des monstres pour execute les combat ou les action
     * @return un boolean pour savoir si l'équipe est en vie ou non
     */
    public boolean demarrer() {
        boolean etat = true;
        System.out.println(heros.size()+" "+monstres.size());
        try {
            if (heros.chooseFighter().getCoordonnes().equals(monstres.chooseFighter().getCoordonnes())){
                Combat.combat(heros.chooseFighter(), monstres.chooseFighter());
            }else {
                Action.executeAction(heros.chooseFighter(),map);
            }
        etat = heros.isDead();
            if (monstres.chooseFighter().getCoordonnes().equals(heros.chooseFighter().getCoordonnes())){
                Combat.combat(monstres.chooseFighter(), heros.chooseFighter());
            }else {
                Action.executeAction(monstres.chooseFighter(),map);
            }
        etat = monstres.isDead();
        return !etat;
        } catch (Exception e) {
            return true;
        }
    }

    /**
     * Essayer pour retourner la team qui gagne
     * @return
     */
    public void teamWinner(){
       if (heros.size() == 0){
            System.out.println("Les monstres on gagné !");
       }else if (monstres.size() == 0) {
            System.out.println("Les héros on gagné !");
        }else{
            System.out.println("No one win.");
        }
    }
}