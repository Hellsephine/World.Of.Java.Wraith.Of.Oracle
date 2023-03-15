package world_of_java.factory;

import world_of_java.objets.Armes;
import world_of_java.objets.Nourriture;

import java.util.Random;

public class NourritureFactory {
    public static Nourriture buildNourriture() {
        return new Nourriture("Ration",2,20);
    }
}

