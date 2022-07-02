package models;

public class Chambre 
{
    // -------------------------------------------------------------ATTRIBUTES
    private int id;
    private int numeroEtage;
    private String numero;
    private String type;
    Etudiant[] etudiants = new Etudiant[10];
    public static int tailleTabEtu = 0;

   
    // -------------------------------------------------------------CONSTRUCTEURS
    public Chambre(){}
    public Chambre( String numero, int numeroEtage, String type)
    {
        this.numeroEtage = numeroEtage;
        this.numero = numero;
        this.type = type;
    }

    // -------------------------------------------------------------METHODS
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getNumeroEtage() { return numeroEtage; }
    public void setNumeroEtage(int numeroEtage) { this.numeroEtage = numeroEtage; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    public String toString(){
        return numero + "\t" + numeroEtage + "\t" + type;
    }

    public static int getTailleTabEtu() {
        return tailleTabEtu;
    }
    public static void setTailleTabEtu(int tailleTabEtu) {
        Chambre.tailleTabEtu = tailleTabEtu;
    }

    public Etudiant[] getEtudiants() {
        return etudiants;
    }
    public void setEtudiants(Etudiant[] etudiants) {
        this.etudiants = etudiants;
    }
}
