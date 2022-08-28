/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3.televisores;
import taller3.televisores.TV.*;

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
    
    public TV getTv(){
        return tv;
    }
    
    public void setTv(TV televisor){
        tv = televisor;
    }

    public void turnOff() {
        tv.turnOff();
    }

    public void setCanal(int i) {
        tv.setCanal(i);
    }

    public void turnOn() {
        tv.turnOn();
    }

    public void canalUp() {
        tv.canalUp();
    }
    
    public void canalDown(){
        tv.canalDown();
    }

    public void volumenUp() {
        tv.volumenUp();
    }
    
    public void volumenDown(){
        tv.volumenDown();
    }
}
