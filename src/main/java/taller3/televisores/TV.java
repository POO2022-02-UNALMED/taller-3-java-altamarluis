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
public class TV {
    private Marca marca;
    private int canal;
    private int precio;
    private boolean estado;
    private int volumen;
    Control control;
    private static int numTV = 0;
    
    public TV(Marca marca, boolean estado){
        this.marca = marca;
        this.estado = estado;
        canal = 1;
        volumen = 1;
        precio = 500;
        numTV++;
    }
    
    public Marca getMarca(){
        return marca;
    }
    
    public Control getControl(){
        return control;
    }
    
    public int getPrecio(){
        return precio;
    }
    
    public int getVolumen(){
        return volumen;
    }
        
    public int getCanal(){
        return canal;
    }
    
    public boolean getEstado(){
        return estado;
    }
    
    public static int getNumTV(){
        return numTV;
    }
    
    public void setMarca(Marca marca){
        this.marca = marca;
    }
    
    public void setControl(Control control){
        this.control = control;
    }
    
    public void setPrecio(int precio){
        this.precio = precio;
    }
    
    public void setVolumen(int volumen){
        this.volumen = volumen;
    }
    
    public void setCanal(int canal){
        this.canal = canal;
    }
    
    public static void setNumTV(int num){
        numTV = num;
    }
    
    public void turnOn(){
        estado = true;
    }
    
    public void turnOff(){
        estado = false;
    }
    
    public void canalUp(){
        if (estado && canal > 0 && canal < 120){
            canal++;
        }
        
    }
    
    public void canalDown(){
        if (estado && canal > 1 && canal < 121){
            canal--;
        }
    }
    
    public void volumenUp(){
        if (estado && volumen > -1 && volumen < 7){
            volumen++;
        }
    }
    
    public void volumenDown(){
        if (estado && volumen > 0 && volumen < 8){
            volumen--;
        }
    }
    
}
