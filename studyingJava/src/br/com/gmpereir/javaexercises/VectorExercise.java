package br.com.gmpereir.javaexercises;

import java.util.Scanner;

/**
 * @author Gustavo Pereira
 */
public class VectorExercise {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final int TOTAL_ALUNOS = 4;
        final int TOTAL_BIMESTRES = 4;
        final double NOTA_MINIMA = 70.0;

        String[] nomeAlunos = new String[TOTAL_ALUNOS];
        double[][] notaAlunos = new double[TOTAL_ALUNOS][TOTAL_BIMESTRES];
        double[] mediaAlunos = new double[TOTAL_ALUNOS];

//        Obter nome dos alunos
        for (int i = 0; i < TOTAL_ALUNOS; ++i) {

            System.out.println("Informe o nome do " + (i + 1) + "º aluno:");
            nomeAlunos[i] = input.nextLine();

        }

        System.out.println("");

//        Obter notas dos alunos todos os bimestres
        for (int i = 0; i < TOTAL_ALUNOS; ++i) {

            for (int j = 0; j < TOTAL_BIMESTRES; ++j) {

                System.out.println("Informe a nota do aluno " + nomeAlunos[i]
                        + " para o " + (j + 1) + "º bimestre:");
                notaAlunos[i][j] = input.nextDouble();

            }

        }

//        Calcular a media de notas dos alunos
        for (int i = 0; i < TOTAL_ALUNOS; i++) {

            for (int j = 0; j < TOTAL_BIMESTRES; ++j) {

                mediaAlunos[i] += notaAlunos[i][j];

            }
            mediaAlunos[i] /= TOTAL_BIMESTRES;

        }

//        Mostrar situação dos alunos
        System.out.println("======RESULTADO FINAL======");
        for (int i = 0; i < TOTAL_ALUNOS; ++i) {

            if (mediaAlunos[i] < NOTA_MINIMA) {

                System.out.println("Aluno " + nomeAlunos[i] + " REPROVADO. Media: " + mediaAlunos[i]);

            } else if (mediaAlunos[i] > NOTA_MINIMA) {

                System.out.println("Aluno " + nomeAlunos[i] + " APROVADO. Media: " + mediaAlunos[i]);

            }

        }

    }

}
