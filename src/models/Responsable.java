package models;

public class Responsable extends User 
{
    // -------------------------------------------------------------ATTRIBUTES
    Etudiant[] etudiants = new Etudiant[10]; 
    Pavillon[] pavillons = new Pavillon[10]; 
    public static int tailleTabEtu = 0;
    public static int tailleTabPav = 0;

    // -------------------------------------------------------------CONSTRUCTEURS
    public Responsable(){}
    public Responsable(String nom, String prenom, String login, String password, String telephone) {
        super(nom, prenom, login, password, telephone);
    }

    // -------------------------------------------------------------METHODS
    public Pavillon[] getPavillons() { return pavillons; }
    public void setPavillons(Pavillon[] pavillons) {  this.pavillons = pavillons; }

    public static int getTailleTabPav() { return tailleTabPav; }
    public static void setTailleTabPav(int tailleTabPav) { Responsable.tailleTabPav = tailleTabPav; }

    public static int getTailleTabEtu() { return tailleTabEtu; }
    public static void setTailleTabEtu(int tailleTabEtu) { Responsable.tailleTabEtu = tailleTabEtu; }

    public Etudiant[] getEtudiants() { return etudiants; }
    public void setEtudiants(Etudiant[] etudiants) { this.etudiants = etudiants; }


    // public Etudiant[] addEtudiants(Etudiant etudiant){
    //     this.etudiants[tailleTab] = etudiant;
    //     tailleTab++;
    //     return this.etudiants;
    // }
    
    // public void listEtudiants(){
    //     for(int i=0; i < tailleTab; i++){
    //         System.out.println(this.etudiants[i]);
    //     }
    // }

}
