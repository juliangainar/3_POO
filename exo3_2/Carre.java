package exo3_2;

public class Carre extends Forme{
  private double cote;

  // constructeur
  public Carre(double cote){
    this.cote = cote;
  }
  
  // methodes
  @Override
  public double getSurface(){
    return cote*cote;
  }
}