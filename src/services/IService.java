package services;

import models.*;

public interface IService {

    public Etudiant[] addEtudiants(Etudiant etudiant, Responsable responsable);
    public void listEtudiants(Responsable responsable);

    public Pavillon[] addPavillons(Pavillon pavillon, Responsable responsable);
    public void listPavillons(Responsable responsable);

    public Chambre[] affecterChambrePavillon(Pavillon pavillon, Chambre chambre);
    public void listChambres(Pavillon pavillon);


    public Etudiant[] affecterChambreEtudiant(Chambre chambre, Etudiant etudiant);
    public void listEtudiantsChambre(Chambre chambre);


}
