/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_11_califas;

/**
 *
 * @author avila
 */
public class EVA1_11_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     String cali;
        cali = califas(75);//almaceno el resultado en una variable
        System.out.println("Califa para 75: " + cali);
        System.out.println("Califa para 91: " + califas(91)); 
        califas(100);//ignoro el resultado
    }
    public static String califas (int califa){
        String resu = "";
        if((califa >=91)&&(califa <= 100)){
            resu = "A";
        }
        else if((califa >= 81) && (califa <= 90)){
            resu = "B";
        }
        else if((califa >= 71) && (califa <= 80)){
            resu = "C";
        }
        else{
            resu = "D";
        }
        return resu;
    }
}