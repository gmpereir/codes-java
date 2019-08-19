package br.com.gmpereir.javaexercises;

/**
 * @author Gustavo Pereira
 */
public class BubbleSort {

    public static void main(String[] args) {

        int vector[] = {4, 7, 6, 2, 8, 1, 9, 5, 6, 9, 2, 10, 14, 3, 2, 6, 13};
        int aux;
        boolean control;

        for (int i = 0; i < vector.length; ++i) {

            control = true;
            for (int j = 0; j < (vector.length - 1); ++j) {

                if (vector[j] > vector[j + 1]) {
                    aux = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = aux;
                    control = false;
                }

            }
            if (control) {
                break;
                
            }

        }

        for (int i = 0; i < vector.length; ++i) {
            System.out.print(vector[i] + " ");

        }

    }

}
