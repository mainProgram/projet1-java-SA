package models;

public class User {
    // -------------------------------------------------------------ATTRIBUTES
    protected int id;
    protected String nom;
    protected String prenom;
    protected String login;
    protected String password;
    protected String telephone;
    protected boolean etat;
    public static int idS = 0;
    
    // -------------------------------------------------------------CONSTRUCTEURS

    public User() {}

    public User(String nom, String prenom, String login, String password, String telephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.login = login;
        this.password = password;
        this.telephone = telephone;
        this.etat = true;
        this.id = ++idS;
    }

    // -------------------------------------------------------------METHODS
    public int getId() { return id; }
    public void setId(int id) { this.id = id;}
    public String getNom() {return nom;}
    public void setNom(String nom) { this.nom = nom;}
    public String getPrenom() { return prenom; }
    public void setPrenom(String prenom) { this.prenom = prenom; }
    public String getLogin() {return login;}
    public void setLogin(String login) {this.login = login;}
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public String getTelephone() { return telephone; }
    public void setTelephone(String telephone) { this.telephone = telephone; }
    public boolean isEtat() { return etat; }
    public void setEtat(boolean etat) { this.etat = etat; }
    public String toString(){ return id + "\t" + nom +  "\t" + prenom  + "\t\t" + login + "\t"; }
   
}
