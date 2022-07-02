package models;
import java.time.*;


public class Etudiant extends User {

    // -------------------------------------------------------------ATTRIBUTES
    protected String matricule;
    protected LocalDate datenaiss;
    
    // -------------------------------------------------------------CONSTRUCTEURS
    public Etudiant(){}

    public Etudiant(String nom, String prenom, String login, String telephone, String password, LocalDate datenaiss) {
        super(nom, prenom, login, password, telephone);
        this.matricule = "#" + id + nom;
        this.datenaiss = datenaiss;
    }

    public String isMatricule() { return matricule; }
    public void setMatricule(String matricule) {  this.matricule = matricule; }  
   
    public LocalDate isDatenaiss() { return datenaiss; }
    public void setDatenaiss(LocalDate datenaiss) { this.datenaiss = datenaiss; }

    // -------------------------------------------------------------METHODS
    public String toString(){
        return super.toString() +  matricule + "\t\t" + datenaiss +  "\t\t" + (etat ? "actif" : "non actif");
    }
}

