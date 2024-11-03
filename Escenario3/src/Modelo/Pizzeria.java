package Modelo;

/**
 * Clase principal para demostrar la personalización de pizzas.
 */
public class Pizzeria {
    public static void main(String[] args) {
        Pizza pizza = new PizzaBase();
        System.out.println("Descripción: " + pizza.getDescripcion());
        System.out.println("Precio: $" + pizza.getPrecio());

        // Añadiendo queso extra
        pizza = new QuesoExtra(pizza);
        System.out.println("Descripción: " + pizza.getDescripcion());
        System.out.println("Precio: $" + pizza.getPrecio());

        // Añadiendo jamón
        pizza = new Jamon(pizza);
        System.out.println("Descripción: " + pizza.getDescripcion());
        System.out.println("Precio: $" + pizza.getPrecio());

        // Añadiendo champiñones
        pizza = new Champinones(pizza);
        System.out.println("Descripción: " + pizza.getDescripcion());
        System.out.println("Precio: $" + pizza.getPrecio());
    }
}
