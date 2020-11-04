/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Perímetro de un rectángulo
 * Tiempo máximo: 1,000-2,000 s  Memoria máxima: 4096 KiB
 * El perímetro de un polígono es la suma de la longitud de todos sus lados.
 * ¿Eres capaz de calcular el perímetro de un rectángulo?
 *
 * Entrada
 * La entrada consta de una serie de casos de prueba. Cada uno contiene,
 * en una sola línea, la definición de un rectángulo. Un rectángulo se especifica
 * proporcionando las coordenadas de la esquina superior derecha. Se debe considerar
 * que la esquina inferior izquierda está siempre en el origen de coordenadas,
 * es decir en (0, 0). Se garantiza que la longitud de un lado no superará 108.
 */
package rectangulo;

import java.util.Scanner;

/**
 *
 * @author tgonzalez
 */
public class Rectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            float a, b, calculo;
            String str;
            String[] numbers;
            Scanner sca = new Scanner(System.in);
            System.out.println("Póngame 2 números en el formato XX XX");
            str = sca.nextLine();
            numbers = str.split("( )");
            a = Float.parseFloat(numbers[0]);
            b = Float.parseFloat(numbers[1]);
            if (numbers.length != 2) {
                throw new Exception("No has colocado los números en el formato correcto");
            }
            if (a < 0 || b < 0) {
                throw new Exception("los números deben ser positivos");

            }
            calculo = (a * 2) + (b * 2);

            System.out.println("El cálculo es igual a \n " + calculo);

        } catch (Exception ex) {
            System.out.println("¿Lo has puesto en el formato correcto XX XX?" + ex.getMessage());
        }

    }

}
