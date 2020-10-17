package controller;

import model.Modelo;

/**
 * Clase intermediaria entre la vista y el modelo
 * @author Andres Forero
 * @version: 1.0.0
 * @since 16/10/2020
 */

public class Controlador {
    
    public String opcion;
    
    public String modeloAVista(String opcion){
        
        Modelo modelo = new Modelo();
        
        return modelo.traductor(opcion);
        
    }
      
}
