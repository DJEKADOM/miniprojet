/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classe;

import Interface.Risque;

/**
 *
 * @author Derrick Methode
 */
public class ManutionRisque extends Manutention implements Risque {
    
    public ManutionRisque(String matricule, String nom, String prenom, short age, String date_entrer,double hours) {
        super(matricule, nom, prenom, age, date_entrer,hours);
    }

    @Override
    double calculerSalaire() {
        return super.calculerSalaire() + prime;
    }
    
}
