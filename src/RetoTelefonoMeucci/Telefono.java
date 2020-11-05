/**
 * El teléfono de Meucci
 * Tiempo máximo: 1,000-2,000 s  Memoria máxima: 4096 KiB
 * Móvil con los números en notación romana
 * En 1876, Alexander Graham Bell patentó el teléfono, lo que le sirvió para ser considerado su inventor durante más de un siglo.
 *
 * La realidad, sin embargo, fue bien distinta, porque el invento había sido creado por Antonio Meucci, un inmigrante italiano afincado en Estados Unidos que en 1860 había mostrado al mundo el llamado teletrófono. Las penurias económicas que estaba pasando Meucci no le permitieron pagar la patente de su invento y Graham Bell se aprovechó de ello. Afortunadamente, el año 2002 puso a cada uno en su lugar cuando el congreso de los Estados Unidos aprobó una resolución en la que se reconocía que, efectivamente, el inventor había sido Meucci y la oficina de patentes había fallado a la hora de hacer bien su trabajo.
 *
 * Hoy nos planteamos qué habría pasado si hubiera sido él quién hubiera explotado el invento desde el principio. Es posible que, al ser italiano, los números para marcar en lugar de venir expresados con los dígitos arábigos podrían haber venido en números romanos. Así, el número 555-55-55 habría sido VVV-VV-VV.
 *
 * La primera implicación de ese cambio es que no habríamos tenido el cero entre los dígitos y quizá habría sido sustituido por la X que representa el 10. El número 555-50-05 sería entonces VVV-VX-XV.
 *
 * La segunda implicación es mucho más dramática, porque la forma que tenemos de escribir un número de teléfono no serviría. La razón está en la forma de escribir cada dígito en notación romana:
 *
 * Dígito	0	1	2	3	4	5	6	7	8	9
 * Símbolo	X	I	II	III	IV	V	VI	VII	VIII	IX
 * Con esta codificación, un número de teléfono como IVII podría representar,
 * entre otros, I-V-I-I (1511), I-V-II (152), IV-II (42) o I-VI-I (161).
 *
 * Ante semejante locura, dado un número de teléfono expresado en números romanos,
 * ¿a cuántos números de teléfono distintos puede representar?
 *
 * Entrada
 * La entrada estará formada por distintos números de teléfono, cada uno en una
 * línea.
 *
 * Cada número está expresado en números romanos según lo explicado más arriba.
 * Habrá como mucho 20 caracteres, que serán únicamente I, V y X.
 *
 * Salida
 * Por cada caso de prueba se escribirá, en una línea independiente, el número de
 * teléfonos distintos a los que puede representar, sabiendo que los únicos
 * "dígitos romanos" válidos son los indicados en la tabla. Se garantiza que
 * el resultado será siempre menor que 231.
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RetoTelefonoMeucci;

import java.util.Scanner;

/**
 *
 * @author tgonzalez
 */
public class Telefono {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Scanner sca = new Scanner(System.in);
            int telefono;
            String str = "";
            String str_fin = "";
            System.out.println("Escribe un número de teléfono en el formato XXXXX");
            telefono = sca.nextInt();
            str = telefono + "";

            for (int i = 0; i < str.length(); i = i + 1) {
                switch (str.charAt(i) + "") {
                    case "1":
                        str_fin = str_fin + "I" + "-";
                        break;
                    case "2":
                        str_fin = str_fin + "II" + "-";
                        break;
                    case "3":
                        str_fin = str_fin + "III" + "-";
                        break;
                    case "4":
                        str_fin = str_fin + "IV" + "-";
                        break;
                    case "5":
                        str_fin = str_fin + "V" + "-";
                        break;
                    case "6":
                        str_fin = str_fin + "VI" + "-";
                        break;
                    case "7":
                        str_fin = str_fin + "VII" + "-";
                        break;
                    case "8":
                        str_fin = str_fin + "VIII" + "-";
                        break;
                    case "9":
                        str_fin = str_fin + "IX" + "-";
                        break;
                }
            }
            str_fin=str_fin.substring(0,str_fin.length()-1);
            
            System.out.println("Resultado "+str_fin);

        } catch (Exception ex) {
            System.out.println("El número escrito no es correcto" + ex.getMessage());
        }
    }

}
