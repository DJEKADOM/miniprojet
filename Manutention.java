/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classe;

/**
 *
 * @author Meister
 */
public class Manutention extends Employe{

    protected double nbreHeure;
    
    public Manutention(String matricule, String nom, String prenom, short age, String date_entrer,double hours) {
        super(matricule, nom, prenom, age, date_entrer);
        nbreHeure = hours;
    }

    @Override
    double calculerSalaire() {
        return nbreHeure * 65;
    }

    public void setNbreHeure(double nbreHeure) {
        this.nbreHeure = nbreHeure;
    }
    
}
