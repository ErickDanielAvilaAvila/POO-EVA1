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
public class Circulo {
   private double perimetro;
   private double area;
   private double radio;
   
public Circulo(){
    radio =0;
    area =0;
    perimetro =0;
}
public double getRadio(){
    return radio;
}
public void setRadio(double valor){
    radio = valor;
}
public double getPerimetro(){
    return perimetro;
}
public void setPerimetro(double valor ){
    perimetro = 2* Math.PI * radio;
}
public double getArea(){
    return area;
}
public void setArea(double valor){
    area= Math.PI*Math.pow(radio,2);
}
public void imprimirDatos(){
    System.out.println("Datos del circulo");
    System.out.println("Radio:" + radio);
    System.out.println("Permimetro:" + perimetro);
    System.out.println("Area:" + area);
}
}



    
    

    


