/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_19_static2;
int x = 100;
/**
 *
 * @author avila
 */
public class EVA1_19_STATIC2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // final int x;
        //x = 100;
        //x = 200;
        FormulasGeometria formulas = new FormulasGeometria();
        System.out.println("Mi pi: " + FormulasGeometria.pi);
        System.out.println("Area Triangulo: " + FormulasGeometria.areaTriangulo(5.0, 5.0));
        System.out.println("Volumen Esfera: "+ FormulasGeometria.volumenEsfera(10));
    }
    
}
