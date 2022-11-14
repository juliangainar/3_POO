package exo4_1;

public classe Batiment{
  // attributs
  private String adresse;
  private double surfaceHabitable;

  // constructeurs
  public Batiment(String adresse, double surfaceHabitable){
    this.adresse = adresse;
    this.surfaceHabitable = surfaceHabitable;
  }  

  // accesseurs

  
  // methodes
  public String toString(){
    return "Le batiment à l'adresse : " + this.adresse + "a une surface habitable de : " + surfaceHabitable + "m carrés.";
  }
}