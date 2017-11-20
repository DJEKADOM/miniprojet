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
abstract class Commercial extends Employe{
    
    protected double chiffreAffaire;

    public Commercial(double chiffreAffaire, String matricule, String nom, String prenom, short age, String date_entrer) {
        super(matricule, nom, prenom, age, date_entrer);
        this.chiffreAffaire = chiffreAffaire;
    }

    public double getChiffreAffaire() {
        return chiffreAffaire;
    }
    
}
