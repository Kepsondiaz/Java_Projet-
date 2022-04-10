
public abstract class  Personne {
    
   protected int age;
   protected String prenom ;
   protected String nom;
   protected String adresse;
   protected static int nbPersonness; // variable pour récuperer le nombre de personne

    public Personne(String nom, String prenom, int age, String adresse) //on defini le constructeur
    {
        this.nom=nom;
        this.prenom=prenom;
        this.age=age;
        this.adresse=adresse;
        nbPersonness++;
    }
   
    public  String toString() //redefintion de la methode toString
    {
        return "la personne est: " + prenom +  " " + nom + ", il a: " + age + ", son adresse: " + adresse;
    }

    public  abstract void ecrirePersonne(); //on defini une methode abstraite qui permettra d'afficher les caracteeristiques et la categorie

    public static void nbrePersonnes() //on defini une methode qui permet d'afficher nbre total de personne, nbre d'enseignant, nbre d'etudiant, nbre secretaire
    {
       System.out.println("le nombre de personne totale = " + nbPersonness); 
       System.out.print("le nombre de Secretaire totale =  "); Secretaire.nbSecretaires();
       System.out.print("le nombre d'Enseignants totale = "); Enseignants.nbEnseignant();
       System.out.print("le nombre d'Etudiants totale = "); Etudiants.nbEtudiants();
    }

    public void mmodifierPersonnes(String newAdresse)//on defini une methode qui modifie l'adresse d'une personne;
    {
        this.adresse=newAdresse;
        ecrirePersonne();

    }
}