/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classe;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Meister
 */
public class Personnel {
    List<Employe> employe;

    public Personnel() {
        employe = new LinkedList();
    }
    
    public void AjouterEmploye(Employe E){
        if(!employe.contains(E)){
            this.employe.add(E);
        }else{
            System.out.println("Cet employé existe déjà");
        }
    }
    
    public double salaireMoyen(){
        double result = 0;
        
        for(int i=0;i<employe.size();i++){
            result+=employe.get(i).calculerSalaire();
        }
        
        return result/employe.size();
    }
    
    public void calculerSalaire(){
        int taille = employe.size()-1;
        while(taille>=0){
            System.out.println(employe.get(taille).getNom()+","+employe.get(taille).getClass().getSimpleName() + " à pour salaire " + employe.get(taille).calculerSalaire());
            taille--;
        }
    }
    
}
