package world.of.java.factory;

import world.of.java.map.Coordonnes;
import world.of.java.map.Map;
import world.of.java.world.Monstre;

import java.util.Random;

public class MonstreFactory {

    /**
     * Créer un Monstre avec tous ses attributs.
     * Demande a l'utilisateur d'entrer le nom du personnage.
     * retour: une instance de la classe Monstre correctement instancié.
     **/
    public static Monstre build(){
        String nom = monstrePrenom[new Random().nextInt(monstrePrenom.length)]
                +monstreNom[new Random().nextInt(monstreNom.length)];
        Integer force = new Random().nextInt(5,11);
        Integer pdv = new Random().nextInt(50,101);
        int xRandom = new Random().nextInt(0,Map.MAX_X);
        int yRandom = new Random().nextInt(0,Map.MAX_Y);
        Coordonnes coordonne = new Coordonnes(xRandom, yRandom);

        return new Monstre(pdv,nom,force, 1000,pdv, coordonne);

        // Monstre monstre = new Monstre(pdv,nom,force, 100,pdv, coordonne);
        // return monstre;
    }

    /**
     * Méthode qui contient une liste de prenom possibble pour le monstre
     * **/
    public static String[] monstrePrenom = new String[] {
            "Gobelin ","Orc ","Troll ","Elfe ","Dragon ","Licorne ","Gorgone ","Minotaure ",
            "Harpie ","Kraken ","Méduse ","Chimère ","Centaure ","Vampires ","Loup-garou ",
            "Golem ","Banshee ","Naga ","Ange déchu ","Cyclope ","Sphinx ", "Wyvern ",
            "Nécromancien ","Elfe noir ","Succube ","Démon ","Serpent de mer ", "Yéti ","Ondin "
    };

    /**
     * Méthode qui contient une liste de nom possibble pour le monstre
     * **/
    public static String[] monstreNom = new String[] {
            "Effrayant","Menaçant","Sinistre","Terrifiant","Mortel","Féroce","Implacable",
            "Meurtrier","Sanguinaire","Hurlant","Géant","Hideux","Repoussant","Monstrueux",
            "Nauséabond","Maléfique","Démoniaque","Surnaturel","Surnaturel","Énorme",
            "Invulnérable","Épouvantable","Mystérieux","Immortel","Invincible","Ancien",
            "Primitif","Surnaturel","Magique","Surnaturel","Puissant"
    };
}
