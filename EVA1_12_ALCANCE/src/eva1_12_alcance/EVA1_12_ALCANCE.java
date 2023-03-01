/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_12_alcance;

/**
 *
 * @author avila
 */
public class EVA1_12_ALCANCE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 100;//visible para todo lo que esté 
                    //dentro de main()
        for (int i = 0; i < 10; i++) {//inicio del bloque for
            System.out.println("x = " + x);//visible dentro del for
            System.out.println("i = " + i);
            System.out.println("j = " + j);//variable no es visible
                                           //no está declarada antes de
                                           //la instrucción
            int j = 100;//a partir de aquí, es visible
            System.out.println("j = " + j);
            {
                int z = 1000;
                System.out.println("z = " + z);
            }
            System.out.println("z = " + z);
        }//termina bloque for}
        //no están declaradas en del bloque
        System.out.println("i = " + i);
        System.out.println("j = " + j);
    }
    public static void algo(){
        System.out.println("x = " + x);//no es visible en algo()
    
    }
    
}
