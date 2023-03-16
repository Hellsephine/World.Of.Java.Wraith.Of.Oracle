package world.of.java.map;

import world.of.java.world.ICombattants;

public class Map {

    public static char VALEUR_CASE_VIDE = '#';
    public static char VALEUR_PERSONNAGE = '@';
    public final static int MAX_X = 5; 
    public final static int MAX_Y = 5; 
    private final char[][] map = new char[MAX_X][MAX_Y];
    public void create(){

        for(int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                map[i][j] = VALEUR_CASE_VIDE;
            }
        }
    }
    public void afficherMap() {

        for (char[] chars : map) {
            for (int j = 0; j < map[0].length; j++) {
                System.out.print(String.valueOf(chars[j]));
            }
            System.out.println();
        }
    }
    public void placerJoueur(ICombattants combattants){
        var position = combattants.getCoordonnes();
        map[position.getX()][position.getY()] = VALEUR_PERSONNAGE;
    }

    public void resetPosition(Coordonnes coordonnes){
        map[coordonnes.getX()][coordonnes.getY()] = VALEUR_CASE_VIDE;
    }
    public void updatePosition(Coordonnes coordonnes){
        map[coordonnes.getX()][coordonnes.getY()] = VALEUR_PERSONNAGE;
    }
}
