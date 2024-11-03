package modelo;

public class EnvioExpres implements Envio {
    /**
     * @param peso peso del paquete
     * @return double con el costo de envio segun el peso
     */
    @Override
    public double costo(double peso) {
        return 10.0 + peso * 2.0; // Costo base de 10 y 2 por kg
    }

    /**
     * @return String Cantidad de dias habiles para las entregas
     */
    @Override
    public String tiempoEntrega() {
        return "1-2 días hábiles";
    }
}
