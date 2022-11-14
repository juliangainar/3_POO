package exo4_1;

public class Maison extends Batiment {
  // attributs
  private int nbPieces;
  private double surfaceJardin;

  // constructeurs
  public Maison(String adresse, int surfaceH, int surfaceJ, int nbPieces) {
    super(adresse, surfaceH);
    this.surfaceJardin = surfaceJ;
    this.nbPieces = nbPieces;
  }
  // accesseurs

  // methodes
  @Override
  public String toString() {
    return "Le batiment à l'adresse : " + this.adresse + "a une surface habitable de : " + surfaceHabitable
        + "m carrés."; // faire les getters ? ou utiliser le toString()
  }
}