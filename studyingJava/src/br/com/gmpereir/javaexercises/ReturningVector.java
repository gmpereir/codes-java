package br.com.gmpereir.javaexercises;

/**
 * @author Gustavo Pereira
 */
public class ReturningVector {

    public static void main(String[] args) {
        double[] aaa = {10.2, 34.2, 45.6, 43, 56};
        double[] ccc = vectorInverter(aaa);

        for (int i = 0; i < ccc.length; i++) {
            System.out.print(ccc[i] + " ");

        }

    }

    public static double[] vectorInverter(double[] abc) {

        double[] xyz = new double[abc.length];

        for (int i = 0, j = xyz.length - 1; i < abc.length; i++, j--) {
            xyz[j] = abc[i];
        }
        return xyz;
    }

}
