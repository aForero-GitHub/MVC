package model;
/**
 * Logica del traductor.
 * recibe la opcion seleccionada en la vista y retorna el valor correcto
 * @author Andres Forero
 * @version: 1.0.0
 * @since 16/10/2020
 */
public class Modelo {

    
    
    public String traductor(String number) {
        
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
