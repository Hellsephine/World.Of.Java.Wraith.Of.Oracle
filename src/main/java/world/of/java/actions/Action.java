package world.of.java.actions;

import world.of.java.map.Map;
import world.of.java.world.ICombattants;
import world.of.java.world.Monde;

import java.util.Random;

public class Action {

    public  static void executeAction(ICombattants combattants, Map map) {
        Monde.Choix[] choix = Monde.Choix.values();
        int rand = new Random().nextInt(choix.length);
        Monde.Choix choixEffectuer = choix[rand];
        switch (choixEffectuer) {
            case SLEEP:
                Sleep.heal(combattants);
                break;
            case MOVE:
                Move.deplacement(combattants,map);
                break;
            case NOTHING:
                System.out.println("Rien ne ce passe.");
                break;
        }
    }
}
