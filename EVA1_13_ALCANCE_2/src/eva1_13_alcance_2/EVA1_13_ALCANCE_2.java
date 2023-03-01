/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_13_alcance_2;

/**
 *
 * @author avila
 */
public class EVA1_13_ALCANCE_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 100;//visible dentro de todo el bloque main();
        for (int i = 0; i < 10; i++) {
            int x = 100; //la variable está declarada en main() y
                         //es visible dentro del for
            int y = 100;
            if (i == 5){
                
            }
        }
        int y = 100;//aquí la variable y del ciclo for no existe
                    //podemos declarar una variable del mismo nombre
    }
    
}
