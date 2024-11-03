package Modelo;

/**
 * Clase que representa el complemento de champiñones.
 */
public class Champinones extends PizzaDecorator {
    public Champinones(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getPrecio() {
        return pizza.getPrecio() + 1.0; // Precio adicional por champiñones
    }

    @Override
    public String getDescripcion() {
        return pizza.getDescripcion() + ", champiñones";
    }
}