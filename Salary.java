/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gest_salary;

import classe.*;

/**
 *
 * @author Meister
 */
public class Salary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Personnel  p = new Personnel();
        
        p.AjouterEmploye(new Vendeur((double) 1200000,"16A004FS","DJEKADOM","DEOUTOL",(short)20,"10-02-1998"));
        p.AjouterEmploye(new Representant((double) 1200000,"17A115FS","REMADJI","STEPHANE",(short)20,"19-02-1989"));
        p.AjouterEmploye(new Production("14B785FS","Kaîdjo","Stephane",(short)20,"29-05-1997",2500));
        p.AjouterEmploye(new ProductionRisque("14I0A6IU","Bidon","Jean",(short)20,"05-03-2000",4500));
        p.AjouterEmploye(new Manutention("16B017FS","Bishop","Claude",(short)20,"02-10-1992",500));
        p.AjouterEmploye(new ManutionRisque("16A880FS","Mamoudou","Awal",(short)20,"15-11-1993",600));
        
        p.calculerSalaire();
        System.out.println("\nLe salaire moyen des "+p.salaireMoyen());
    }
    
}
