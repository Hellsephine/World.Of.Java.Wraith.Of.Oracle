package world.of.java.factory;

import world.of.java.objets.Bouclier;

import java.util.Random;

public class BouclierFactory {
    public static Bouclier build(){
        boolean rand = new Random().nextBoolean();
        Bouclier bouclier;
        if (rand){
            bouclier = new Bouclier("Shield", 5, 100);
        }
        else {
            bouclier = new Bouclier("Main nue",0 , 0);
        }
        return bouclier;

    }
}
