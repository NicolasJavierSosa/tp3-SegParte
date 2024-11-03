package Modelo;

/**
 * Clase que representa el complemento de jamón.
 */
public class Jamon extends PizzaDecorator {
    public Jamon(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getPrecio() {
        return pizza.getPrecio() + 2.0; // Precio adicional por jamón
    }

    @Override
    public String getDescripcion() {
        return pizza.getDescripcion() + ", jamón";
    }
}
