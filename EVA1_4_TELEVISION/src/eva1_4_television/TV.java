/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_4_television;

/**
 *
 * @author avila
 */
public class TV {
private boolean power;
private int Volumen;
private int canal;
//metodos: comportamiento
//constructor:
public TV(){//constructor default
    power = false; //apagado 
    Volumen = 0;
    canal = 5;
}

//métodos para operar la TV (interfaz)
    //encender y apagar la TV
    public void cambiarpower(){
        //verificar el estado de la TV
        if(power == true){
            power = false;
            System.out.println("Apagando pandalla");
        }else{
            power = true;
            System.out.println("Encendiendo pantalla");
        }
    }
    //volumen
    public void subirVolumen(){
        if (power == true){//if (poder) la tv está prendida
            if(Volumen < 100){//no debemos de pasar de 100
                Volumen = Volumen + 1;//acumulador
                //volumen++;
                //volumen+=1;
                System.out.println("Volumen: " + Volumen);
            }
        }
    }
    public void bajarVolumen(){
        if (power == true){//if (poder)
            if (Volumen > 0){
                Volumen = Volumen - 1;//acumulador
                //volumen--;
                 //volumen-=1;
                System.out.println("Volumen: " + Volumen);
            }
        }
    }
    public void bajarCanal(){
        if (power == true){
            canal = canal -1;
            if(canal > 0)
                canal = 100;
                
                System.out.println("canal: " + canal);
            }
        }
    public void subirCanal(){
        if (power == true){
            canal = canal + 1;
                if(canal < 100)
                    canal = 0;
                    System.out.println("canal: " + canal);   
        }
    }
}