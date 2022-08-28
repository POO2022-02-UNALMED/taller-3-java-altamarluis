/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3.televisores;

/**
 *
 * @author LENOVO
 */
public class Marca {
    private String marca;
    public Marca(String nombre){
        marca = nombre;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void setMarca(String nombre){
        marca = nombre;
    }
}
