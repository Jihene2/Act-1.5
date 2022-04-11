package Bibliothéque;

public class LivreRecette extends Livre {
int nbrerecette;
public LivreRecette(String titre, String auteur, double prix, int nbrePage,String genre,int nbrerecette) {
super(titre, auteur, prix, nbrePage,genre);
this.nbrerecette=nbrerecette;

}
public void Afficher() {
	super.Afficher();
	System.out.println("Nombre de recette :"+this.nbrerecette);
}
}