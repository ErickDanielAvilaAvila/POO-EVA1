/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_3_constructoress;

/**
 *
 * @author avila
 */
public class EVA1_3_CONSTRUCTORESS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // TODO code application logic here
        ClasesBancarias cuenta1 = new ClasesBancarias("65", 30, "messi");
        //cuenta1.setNomCliente("Daniel Avila");
        //cuenta1.setNumCuenta("1");
        //cuenta1.setSaldo(780000); 
        
        System.out.println("Datos del cliente");
        String nombre = cuenta1.getNomCliente();
        System.out.println(nombre);
        System.out.println(cuenta1.getNumCuenta());
        System.out.println(cuenta1.getSaldo());
        
        ClasesBancarias cuenta2 = new ClasesBancarias("4", 50, "CR7");
        System.out.println("Datos del cliente");
        System.out.println(nombre);
        System.out.println(cuenta2.getNumCuenta());
        System.out.println(cuenta2.getSaldo());
    }
    
}

    

