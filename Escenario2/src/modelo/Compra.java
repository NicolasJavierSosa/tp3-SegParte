package modelo;

public class Compra {
    private Envio metodoEnvio;
    private double peso;

    /**
     * @param peso el peso de la compra a enviar
     */
    public Compra(double peso) {
        this.peso = peso;
    }

    /**
     * Metodo para que el cliente pueda crear un objeto de estrategia específica y
     * asignarlo a la compra
     * 
     * @param metodoEnvio para establecer un tipo al envio
     */
    public void setEnvio(Envio metodoEnvio) {
        this.metodoEnvio = metodoEnvio;
    }

    /**
     * realiza el cálculo del costo de envío
     * y muestra el tiempo estimado de entrega utilizando la estrategia de envío
     * seleccionada.
     */
    public void procesarCompra() {
        if (metodoEnvio == null) {
            System.out.println("Seleccione metodo de envio:");
            return;
        }
        System.out.println("Costo de envío: $" + metodoEnvio.costo(peso));
        System.out.println("Tiempo estimado de entrega: " + metodoEnvio.tiempoEntrega());
    }
}
