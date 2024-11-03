package Modelo;

/**
 * Clase que representa una pizza básica.
 */
public class PizzaBase extends Pizza {
    @Override
    public double getPrecio() {
        return 8.0; // Precio base de la pizza
    }

    @Override
    public String getDescripcion() {
        return "Pizza básica";
    }
}
