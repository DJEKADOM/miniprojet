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
public class Production extends Employe{
    protected int unite_produite;

    public Production(String m, String nom, String prenom, short age, String date_entrer,int unite_produite) {
        super(m, nom, prenom, age, date_entrer);
        this.unite_produite = unite_produite;
    }

    @Override
    double calculerSalaire() {
     return (double) unite_produite * 5;   
    }
}
