package Ejercicio1;

/**
 * Clase que representa el estado Rojo del semáforo.
 * En este estado, los autos deben detenerse.
 */
public class Rojo implements SemaforoEstado {
    @Override
    public void cambiarEstado(Semaforo semaforo) {
        System.out.println("Cambiando de Rojo a Verde.");
        semaforo.setEstadoActual(new Verde());
    }

    @Override
    public void mostrarAccion() {
        System.out.println("Semáforo en Rojo: Los autos deben detenerse.");
    }
}
