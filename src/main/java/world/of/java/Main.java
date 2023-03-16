package world.of.java;

import world.of.java.world.Monde;

public class Main {
    public static void main(String... args) {

        /**
         * Lance du jeu Version 3
         * Création d'un nouveau Monde
         * Puis instanciation des différent objet
         * Lancement de la boucle pour les tour de jeux
         */ 
        Monde m = new Monde();
        System.out.println("Création du monde");
        m.lancementJeu();
        System.out.println("Le monde est créée");
        System.out.println("Lancement des combats");
        boolean condition = true;
        while(condition){
            condition = m.demarrer();
        }
    }

}