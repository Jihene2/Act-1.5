package Bibliothéque;

public class Livre {
	 
String titre;
String auteur;
double prix;
int NbrePage;
String genre;

public Livre(String titre, String auteur, double prix, int nbrePage,String genre) {



this.titre = titre;
this.auteur = auteur;
this.prix = prix;
this.NbrePage = nbrePage;
this.genre=genre;

}

public void Afficher() {
    System.out.println("Titre: " + this.titre);
    System.out.println("Auteur: " + this.auteur);
    System.out.println("Prix: " + this.prix + " TND");
    System.out.println("Nombre de pages: " + this.NbrePage);
    System.out.println("genre: " + this.genre);
    
    

}
}


