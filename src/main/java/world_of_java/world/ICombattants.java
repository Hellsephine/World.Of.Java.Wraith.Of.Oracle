package world_of_java.world;

import world_of_java.objets.Armes;
import world_of_java.objets.Bouclier;
import world_of_java.objets.Sac;

public interface ICombattants {

    public String getNom();
    public void setNom(String nom);
    public Integer getPointDeVieMax();
    public void setPointDeVieMax(Integer pointDeVieMax);
    public Integer getPointDeVie();
    public void setPointDeVie(Integer pointDeVie);
    public Integer getForce();
    public void setForce(Integer force);
    public Integer getEndurance();
    public void setEndurance(Integer endurance);
    public Armes getArmes();
    public void setArmes(Armes armes);
    public Bouclier getBouclier();
    public void setBouclier(Bouclier bouclier);
    public Sac getSac();
    public void attaquer(ICombattants adversaire);
    public  void defendre(int degat);
    public void manger();
    public void perdreEnduranceAttaque();
    public void perdreEnduranceDefence();


}
