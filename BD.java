package Bibliothéque;

public class BD extends Livre {

boolean couleur;



public BD(String titre, String auteur, double prix, int nbrePage, String genre, boolean couleur) {
	super(titre, auteur, prix, nbrePage, genre);
	
}
public void BD() {
	this.couleur = true;

}
public void Afficher() {
	super.Afficher();
	
	if (couleur==true) {
		System.out.println("Couleur :couleur");
	}
		else {System.out.println("Couleur:N&B");
		
	
}
}
}

