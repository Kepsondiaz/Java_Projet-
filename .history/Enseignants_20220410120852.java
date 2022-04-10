class Enseignants extends Personne
{
    private int nbreHeureCours;
    private boolean grincheux;
    private String specialite;
    private static int  nbEnseignants;

    public Enseignants (String nom, String prenom, int age, String adresse, int nbreHeureCours, boolean grincheux, String specialite) //on defini le constructeur de Enseignant
    {
        super(nom, prenom, age, adresse);
        this.nbreHeureCours = nbreHeureCours;
        this.grincheux=grincheux;
        this.specialite=specialite;
        nbEnseignants++;

    }

     //getteurs
    public int getAgeEnseignant()           {return this.age;}
    public String getPrenomEnseignant()     {return this.prenom;}
    public String getNomEnseignants()       {return this.nom; }
    public String getAdresseEnseignants()   {return this.adresse;}
    public int getNbreHeureCours()          {return this.nbreHeureCours;}
    public boolean getGrincheux()           {return this.grincheux;}
    public String getSpecialite()           {return this.specialite;}
    
    //setteurs
    public void setAgeEnseignants(int ageEnseignants)               {this.age=ageEnseignants;}
    public void setPrenomEnseignants(String prenomEnsignant)        {this.prenom=prenomEnsignant;}
    public void setNomEnseignants(String nomEnseignants)            {this.nom=nomEnseignants;}
    public void setAdresseEnseignants(String adresseEnseignants)    {this.adresse=adresseEnseignants;}
    public void setNbreHeureCours(int nbreHeureCours)               {this.nbreHeureCours=nbreHeureCours;}
    public void setGrincheux(boolean grincheux)                     {this.grincheux=grincheux;}
    public void setSpecialite(String specialite)                    {this.specialite=specialite;}

    public String toString()
    {
        return super.toString() + " nombre d'heure cours enseigner = " + nbreHeureCours + " , " + " grincheux : " + grincheux + " , " + " Specialite : " + specialite + "sa catégorie est: Enseignant";
    }

    public void ecrirePersonne()
    {
        System.out.println("Enseignant: " + toString());
    }

    public static void nbEnseignant()
    {
        System.out.println(nbEnseignants);
    }
}
