/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_2_clases_java;

/**
 *
 * @author avila
 */
public class EVA1_2_CLASES_JAVA {
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CREAR UN OBJETO
        //INSTANCIACION
        //INSATCIAR --> DAR MEMORIA RAM
        //NOMBRE DE LA CLASE IDENTIFICADOR = new CONSTRUCTOR DE LA 
        //----
        Persona perso1 = new Persona();
         perso1.nombre = "Daniel";
         perso1.apellidos = "Avila";
         perso1.setNombre("Daniel");
         perso1.setApellido("Avila");
         perso1.setEdad(18);
         perso1.setgenero('H');
         System.out.println(perso1.getNombre());
         System.out.println(perso1.gettApellido());
         System.out.println(perso1.getEdad());
         System.out.println(perso1.getgenero());
         perso1.imprimirDatos();
         //----                    //CONSTRUCTOR
         Persona perso2 = new Persona ();
         perso2.setNombre("juana");
         perso2.setEdad(30);
         perso2.setApellido("perez");
         perso2.setgenero('M');
         perso2.imprimirDatos();
         
                 

               
    }
    
}
