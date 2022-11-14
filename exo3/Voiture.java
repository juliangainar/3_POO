package exo3;

public class Voiture {
  private int vitesseMaximale;
  private double prixBase;
  private String couleur;

  // constructeur
  public Voiture(int vitesseMaximale, double prixBase, String couleur) {
    this.vitesseMaximale = vitesseMaximale;
    this.prixBase = prixBase;
    this.couleur = couleur;
  }

  // methodes
  public double calculerPrixDeVente() {
    return prixBase;
  }
}