package Ejercicio1;

/**
 * Interfaz que define los métodos que deben implementarse para los
 * diferentes estados del semáforo.
 */
public interface SemaforoEstado {
    /**
     * Cambia el estado del semáforo a otro estado.
     *
     * @param semaforo el semáforo cuyo estado se va a cambiar
     */
    void cambiarEstado(Semaforo semaforo);

    /**
     * Muestra la acción actual del semáforo.
     */
    void mostrarAccion();
}
