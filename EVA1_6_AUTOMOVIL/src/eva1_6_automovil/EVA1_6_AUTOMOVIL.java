/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_6_automovil;

/**
 *
 * @author avila
 */
public class EVA1_6_AUTOMOVIL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Automovil car1 = new Automovil("Chrysler","PT",2004,"Daniel Avila","898-989");
        car1.imprimirDatos();
        car1.setAño(2010);
        car1.imprimirDatos();
    }
    
}
