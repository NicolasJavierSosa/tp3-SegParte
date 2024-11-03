package Modelo;

/**
 * Clase que representa el complemento de queso extra.
 */
public class QuesoExtra extends PizzaDecorator {
    public QuesoExtra(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getPrecio() {
        return pizza.getPrecio() + 1.5; // Precio adicional por queso extra
    }

    @Override
    public String getDescripcion() {
        return pizza.getDescripcion() + ", queso extra";
    }
}
