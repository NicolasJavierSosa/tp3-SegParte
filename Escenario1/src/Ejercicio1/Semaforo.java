package Ejercicio1;
/**
 * Clase que representa un semáforo que puede estar en diferentes estados.
 * Controla el estado actual y permite cambiar entre Rojo, Amarillo y Verde.
 */
public class Semaforo {
    private SemaforoEstado estadoActual;

    /**
     * Constructor que inicializa el semáforo con un estado específico.
     *
     * @param estadoInicial el estado inicial del semáforo
     */
    public Semaforo(SemaforoEstado estadoInicial) {
        this.estadoActual = estadoInicial;
    }

    /**
     * Establece el estado actual del semáforo.
     *
     * @param nuevoEstado el nuevo estado a establecer
     */
    public void setEstadoActual(SemaforoEstado nuevoEstado) {
        this.estadoActual = nuevoEstado;
    }

    /**
     * Cambia el estado actual del semáforo al siguiente estado.
     */
    public void cambiarEstado() {
        estadoActual.cambiarEstado(this);
    }

    /**
     * Muestra la acción del estado actual del semáforo.
     */
    public void mostrarAccion() {
        estadoActual.mostrarAccion();
    }

    /**
     * Método principal para ejecutar la simulación del semáforo.
     *
     * @param args los argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        Semaforo semaforo = new Semaforo(new Rojo());

        semaforo.mostrarAccion();
        semaforo.cambiarEstado();

        semaforo.mostrarAccion();
        semaforo.cambiarEstado();

        semaforo.mostrarAccion();
        semaforo.cambiarEstado();
    }
}
