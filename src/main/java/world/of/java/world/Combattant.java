package world.of.java.world;

import world.of.java.map.Coordonnes;
import world.of.java.objets.Nourriture;
import world.of.java.objets.Sac;

public abstract class Combattant implements ICombattants {

    private String nom;
    private Integer pointDeVieMax;
    private Integer pointDeVie;
    private Integer force;
    private Integer endurance;
    final Sac sac;
    private Coordonnes coordonnes;

    public Combattant(String nom, Integer pointDeVieMax, Integer force, Integer endurance, Integer pointDeVie, Coordonnes coordonnes ){
        this.nom = nom;
        this.pointDeVieMax = pointDeVieMax;
        this.pointDeVie = pointDeVie;
        this.force = force;
        this.endurance = endurance;
        sac = new Sac();
        this.coordonnes = coordonnes;
    }
    public String toString(){
        return "nom: "+this.nom+", point de vie: "+this.pointDeVieMax+", endurance: "+this.endurance;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getPointDeVieMax(){
        return pointDeVieMax;
    };
    public void setPointDeVieMax(Integer pointDeVieMax){
        this.pointDeVieMax = pointDeVieMax;
    }

    public Integer getPointDeVie() {
        return pointDeVie;
    }

    public void setPointDeVie(Integer pointDeVie) {
        this.pointDeVie = pointDeVie;
    }

    public Integer getForce() {
        return force;
    }

    public void setForce(Integer force) {
        this.force = force;
    }

    public Integer getEndurance() {
        return endurance;
    }

    public void setEndurance(Integer endurance) {
        this.endurance = endurance;
    }

    public Sac getSac() {
        return sac;
    }

    public Coordonnes getCoordonnes(){
        return coordonnes;
    }

    public void setCoordonnes(Coordonnes coordonnes){
        this.coordonnes = coordonnes;
    }


    /**
     * Permet de recupere les degat de l'attaque de l'arme
     */
    @Override
    public void attaquer(ICombattants adversaire) {
        adversaire.setPointDeVie(this.getPointDeVie() - (this.getArmes().getDegat() - this.getBouclier().getDefence()))
    }

    /**
     * Vérifie qu'une objet Nourriture existe dans le sac
     * Fait remonter l'endurance
     * Le supprime du sac
     */
    @Override
    public void manger(){
        for (int i = 0; i < sac.size();i++){
            if (sac.getItems(i) instanceof Nourriture){
                this.setEndurance(this.getEndurance() + ((Nourriture)sac.getItems(i)).getEndurance());
                sac.removeItems(i);
            }
        }
    }

    /**
     * Fait perdre de l'endurance au combattant qui lance l'attaque
     */
    public void perdreEnduranceAttaque(){
        setEndurance(getEndurance() - ((getArmes().getLongueur()*getArmes().getPoids())/(1000*getForce())));
    }

    /**
     * Fait perdre de l'endurance au combattant qui subit l'attaque
     */
    public void perdreEnduranceDefence(){
        setEndurance(getEndurance() - (getArmes().getPoids()/(100*getForce())));
    }


}
