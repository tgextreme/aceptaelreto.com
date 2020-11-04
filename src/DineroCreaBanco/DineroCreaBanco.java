/**
 * Aquí muestro cuánto dinero pueden crear los bancos, a partir de una determinada
 * cantidad dem dinero
 */
package DineroCreaBanco;

import java.util.Scanner;

/**
 *
 * @author tgonzalez
 */
public class DineroCreaBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        double dineroReserva;
        double total;
        total = 0;
        double dinero = 5000;
        double porcentaje = 20;

        System.out.println("Dime una cantidad de dinero:");
        dinero = scan.nextDouble();
        System.out.println("Dime el porcentaje de caja:");
        porcentaje=scan.nextFloat();

        int cliente = 1;
        while (dinero > 0.05) {
            dineroReserva = (dinero * porcentaje) / 100;
            dineroReserva = Math.round(dineroReserva * 100.0) / 100.0;
            dinero = dinero - dineroReserva;
            total = dinero + total;
            System.out.println("Genera con el cliente num. " + cliente + " la cantidad dinero " + (Math.round(total * 100.0) / 100.0) + "€");
            cliente = cliente + 1;
        }
        System.out.println("Dinero creado " + (Math.round(total * 100.0) / 100.0));
        dinero=scan.nextFloat();
    }



}
