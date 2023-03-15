package world_of_java;

import world_of_java.world.Monde;

public class Main {
    public static void main(String... args) {

        // Lance V3
        Monde m = new Monde();
        m.demarrer();


        // Lancement V2
        // Monde.combat(heros.chooseFighter(),monstres.chooseFighter());
        // Lancement V1
        // Monde.combat(Monde.personnageFactory(), Monde.monstreFactory());
    }

}