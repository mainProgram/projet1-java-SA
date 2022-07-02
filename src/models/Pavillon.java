package models;


public class Pavillon 
{
    // -------------------------------------------------------------ATTRIBUTES
    private int id;
    private int nbEtages;
    private String numero;
    private static int idS = 0;
    // private static int tailleTabChambres = 0;
    // Chambre[] chambres = new Chambre[10]; 

   
    // -------------------------------------------------------------CONSTRUCTEURS
    public Pavillon(){
        this.id = ++idS;
    }
    public Pavillon(String numero, int nbEtages){
        this.numero = numero;
        this.nbEtages = nbEtages;
        this.id = ++idS;
    }


    // -------------------------------------------------------------METHODS
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getNbEtages() { return nbEtages; }
    public void setNbEtages(int nbEtages) { this.nbEtages = nbEtages; }

    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    // public Chambre[] getChambres() { return chambres; }
    // public void setChambres(Chambre[] chambres) { this.chambres = chambres; }

    // public static int getTailleTabChambres() { return tailleTabChambres; }
    // public static void setTailleTabChambres(int tailleTabChambres) { Pavillon.tailleTabChambres = tailleTabChambres; }

    public String toString(){ return id + "\t" + numero + "\t" + nbEtages; }

}
