/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Modelo;

/**
 *
 * @author andresforero
 */

public class Controlador {
    
    public String opcion;

    public Controlador(String opcion) {
        
        this.setOpcion(opcion);
    }

    public Controlador() {
        
    }
    
    public String modeloAVista(){
        
        Modelo modelo = new Modelo();
        
        return modelo.traductor(getOpcion());
        
    }
    
    public String getOpcion() {
        return opcion;
    }

    public void setOpcion(String opcion) {
        this.opcion = opcion;
    }
    
}
