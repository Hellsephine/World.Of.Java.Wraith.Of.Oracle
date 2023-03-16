package world.of.java.actions;

import world.of.java.map.Map;
import world.of.java.world.ICombattants;

import java.util.Random;

public class Move {

    public enum directions{
       NORD,SUD,EST,OUEST
    }


    /**
     * Permet de choisir une direction au hasard 
     * Puis effectue un deplacement selon la direction
     * Enfin mes a jour la Map pour afficher les positions des Combattants
     * @param combattants
     * @param map
     */
    public static void deplacement(ICombattants combattants, Map map){
        directions[] direction = directions.values();
        int rand = new Random().nextInt(direction.length);
        directions directionChoisie = direction[rand];
        var position = combattants.getCoordonnes();
        map.resetPosition(position);
        switch (directionChoisie) {
            case NORD:
                if (position.getY() == 9){
                    System.out.println("Tu te prend un mur ! ");
                    break;
                }else {
                    position.setY(position.getY() + 1);
                    break;
                }
            case SUD:
                if (position.getY() == 0){
                    System.out.println("Tu te prend un mur ! ");
                    break;
                }else {
                    position.setY(position.getY() - 1);
                    break;
                }
            case EST:
                if (position.getX() == 9){
                    System.out.println("Tu te prend un mur ! ");
                    break;
                }else {
                    position.setX(position.getX() + 1);
                    break;
                }

            case OUEST:
                if (position.getX() == 0){
                    System.out.println("Tu te prend un mur ! ");
                    break;
                }else {
                    position.setX(position.getX() - 1);
                    break;
                }

        }
        map.updatePosition(position);
        map.afficherMap();
    }
}

