
class Etudiants extends Personne {

    private int noteMoyenne;
    private String diplomeEnCours;
    private static int nbEtudiants;

    public Etudiants(String nom, String prenom, int age, String adresse, int noteMoyenne, String diplomeEnCours)
    {
        super(nom, prenom, age, adresse);
        this.noteMoyenne=noteMoyenne;
        this.diplomeEnCours=diplomeEnCours;
        nbEtudiants++;
    }

    //getteurs 
    public int getAgeEtudiants()           {return this.age;}
    public String getPrenomEtudiants()     {return this.prenom;}
    public String getNomEtudiants()        {return this.nom; }
    public String getAdresseEtudiants()    {return this.adresse;}
    public int getNoteMoyenne()            {return this.noteMoyenne;}
    public String getDiplomeEnCours()      {return this.diplomeEnCours;}

    //setteurs
    public void setAgeEtudiants(int ageEtudiants)                   {this.age=ageEtudiants;}
    public void setPrenomEtudiants(String prenomEtudiants)          {this.prenom=prenomEtudiants;}
    public void setNomEtudiants(String nomEtudiants)                {this.nom=nomEtudiants;}
    public void setAdresseEtudiants(String adresseEnseignants)      {this.adresse=adresseEnseignants;}
    public void setNoteMoyenne(int noteMoyenne)                     {this.noteMoyenne=noteMoyenne;}
    public void setDiplomeEnCours(String dilpomeEnCours)            {this.diplomeEnCours=dilpomeEnCours;}

    //redefinir la methode toString
    public String toString()
    {
        return super.toString() + " Moyenne = " + noteMoyenne + " dilpome en cours de preparation : " + diplomeEnCours + "sa catégorie est: Etudiant";
    }

    // rerdefinition de la methode ecrirePersonne
    public void ecrirePersonne()
    {
        System.out.println("Etudiant " + toString());
    }

    // calcul du nombre d''etudiant
    public static void nbEtudiants()
    {
        System.out.println(nbEtudiants);
    }

}
