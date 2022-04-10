import java.util.ArrayList;
import java.util.*;
public class GestionScolaire {
    public static void main(String[] args) {
        Personne tableauPersonne [] = new Personne[100]; // declare un tableau de 100 elments

        Secretaire secretaire = new Secretaire("Amadou", "Diallo", 22, "Pikine", 1);
        Enseignants enseignant = new Enseignants("Awa", "Diaby", 18, "Dakar", 12, true, "informatique");
        Enseignants enseignant1 = new Enseignants("Moussa", "Fall", 23, "Dakar", 40, false, "java");
        Etudiants etudiant = new Etudiants("Ngome", "Nafi", 18, "Pikine", 13, "DST");
        Etudiants etudiant1 = new Etudiants("Diop", "Mouhamed", 20, "Parcelles", 15, "DUT");
        Etudiants etudiant2 = new Etudiants("Diatta", "Lamine", 23, "Gambi", 17, "DIC");
        Secretaire secretaire1 = new Secretaire("Diop", "Mouhamed", 22, "Pikine", 1);
        Etudiants etudiant3 = new Etudiants("Gueye", "Fama", 23, "Senegal", 17, "DIC3");
        Enseignants enseignant2 = new Enseignants("Loum", "Moustapha", 23, "Dakar", 40, false, "php");
       
        //on initialise le tableau de personne
        int index=0;
        tableauPersonne[index] = secretaire;
        index++;
        tableauPersonne[index] = enseignant;
        index++;
        tableauPersonne[index] = enseignant1;
        index++;
        tableauPersonne[index] = etudiant;
        index++;
        tableauPersonne[index] = etudiant1;
        index++;
        tableauPersonne[index] = etudiant2;
        index++;
        tableauPersonne[index] = secretaire1;
        index++;
        tableauPersonne[index] = etudiant3;
        index++;
        tableauPersonne[index] = enseignant2;
        index++;

        int i=0;
        while(i <index) //on parcour la boucle
        {
            System.out.println(tableauPersonne[i]);
            System.out.println();
            i++;
        }

        System.out.println();
        Personne.nbrePersonnes();
        System.out.println();

        //on creer une liste et on y ajoute des objets
        ArrayList<Personne> arrayList = new ArrayList<Personne>();
        arrayList.add(secretaire);
        arrayList.add(secretaire1);
        arrayList.add(enseignant);
        arrayList.add(enseignant1);
        arrayList.add(etudiant);
        arrayList.add(etudiant1);
        arrayList.add(etudiant2);
        arrayList.add(etudiant3);

        //System.out.println(arrayList);
        Collections.sort(arrayList, Collections.reverseOrder());
        System.out.println();
        System.out.println(arrayList);
    }
}
