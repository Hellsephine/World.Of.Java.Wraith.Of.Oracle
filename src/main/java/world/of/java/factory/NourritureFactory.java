package world.of.java.factory;

import world.of.java.objets.Nourriture;

public class NourritureFactory {
    public static Nourriture buildNourriture() {
        return new Nourriture("Ration",2,20);
    }
}

