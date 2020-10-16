/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.Controlador;

/**
 *
 * @author andresforero
 */
public class Modelo {

    
    
    public String traductor(String number) {
    
        Controlador control = new Controlador();
        
        number = control.getOpcion();
        
        switch (number) {
            case "0":
                return "Cero";
            case "1":
                return "Uno";
            case "2":
                return "Dos";
            case "3":
                return "Tres";
            case "4":
                return "Cuatro";
            case "5":
                return "Cinco";
            case "6":
                return "Seis";
            case "7":
                return "Siete";
            case "8":
                return "Ocho";
            default:
                return "No encontrado";

        }
    }
}
