package world_of_java.actions;

import world_of_java.world.ICombattants;

public class Sleep {
    public static void heal(ICombattants combattants){
        combattants.setPointDeVie(combattants.getPointDeVieMax());
    }
}
