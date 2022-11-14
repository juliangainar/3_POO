package exo3_2;

public class Cercle extends Forme{
  private double rayon;

  // constructeur
  public Cercle(double rayon){
    this.cote = cote;
  }
  
  // methodes
  @Override
  public double getSurface(){
    return rayon * rayon * Math.pi;
  }
}