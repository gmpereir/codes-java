package br.com.gmpereir.javaexercises;

/**
 *
 * @author Gustavo Pereira
 */
public class ForLoop {

    public static void main(String[] args) {

        for (int i = 0, j = 100; i < 100 && j > 0; i++, --j) {

            System.out.println("Valor de i: " + i + " valor de j: " + j);

        }
    }

}
