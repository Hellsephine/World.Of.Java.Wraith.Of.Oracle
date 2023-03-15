package world.of.java.actions;

import world.of.java.world.ICombattants;

import java.util.Random;

public class Combat {

    public static void combat(ICombattants hero, ICombattants monster) {
        while(hero.getPointDeVie() > 0 && monster.getPointDeVie() > 0) {
            int rand = new Random().nextInt(2);
            boolean turn = new Random().nextBoolean();
            // Si tour Héros
            if (turn) {
                if (hero.getPointDeVie() < hero.getPointDeVieMax() && rand == 0) {
                    hero.manger();
                    gagnant(hero, monster);
                } else { // Si Héros Attaque
                    attaqueHeros(hero,monster);
                }
                // Si tour Monstre
            } else {
                if (monster.getPointDeVie() < monster.getPointDeVieMax() && rand == 0) {
                    monster.manger();
                    gagnant(hero, monster);
                } else { // Si Monstres Attaque
                    attaqueMonstres(monster,hero);
                }
            }
        }
    }

    private static void gagnant(ICombattants hero, ICombattants monster) {
        // Condition de vérification de qui gagne le combat
        if (hero.getPointDeVie() > 0 && monster.getPointDeVie() <= 0) {
            System.out.println("Le vainqueur est " + hero.getNom());
        }
        else if (hero.getPointDeVie() <= 0 && monster.getPointDeVie() > 0){
            System.out.println("Le vainqueur est " + monster.getNom());
        }
        else {
            System.out.println("Le combat continue");
        }
    }

    private static void attaqueHeros(ICombattants hero, ICombattants monster){
        hero.attaquer(monster);
        hero.perdreEnduranceAttaque();
        monster.perdreEnduranceDefence();
        System.out.println(hero.getNom() + " inflige " + hero.getArmes().getDegat() + " a " + monster.getNom());
        System.out.println("Il lui reste " + monster.getPointDeVie() + " point de vie");
        gagnant(hero, monster);
    }

    private static void attaqueMonstres(ICombattants hero, ICombattants monster){
        monster.attaquer(hero);
        monster.perdreEnduranceAttaque();
        hero.perdreEnduranceDefence();
        System.out.println(monster.getNom() + " vous inflige " + monster.getArmes().getDegat());
        System.out.println("Il vous reste " + hero.getPointDeVie() + " point de vie");
        gagnant(hero, monster);
    }
}
