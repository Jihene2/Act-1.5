package Bibliothéque;

public class Roman extends Livre {
int NbreChapitre;
String Description;
public Roman(String titre, String auteur, double prix, int nbrePage,String genre) {
super(titre, auteur, prix, nbrePage,genre);

}
public int getNbreChapitre() {
return NbreChapitre;
}
public void setNbreChapitre(int nbreChapitre) {
NbreChapitre = nbreChapitre;
System.out.println("Nombre de chapitre:"+this.NbreChapitre);

}

public String getDescription() {
	return Description;
}
public void setDescription(String description) {
Description = description;
System.out.println("Description :"+this.Description);

}
}


