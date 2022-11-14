package exo3_1;

public class Personne{
  // attributs
  private String nom;

  // constructeurs
  public Personne(String nom){
    this.nom = nom;
  }
  
  // methodes
  public void afficher(){
    System.out.println("Mon nom est : " + this.nom);
  }
  
}