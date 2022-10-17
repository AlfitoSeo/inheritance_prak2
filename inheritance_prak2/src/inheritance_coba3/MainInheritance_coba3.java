/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance_coba3;

/**
 *
 * @author alfito septiano
 */
public class MainInheritance_coba3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
mamalia mama=new mamalia();
monyet kera=new monyet();
Paus ikan=new Paus();

System.out.println("Paus berjenis tulang : "+ikan.tulang);
mama.tulang();

System.out.println("monyet bernafas dengan : "+kera.nafas);
mama.bernafas();

kera.habitat();
ikan.habitat();

    }
    
}
