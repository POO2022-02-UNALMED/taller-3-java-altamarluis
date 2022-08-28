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
public class Control {
    private TV tv;
    
    public void enlazar(TV televisor){
        tv = televisor;
        tv.control = this;
    }
    
    public TV getTV(){
        return tv;
    }
    
    public void setTV(TV televisor){
        tv = televisor;
    }
}
