package exo3;

public class Limousine extends Voiture {
  // attributs
  private int longueur;

  // constructeur
  public Limousine(int vitesseMaximale, double prixBase, String couleur, int longueur) {
    super(vitesseMaximale, prixBase, couleur);
    this.longueur = longueur;
  }

  // methodes
  @Override
  public double calculerPrixDeVente(){
    return ((longueur > 6) ? 0.95 : 0.9) * super.calculerPrixDeVente();
  }
}