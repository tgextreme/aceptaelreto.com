/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * La fiesta aburrida
 * Tiempo máximo: 1,000 s  Memoria máxima: 2048 KiB
 * Tinín es un tipo bastante peculiar. No le gustan nada las fiestas, ni las celebraciones,
 * ni las cenas familiares o con amigos. Nada. Es sorprendente que, a pesar de sus pocas ganas de interactuar con gente, haya encontrado novia.
 *
 * Cuando ésta consigue sacarle de casa para llevarle a algún tipo de celebración y
 * la gente le dice "Hombre, Tinín, ¡pero si has venido!" él siempre suelta su mítica
 * frase "Yo soy más traído que venido.".
 *
 * Una de las cosas que más le molesta es tener que ir saludando a todos los presentes,
 * sobre todo si no le conocen. Eso de que se le acerquen y le digan "Soy Lotario" y que
 * él tenga que saludar no lo soporta. ¿Puedes ayudarle?
 *
 * Entrada
 * La entrada comienza con un número que indica la cantidad de gente a la que Tinín no conoce
 * en la fiesta en la que está. A continuación viene una línea por cada una de esas personas
 * en la que se presenta indicando su nombre: "Soy Lotario". La línea siempre tendrá el mismo
 * formato; una primera palabra "Soy" seguida del nombre de la persona que será simple (no
 * será un nombre compuesto por varias palabras) y formado por como mucho 100 letras del
 * alfabeto inglés.
 *
 * Salida
 * Para cada persona que se le aproxima, se debe escribir la cadena "Hola, [nombre].".
 */
package FiestaAburrida;

import java.util.Scanner;

/**
 *
 * @author tgonzalez
 */
public class FiestaAburrida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Scanner sca = new Scanner(System.in);
            String frase, nombre, nombreIntermedio = "", nombreIntermedioM = "", let = "";
            String[] str;
            boolean cambiar = true;
            System.out.println("¿quien eres?\"soy \"");
            frase = sca.nextLine();
            frase = frase.toUpperCase();
            str = frase.split(("SOY "));
            nombre = str[1];

            for (int i = 0; i < nombre.length(); i = i + 1) {
                if (i == 0) {
                    nombreIntermedio = (nombre.charAt(i) + "").toUpperCase();
                } else {
                    nombreIntermedio = nombreIntermedio + (nombre.charAt(i) + "").toLowerCase();
                }
            }
            nombreIntermedio = nombreIntermedio.toLowerCase();
            for (int i = 0; i < nombreIntermedio.length(); i++) {
                
                if ((nombreIntermedio.charAt(i) + "").equals(" ") && cambiar) {
                    let = let + " " + (nombreIntermedio.charAt(i + 1) + "").toUpperCase();
                    cambiar = false;
                }else if(i==0){
                    let = let+ (nombreIntermedio.charAt(i) + "").toUpperCase();
                }else {
                    if (cambiar) {
                        let = let + nombreIntermedio.charAt(i);
                    } else {
                        cambiar = true;
                    }
                }

            }
            System.out.println("Encantado " + let);
        } catch (Exception ex) {
            System.out.println("Disculpa pero no te he entendido" + ex.getMessage());
        }

    }

}
