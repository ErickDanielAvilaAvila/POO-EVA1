/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete1;

import Paquete2.ClaseE;

/**
 *
 * @author avila
 */
public class ClaseA {
    public int publicA;
    int defaultA;
    private int PrivateA;
    
    public void prueba(){
        //ClaseB objA = new ClaseB();
        //objB.defaultB;
                
        ClaseC objC = new ClaseC();
        //objC.publicC;
        //objC.defaultC;
          
        ClaseD objD = new ClaseD();
        //objC.publicD;
        //objC.defaultCD;
        
        
        //todo lo que sea default
        //invisible
        ClaseE objE = new ClaseE();
        //objE.publicE;
        
        //Clase F ---> es defult por lo tanto no es visible en la clase A
        //ClaseF objF = new ClaseF();
        
        
    }
    
}
     

class ClaseB{
     public int publicB;
    int defaultB;
    private int PrivateB;
}