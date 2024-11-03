package modelo;

public interface Envio {
    /**
     * @param peso indica el peso del paquete a enviar
     * @return retornara el costo del envio dependiendo del metodo
     */
    double costo(double peso);

    /**
     * @return un string que indicara la cantidad de dias habiles de entrega segun
     *         el envio seleccionado
     */
    String tiempoEntrega();
}
