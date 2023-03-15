package world.of.java.objets;

public class Nourriture implements Items {

    private String nom;
    private Integer poids;
    private Integer endurance;

    public String getNom() {
        return nom;
    }
    public Integer getPoids() {
        return poids;
    }
    public Integer getEndurance() {
        return endurance;
    }

    public Nourriture(String nom, Integer poids, Integer endurance) {
        this.nom = nom;
        this.poids = poids;
        this.endurance = endurance;
    }
}
