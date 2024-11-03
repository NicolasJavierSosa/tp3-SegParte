package Ejercicio1;
/**
 * Clase que representa el estado Amarillo del semáforo.
 * En este estado, se advierte a los conductores que el semáforo cambiará pronto.
 */
public class Amarillo implements SemaforoEstado {
    @Override
    public void cambiarEstado(Semaforo semaforo) {
        System.out.println("Cambiando de Amarillo a Rojo.");
        semaforo.setEstadoActual(new Rojo());
    }

    @Override
    public void mostrarAccion() {
        System.out.println("Semáforo en Amarillo: Precaución, el semáforo cambiará pronto.");
    }
}
