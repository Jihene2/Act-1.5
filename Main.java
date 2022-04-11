package Bibliothéque;

public class Main {

public static void main(String[] args) {
Livre l1=new Livre("Le petit prince", "St Exupéry",10.40, 0,"Enfants");
Livre l2=new Livre("Contes","Grimm",14.40,254,"enfant");
l1.Afficher();
l2.Afficher();

BD bd1= new BD("Lucky Luke","Morris",10.40, 45, "Comic", false);
BD bd2= new BD("Tintin","Herge",200.40, 45,"Comic", true);
bd1.Afficher();
bd1.Afficher();

Manga m1=new Manga("One piece", "Eiichirō Oda", 5.40, 6, "comic", false);
Manga m2=new Manga("Death Note","Tsugumi Ōba",7.40, 75, null, false);
m1.Afficher();
m2.Afficher();

Roman r1 = new Roman("Dora","Dora", 300.0, 3,null) ;
        r1.Afficher();
        r1.setNbreChapitre(12);
        r1.setDescription("Une description quelconque");
        
LivreRecette lr1=new LivreRecette("les pâtes", "tara", 0, 0, "Cuisine", 0);    
lr1.Afficher();
Recette rc1 = new Recette("Les pâtes crues", "Comment réaliser de délicieuses pâtes crues.", 3);
rc1.addAstuce("Ne pas les faire cuire.");
rc1.addEtape("Sortir les pâtes de leur emballage");

}

}


