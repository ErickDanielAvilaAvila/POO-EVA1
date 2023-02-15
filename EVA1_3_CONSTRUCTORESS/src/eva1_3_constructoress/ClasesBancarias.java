/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_3_constructoress;

/**
 *
 * @author avila
 */
public class ClasesBancarias {
  //atributos de la clase
    private String numCuenta;
    private double saldo;
    private String nomCliente;
    //constructores
    //default y con argumentos
    public ClasesBancarias(){ //constructor default
        numCuenta = "000000"; 
        saldo = 1000000;
        nomCliente = "----------";
    }
    public ClasesBancarias(String nCuenta, double otroSaldo, String nCliente){
        numCuenta = nCuenta;
        saldo = otroSaldo;
        nomCliente= nCliente;
    }
    //comportamientouu
    //metodos get y set 
    public String getNumCuenta(){
        return numCuenta;
    }
    public double getSaldo(){
        return saldo;
    }
    public String getNomCliente(){
        return nomCliente;
    }
    public void setNumCuenta(String valor){
        numCuenta = valor;
    }
    public void setSaldo(double valor){
        saldo = valor;
    }
    public void setNomCliente(String valor){
        nomCliente = valor;
    }
}