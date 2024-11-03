package Ejercicio1;
/**
 * Clase que representa el estado Verde del semáforo.
 * En este estado, los autos pueden avanzar.
 */
public class Verde implements SemaforoEstado {
    @Override
    public void cambiarEstado(Semaforo semaforo) {
        System.out.println("Cambiando de Verde a Amarillo.");
        semaforo.setEstadoActual(new Amarillo());
    }

    @Override
    public void mostrarAccion() {
        System.out.println("Semáforo en Verde: Los autos pueden avanzar.");
    }
}
