/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_17_sobrecarga_rfc;

/**
 *
 * @author avila
 */
public class Eva1_17_Sobrecarga_RFC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String RFC = generarRFC("DANIEL", "AVILA", "  AVILA", 04, 04, 9);
       System.out.println(RFC);
    }
    public static String generarRFC(String nombre, String apPat, String apMat, int año, int mes, int dia){
        String nom = nombre.charAt(0) + "";
        String apP1 = apPat.charAt(0) + "";
        String apP2 = apPat.charAt(1)+ "";
        String apM = apMat.charAt(0) + "";
        String RFC = apP1 + apP2 + apM + nom + año + mes + dia;
        return RFC;
    }
    //Sobrecargar para los Casos:
    //Falta un apellido --> Sustituir por X 
    //Faltan dos apellidos -->Sustituir por XX
    }
    

