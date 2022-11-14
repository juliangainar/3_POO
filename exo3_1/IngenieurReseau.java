package exo3_1;

public class IngenieurReseau extends Personne{
  // constructeur
  public IngenieurReseau(String nom){
    super(nom);
  }

  // methodes
  @Override
  public void afficher(){
    System.out.println("L'ingenieur reseau se nomme :" + this.getNom());
  }
}