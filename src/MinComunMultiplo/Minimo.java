/*
 * En esta ocasión voy a hace el Mínimo Común Múltiplo
 */
package MinComunMultiplo;

import java.util.Scanner;

/**
 *
 * @author tgonzalez
 */
public class Minimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Scanner sca = new Scanner(System.in);
            int numero;

            System.out.println("Dimame el numero para hacer el MCM");
            numero = sca.nextInt();
            String str = "";

            for (int i = 2; numero != 1 && i < numero; i++) {
                if (numero % i == 0) {
                    str = str + i + "-";
                    numero = numero / i;
                    i = 2;
                }
            }
            str = str + numero;
            //str = str.substring(0, str.length() - 1);
            System.out.println(str);
        } catch (Exception ex) {
            System.out.println("Debes de poner un número entero");
        }

    }

}
