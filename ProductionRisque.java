/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classe;

import Interface.Risque;
import static Interface.Risque.prime;

/**
 *
 * @author Derrick Methode
 */
public class ProductionRisque extends Production implements Risque {
    
    public ProductionRisque(String matricule, String nom, String prenom, short age, String date_entrer,int uniteProduite) {
        super(matricule, nom, prenom, age, date_entrer,uniteProduite);
    }

    @Override
    double calculerSalaire() {
        return super.calculerSalaire() + prime;
    }
}
