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
public class Persona {
    //DATOS --> ATRIBUTOS DE LA CLASE 
    public String nombre;
    public String apellidos;
    public int edad;
    public char genero;
    public boolean estadocivil;
    //METODOS --> COMPORTAMIENTO DE LA CLASE 
    //LEER Y ESCRIBIR LOS ATRIBUTOS DE LA CLASE
    //LEER --> GET
    //ESCRIBIR -->SET
    //modificador de accesp valor de retorno nombre del metodo argumentos que recibe el metodo 
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String valor){
        nombre = valor;
         }
    public String gettApellido(){
        return apellidos;
    }
    public void setApellido(String valor){
        apellidos = valor;
    }
    
         public int getEdad(){
        return edad;
    }
    public void setEdad(int valor){
        edad = valor;
         }
    public boolean getestadocivil(){
        return estadocivil;
    }
    public void setEstadoCivil(boolean valor){
        estadocivil = valor;
    }
     public char getgenero(){
        return genero;
    }
    public void setgenero(char valor){
       genero = valor;
         }
    public void imprimirDatos(){
        System.out.println("Nombre: " + nombre + " "+ apellidos);
        System.out.println("Edad: " + edad); 
        if (genero == 'H'){
            System.out.println("Hombre");
         }else if (genero == 'M'){
             System.out.println("Mujer");
         }else if (genero == 'L'){
             System.out.println("Lesbiana");
         }else{
             System.out.println("Genero no registrado");
         
         
             
         }

    }
}
        
    
    
        

