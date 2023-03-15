package world_of_java.actions;

import world_of_java.world.ICombattants;
import world_of_java.world.Monde;

import java.util.Random;

public class Action {

    public void executeAction(ICombattants combattants) {
        Monde.Choix[] choix = Monde.Choix.values();
        int rand = new Random().nextInt(choix.length);
        Monde.Choix choixEffectuer = choix[rand];
        switch (choixEffectuer) {
            case SLEEP:
                Sleep.heal(combattants);
                break;
            case MOVE:
                // Code à exécuter pour l'action 2
                break;
            case NOTHING:
                System.out.println("Rien ne ce passe.");
                break;
        }

    }
}
