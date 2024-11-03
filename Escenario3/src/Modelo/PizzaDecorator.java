package Modelo;

/**
 * Clase abstracta que actúa como decorador para la Pizza.
 */
public abstract class PizzaDecorator extends Pizza {
    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
}