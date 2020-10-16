/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import model.Modelo;
import view.Vista;

/**
 *
 * @author andresforero
 */
public class Controlador {
    
    Modelo modelo = new Modelo();
    
    Vista vista = new Vista();
    
    public String modeloAVista(){
        return modelo.traductor(vistaAModelo());
    }
    
    public String vistaAModelo(){
        return vista.opciones();
    }
    
}
