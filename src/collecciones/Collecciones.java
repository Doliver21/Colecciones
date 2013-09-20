/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package collecciones;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author alumno
 */
public class Collecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        
         List<Coche> coches = new ArrayList<>();
         Coche coche1 = new Coche(Marca.FORD, 1900,"Mondeo", "51268951P");
         Coche coche2 = new Coche(Marca.FORD, 2000,"Focus rs","51296551P");
         Coche coche3 = new Coche(Marca.RENAULT, 1200,"Clio", "51261551T");
         Coche coche4 = new Coche(Marca.CITROEN, 1200,"Saxo", "51753951E");
         Coche coche5 = new Coche(Marca.SEAT, 1900,"Leon","51274151O");
         
         
         
         
        coches.add(coche1);
        coches.add(coche2);
        coches.add(coche3);
        coches.add(coche4);
        coches.add(coche5);
        // TODO code application logic here
    }
}
