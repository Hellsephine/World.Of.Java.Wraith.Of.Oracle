package world.of.java.actions;

import world.of.java.map.Map;
import world.of.java.world.ICombattants;
import world.of.java.world.Monde;

import java.util.Random;

public class Action {

    /**
     * Permet de réaliser une action choisi au hasard a chaque tour du combattant
     * @param combattants le combattant qui doit réaliser l'action
     * @param map 
     */
    public  static void executeAction(ICombattants combattants, Map map) {
        Monde.Choix[] choix = Monde.Choix.values();
        int rand = new Random().nextInt(choix.length);
        Monde.Choix choixEffectuer = choix[rand];
        switch (choixEffectuer) {
            case SLEEP:
                Sleep.heal(combattants);
                System.out.println(combattants.getNom()+" dort !");
                break;
            case MOVE:
                Move.deplacement(combattants,map);
                System.out.println(combattants.getNom()+" ce deplace ");
                break;
            case NOTHING:
                System.out.println(combattants.getNom()+" ne fait rien");
                break;
        }
    }
}
