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
public class Representant extends Commercial{
    private double taux_gain = 0.2;
    private int prime = 200;

    public Representant(double chiffreAffaire, String matricule, String nom, String prenom, short age, String date_entrer) {
        super(chiffreAffaire, matricule, nom, prenom, age, date_entrer);
    }

    @Override
    double calculerSalaire() {
        return getChiffreAffaire() * taux_gain + prime;
    }
}
