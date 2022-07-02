package services;
import java.util.Scanner;  // Import the Scanner class
import models.*;

public class ServiceTableau implements IService 
{
    private final int TAILLE_PAV = 10;
    private Pavillon[] pavillons = new Pavillon[TAILLE_PAV];
    private int indexPavillon; //  private int indexPavillon = 0;

    private final int TAILLE_CHAMBRE = 10;
    private Chambre[] chambres = new Chambre[TAILLE_CHAMBRE];
    private int indexChambre;

    public void menu() 
    {
        Pavillon pavillon = new Pavillon();
        System.out.println("\n############################ MENU #########################");
        System.out.println("################## 1- Ajout de pavillons ##################");
        System.out.println("################## 2- Liste des pavillons #################");
        System.out.println("################## 3- Ajout de chambres ###################");
        System.out.println("################## 4- Liste des chambres ##################");
        System.out.println("################## 5- Quitter le menu  ####################\n");

        Scanner scanner = new Scanner(System.in); 
        int choix = 0;
        while (choix != 1 && choix != 2 &&  choix != 3 &&  choix != 4 &&  choix != 5)
        {
            System.out.println("\nFaites votre choix :");
            choix = Integer.parseInt(scanner.nextLine());
        }

        if(choix == 1)
        {
            System.out.println("\nEntrer le numéro du pavillon :");
            String numero = scanner.nextLine();

            System.out.println("\nEntrer le nombre d'étages du pavillon :");

            int nbEtages = -1 ;
            while(nbEtages < 0)
                nbEtages = Integer.parseInt(scanner.nextLine());
            
            pavillon.setNumero(numero);
            pavillon.setNbEtages(nbEtages);
            this.addPavillon(pavillon);

            menu();
        }     
        else if(choix == 2)
        {
            this.listerPavillon();
            menu();
        }
        else if(choix == 3)
        {
            if (indexPavillon == 0)
                System.out.println("\nIl n'y a pas encore de pavillons !");
            else
            {
                this.listerPavillon();
                System.out.println("\nEntrer l'identifiant du pavillon :");
                int idPav = Integer.parseInt(scanner.nextLine());
                boolean found = false;
                for(int i=0; i < indexPavillon; i++)
                    if(pavillons[i].getId() == idPav)
                    {
                        pavillon = pavillons[i];
                        found = true;
                    }
    
                if(!found)
                    System.out.println("Le pavillon n'existe pas !");
                else
                {
    
                    System.out.println("\nEntrer le numéro l'étage de la chambre :");
                    int etage = 0;
                    while (!(etage > 0 && etage <= pavillon.getNbEtages()))
                    {
                        etage = Integer.parseInt(scanner.nextLine());
                        if(!(etage > 0 && etage <= pavillon.getNbEtages()))
                            System.out.println("\nNuméro d'étage invalide !");
                    }
    
                    Chambre chambre = new Chambre();
    
                    System.out.println("\nEntrer le type de la chambre :");
                    System.out.println("1- COLLECTIF");
                    System.out.println("2- INDIVIDUEL");
                    int choix2 = 0;
                    while (choix2 != 1 && choix2 != 2)
                    {
                        choix2 = Integer.parseInt(scanner.nextLine());
                        if(choix2 != 1 && choix2 != 2)
                            System.out.println("Choix invalide !");
                    }
                    if (choix2 == 1)  chambre.setType(TypeChambre.valueOf("COLLECTIF")) ; else chambre.setType(TypeChambre.valueOf("INDIVIDUEL")) ;
                    chambre.setNumeroEtage(etage);
                    chambre.setPav(pavillon);
                    this.addChambre(chambre);
                }
            }
            menu();

        }
        else if(choix == 4)
        {
            this.listerChambre();
            menu();
        }
        
        else if(choix == 5)
            System.out.println("\nBye !");
        
    }

    public void addPavillon(Pavillon pavillon) 
    {
        if(indexPavillon < TAILLE_PAV)
        {
            pavillons[indexPavillon] = pavillon;
            indexPavillon++;
            System.out.println("\nLe pavillon " + pavillon.getNumero() + " est ajouté !");
        }
        else
            System.out.println("\nLe tableau est plein !");
        
    }

    public void listerPavillon() 
    {
        if(indexPavillon == 0)
            System.out.println("\nIl n y a pas de pavillons !");
        else
        {
            System.out.println("\n------------------------------------------------------------");
            System.out.println("LISTE DES PAVILLONS");
            System.out.println("------------------------------------------------------------");
            System.out.println("#ID\tNuméro\tNombre d'étages");
            System.out.println("------------------------------------------------------------");

            for(int i=0; i < indexPavillon ; i++)
                System.out.println(pavillons[i]);   
        }
    }

    public void supprimerPavillon(Pavillon pavillon) {
        
    }

    public void listerChambreDunPavillon(Pavillon pavillon) {
        
    }

    public void addChambre(Chambre chambre) {
        if(indexChambre < TAILLE_CHAMBRE)
        {
            chambres[indexChambre] = chambre;
            indexChambre++;
            System.out.println("\nLe Chambre " + chambre.getNumero() + " est ajouté !");
        }
        else
            System.out.println("\nLe tableau est plein !");
    }

    public void listerChambre() {
        if(indexChambre == 0)
            System.out.println("\nIl n y a pas de chambres !");
        else
        {
            System.out.println("\n------------------------------------------------------------");
            System.out.println("LISTE DES CHAMBRES");
            System.out.println("------------------------------------------------------------");
            System.out.println("#ID\tNuméro\tNuméro étage\tType\tPavillon");
            System.out.println("------------------------------------------------------------");

            for(int i=0; i < indexChambre ; i++)
                System.out.println(chambres[i]);   
        }
    }

    public void archiverChambre(Chambre chambre) {
        
    }

    public void addEtudiant(Etudiant etudiant) {
        
    }

    public void listerEtudiantChambre(Chambre chambre) {
        
    }

    public void affecterChambrePavillon(Chambre chambre, Pavillon pavillon) {
        
    }

    public void affecterChambreBoursierLoge(Chambre chambre, BoursierLoge boursierLoge) {
        
    }    

    
    // public void listEtudiants(Responsable responsable)
    // {
    //     Etudiant[] tab = responsable.getEtudiants();

    //     System.out.println("-------------------------------------------------------------------------------------------");
    //     System.out.println("Liste des étudiants");
    //     System.out.println("-------------------------------------------------------------------------------------------");
    //     System.out.println("Id\tNom\tPrenom\t\tLogin\t\t\tMatricule\tDate de naissance\tEtat");

    //     for(int i=0; i < Responsable.getTailleTabEtu() ; i++)
    //         System.out.println(tab[i]);   
    // }

    // public Etudiant[] addEtudiants(Etudiant etudiant, Responsable responsable)
    // {
    //     int taille = Responsable.getTailleTabEtu();
    //     responsable.getEtudiants()[taille] = etudiant;
    //     Responsable.setTailleTabEtu(++taille);
    //     return responsable.getEtudiants();
    // }

    // public void listPavillons(Responsable responsable)
    // {
    //     Pavillon[] tab = responsable.getPavillons();

    //     System.out.println("\n-------------------------------------------------------------------------------------------");
    //     System.out.println("Liste des pavillons");
    //     System.out.println("-------------------------------------------------------------------------------------------");
    //     System.out.println("Numéro\tNombre d'étages");

    //     for(int i=0; i < Responsable.getTailleTabPav() ; i++)
    //         System.out.println(tab[i]);   
    // }

    // public Pavillon[] addPavillons(Pavillon pavillon, Responsable responsable)
    // {
    //     int taille = Responsable.getTailleTabPav();
    //     responsable.getPavillons()[taille] = pavillon;
    //     Responsable.setTailleTabPav(++taille);
    //     return responsable.getPavillons();
    // } 
    
    // public Chambre[] affecterChambrePavillon(Pavillon pavillon, Chambre chambre)
    // {
    //     int taille = Pavillon.getTailleTabChambres();
    //     pavillon.getChambres()[taille] = chambre;
    //     Pavillon.setTailleTabChambres(++taille);
    //     return pavillon.getChambres();
    // }

    // public void listChambres(Pavillon pavillon){
    //     Chambre[] tab = pavillon.getChambres();

    //     if(tab.length == 0)
    //         System.out.println("Pas de chambre !");
    //     else
    //     {
    //         System.out.println("\nListe des chambres du pavillon N°" + pavillon.getNumero());
    //         System.out.println("Numéro\tEtage\tType");
    
    //         for(int i=0; i < Pavillon.getTailleTabChambres() ; i++)
    //             System.out.println(tab[i]); 
    //         System.out.println(); 
    //     }

    // }

    // public Etudiant[] affecterChambreEtudiant(Chambre chambre, Etudiant etudiant)
    // {
    //     int taille = Chambre.getTailleTabEtu();
    //     chambre.getEtudiants()[taille] = etudiant;
    //     Chambre.setTailleTabEtu(++taille);
    //     return chambre.getEtudiants();
    // }

    // public void listEtudiantsChambre(Chambre chambre){
    //     Etudiant[] tab = chambre.getEtudiants();

    //     if(tab.length == 0)
    //         System.out.println("Pas d'étudiants !");
    //     else
    //     {
    //         System.out.println("\nListe des étudiants de la chambre N°" + chambre.getNumero());
    //         System.out.println("Id\tNom\tPrenom\t\tLogin\t\t\tMatricule\tDate de naissance\tEtat");

    //         for(int i=0; i < Chambre.getTailleTabEtu() ; i++)
    //             System.out.println(tab[i]); 
    //         System.out.println(); 
    //     }
    // }

}
