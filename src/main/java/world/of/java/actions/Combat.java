package world.of.java.actions;

import world.of.java.world.ICombattants;

import java.util.Random;

public class Combat {

    /**
     * Methode pour executer un combat
     * Prend 2 combattant en parametre
     * Tire au sort qui joue en 1er
     * Tire au sort entre une attaque ou ce nourrir
     */
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
                    attaque(hero,monster);
                }
                // Si tour Monstre
            } else {
                if (monster.getPointDeVie() < monster.getPointDeVieMax() && rand == 0) {
                    monster.manger();
                    gagnant(hero, monster);
                } else { // Si Monstres Attaque
                    attaque(monster,hero);
                }
            }
        }
    }

    /**
     * Retourne un message pour savoir qui a gagner le combat
     * @param hero
     * @param monster
     */
    private static void gagnant(ICombattants hero, ICombattants monster) {
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

    /**
     * Methode qui permet au heros d'attaquer 
     * Mets a jour l'endurance perdue chez les 2 équipe
     * @param hero
     * @param monster
     */
    private static void attaque(ICombattants combattants1, ICombattants combattants2){
        combattants1.attaquer(combattants2);
        perdreEndurance(combattants1,combattants2);
        System.out.println(combattants1.getNom() + " inflige " + combattants1.getArmes().getDegat() + " a " + combattants2.getNom());
        System.out.println("Il lui reste " + combattants2.getPointDeVie() + " point de vie");
        gagnant(combattants1, combattants2);
    }
    
    /**
     * Fait perdre de l'endurance au combattant
     * 
     */
    public static void perdreEndurance(ICombattants combattants1, ICombattants combattants2){
        combattants1.setEndurance(combattants1.getEndurance() - ((combattants1.getArmes().getLongueur()*combattants1.getArmes().getPoids())/(1000*combattants1.getForce())));
        combattants2.setEndurance(combattants2.getEndurance() - (combattants2.getArmes().getPoids()/(100*combattants2.getForce())));
    }
}
