package exo3;

public class Camion extends Voiture {

  // attributs
  private int poids;

  // constructeur
  public Camion(int vitesseMaximale, double prixBase, String couleur, int poids) {
    super(vitesseMaximale, prixBase, couleur);
    this.poids = poids;
  }

  @Override
  public double calculerPrixDeVente() {
    double prixBase = super.calculerPrixDeVente();
    double prixVente = ((poids > 2000) ? 0.9 : 0.8) * prixBase;
    return prixVente;
  }
}