package modelo;

public class EnvioRegular implements Envio {

    /**
     * @param peso peso del articulo a enviar
     * @return double costo del envio segun peso
     */
    @Override
    public double costo(double peso) {
        return 5.0 + peso * 1.0; // Costo base de 5 y 1 por kg
    }

    /**
     * @return String Cantidad de dias habiles para las entregas
     */
    @Override
    public String tiempoEntrega() {
        return "5-7 días hábiles";
    }
}
