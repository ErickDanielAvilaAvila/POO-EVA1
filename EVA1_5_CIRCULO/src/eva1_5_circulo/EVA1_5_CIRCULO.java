/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_5_circulo;

/**
 *
 * @author avila
 */
public class EVA1_5_CIRCULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo clo = new Circulo(13, 21, 14);
        System.out.println("resultados del cirulo");
        System.out.println(clo.area());
        System.out.println(clo.radio());
        System.out.println(clo.perimetro());
        
        
        Circulo clo2 = new Circulo();
        clo2.area(11);
        clo2.perimetro(38);
        clo2.radio(19);
        clo2.imprimirDatos();
    }
    
}
