import modelo.*;

/**
 * Programa principal
 */
public class App {
    public static void main(String[] args) throws Exception {
        Compra compra = new Compra(2.5); /* Se envia el peso en kg */

        compra.setEnvio(new EnvioRegular());
        System.out.println("Tipo de envio: Regular");
        compra.procesarCompra();

        compra.setEnvio(new EnvioExpres());
        System.out.println("Tipo de envio: Expres");
        compra.procesarCompra();

        compra.setEnvio(new EnvioInternacional());
        System.out.println("Tipo de envio: Regular");
        compra.procesarCompra();
    }
}
