package world_of_java.factory;

import world_of_java.objets.Armes;

import java.util.Random;

public class ArmeFactory {
    public static Armes build(){
        boolean rand = new Random().nextBoolean();
        Armes armes;
        if (rand){
            armes = new Armes("Sword", 15, 50, 400);
        }
        else {
            armes = new Armes("Gourdin", 10, 30, 200);
        }
        return armes;
    }
}
