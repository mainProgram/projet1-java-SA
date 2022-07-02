package services;

import models.*;

public class Service implements IService 
{    
    public void listEtudiants(Responsable responsable)
    {
        Etudiant[] tab = responsable.getEtudiants();

        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Liste des étudiants");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Id\tNom\tPrenom\t\tLogin\t\t\tMatricule\tDate de naissance\tEtat");

        for(int i=0; i < Responsable.getTailleTabEtu() ; i++)
            System.out.println(tab[i]);   
    }

    public Etudiant[] addEtudiants(Etudiant etudiant, Responsable responsable)
    {
        int taille = Responsable.getTailleTabEtu();
        responsable.getEtudiants()[taille] = etudiant;
        Responsable.setTailleTabEtu(++taille);
        return responsable.getEtudiants();
    }

    public void listPavillons(Responsable responsable)
    {
        Pavillon[] tab = responsable.getPavillons();

        System.out.println("\n-------------------------------------------------------------------------------------------");
        System.out.println("Liste des pavillons");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Numéro\tNombre d'étages");

        for(int i=0; i < Responsable.getTailleTabPav() ; i++)
            System.out.println(tab[i]);   
    }

    public Pavillon[] addPavillons(Pavillon pavillon, Responsable responsable)
    {
        int taille = Responsable.getTailleTabPav();
        responsable.getPavillons()[taille] = pavillon;
        Responsable.setTailleTabPav(++taille);
        return responsable.getPavillons();
    } 
    
    public Chambre[] affecterChambrePavillon(Pavillon pavillon, Chambre chambre)
    {
        int taille = Pavillon.getTailleTabChambres();
        pavillon.getChambres()[taille] = chambre;
        Pavillon.setTailleTabChambres(++taille);
        return pavillon.getChambres();
    }

    public void listChambres(Pavillon pavillon){
        Chambre[] tab = pavillon.getChambres();

        if(tab.length == 0)
            System.out.println("Pas de chambre !");
        else
        {
            System.out.println("\nListe des chambres du pavillon N°" + pavillon.getNumero());
            System.out.println("Numéro\tEtage\tType");
    
            for(int i=0; i < Pavillon.getTailleTabChambres() ; i++)
                System.out.println(tab[i]); 
            System.out.println(); 
        }

    }

    public Etudiant[] affecterChambreEtudiant(Chambre chambre, Etudiant etudiant)
    {
        int taille = Chambre.getTailleTabEtu();
        chambre.getEtudiants()[taille] = etudiant;
        Chambre.setTailleTabEtu(++taille);
        return chambre.getEtudiants();
    }

    public void listEtudiantsChambre(Chambre chambre){
        Etudiant[] tab = chambre.getEtudiants();

        if(tab.length == 0)
            System.out.println("Pas d'étudiants !");
        else
        {
            System.out.println("\nListe des étudiants de la chambre N°" + chambre.getNumero());
            System.out.println("Id\tNom\tPrenom\t\tLogin\t\t\tMatricule\tDate de naissance\tEtat");

            for(int i=0; i < Chambre.getTailleTabEtu() ; i++)
                System.out.println(tab[i]); 
            System.out.println(); 
        }
    }

}
