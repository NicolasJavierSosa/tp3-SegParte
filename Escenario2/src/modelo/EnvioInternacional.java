package modelo;

public class EnvioInternacional implements Envio {
    /**
     * @param peso
     * @return double con el costo de envio segun el peso
     */
    @Override
    public double costo(double peso) {
        return 20.0 + peso * 3.5; // Costo base de 20 y 3.5 por kg
    }

    /**
     * @return String Cantidad de dias habiles para las entregas
     */
    @Override
    public String tiempoEntrega() {
        return "7-15 días hábiles";
    }
}
