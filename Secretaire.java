
class Secretaire extends Personne {

    private int numeroBureau;
    private static int nbSecretaires;

    //constructeur
   public Secretaire(String nom, String prenom, int age, String adresse, int numeroBureau)
   {
       super(nom, prenom, age, adresse);
       this.numeroBureau = numeroBureau;
       nbSecretaires++;
   }

   //getteur
   public int getAgeSecretaire()           {return this.age;}
   public String getPrenomSecretaire()     {return this.prenom;}
   public String getNomSecretaire()        {return this.nom; }
   public String getAdresseSecretaire()    {return this.adresse;}
   public int    getNumeroBureau()         {return  this.numeroBureau;}

   //setteurs
   public void setAgeSecretaires(int ageSecretaires)               {this.age=ageSecretaires;}
   public void setPrenomSecretaires(String prenomSecretaires)      {this.prenom=prenomSecretaires;}
   public void setNomSecretaires(String nomSecretaires)            {this.nom=nomSecretaires;}
   public void setAdresseSecretaires(String adresseSecretaires)    {this.adresse=adresseSecretaires;}

   //toString
   public String toString()
   {
       return super.toString() + " numero bureau: " + numeroBureau + "sa catégorie est: Secretaire";
   }

   public void ecrirePersonne()
   {
       System.out.println("Secretaire: " + toString());
   }

   public static void nbSecretaires()
   {
        System.out.println(nbSecretaires);
   }
   
}
