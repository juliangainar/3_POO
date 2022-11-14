package exo3_1;

public class IngenieurLogiciel extends Personne{
  // constructeur
  public IngenieurLogiciel(String nom){
    super(nom);
  }

  // methodes
  @Override
  public void afficher(){
    System.out.println("L'ingenieur logiciel se nomme :" + this.getNom());
  }
}