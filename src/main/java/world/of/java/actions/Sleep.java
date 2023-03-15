package world.of.java.actions;

import world.of.java.world.ICombattants;

public class Sleep {
    public static void heal(ICombattants combattants){
        combattants.setPointDeVie(combattants.getPointDeVieMax());
    }
}
