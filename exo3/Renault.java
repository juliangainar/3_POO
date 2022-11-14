package exo3;

public class Renault extends Voiture {
  // attributs
  private int anneeDeFabrication;
  private double reductionConstructeur;

  // constructeur
  public Renault(int vitesseMaximale, double prixBase, String couleur, int anneeDeFabrication, double reductionConstructeur){
    super(vitesseMaximale, prixBase, couleur);
    this.reductionConstructeur = reductionConstructeur;
    this.anneeDeFabrication = anneeDeFabrication;
  }
