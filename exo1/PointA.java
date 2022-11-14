package exo1;

public class PointA extends Point {
  public PointA(int x, int y) {
    super(x, y); // appel au constructeur parent
  }

  public void afficher() {
    System.out.println("Les coordonnées sont : (" + getX() + " ; " + getY() + ")");
  } // pas besoin d'utiliser super.getX ou this.getX
  
  // si on n'avait pas les get(), on ne pourrait pas afficher les points
}