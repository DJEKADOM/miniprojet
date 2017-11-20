/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classe;

import java.util.Date;

/**
 *
 * @author Meister
 */
public abstract class Employe {
    
    protected String matricule;
    protected String nom;
    protected String prenom;
    protected short age;
    protected String date_entrer;

    public Employe(String matricule, String nom, String prenom, short age, String date_entrer) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.date_entrer = date_entrer;
    }
    
    abstract double calculerSalaire();

    public String getNom() {
        return "L 'Employé " + nom + " " + prenom;
    }
  
}
