package models;

public class Chambre 
{
    // -------------------------------------------------------------ATTRIBUTES
    private int id;
    private static int idS;
    private int numeroEtage;
    private String numero;
    private Pavillon pav;
    private TypeChambre type;   
    
    // -------------------------------------------------------------CONSTRUCTEURS
    public Chambre(){
        this.id = ++idS;
        this.numero = "CH" + String.format("%04d", id);
    }
    public Chambre( String numero, int numeroEtage, String type)
    {
        this.numeroEtage = numeroEtage;
        this.numero = numero;
    }

    // -------------------------------------------------------------METHODS
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getNumeroEtage() { return numeroEtage; }
    public void setNumeroEtage(int numeroEtage) { this.numeroEtage = numeroEtage; }
    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }
    public Pavillon getPav() { return pav; }
    public void setPav(Pavillon pav) { this.pav = pav; }
    public TypeChambre getType() { return type; }
    public void setType(TypeChambre type) { this.type = type; }

    public String toString(){
        return id + "\t" + numero + "\t" + numeroEtage + "\t" +  type + "\t" + pav.getNumero() ;
    }
}
