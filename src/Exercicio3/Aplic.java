/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio3;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author vitin
 */
public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");  

        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;
        int candidato4 = 0;
        int votoNulo = 0;
        int votoEmBranco = 0;
        double percentualVotoNulo = 0;
        double percentualVotoEmBranco = 0;

        int voto = 0;
        int opcao;

        do {

            System.out.println("1 - Candidato 1");
            System.out.println("2 - Candidato 2");
            System.out.println("3 - Candidato 3");
            System.out.println("4 - Candidato 4");
            System.out.println("5 - Voto nulo");
            System.out.println("6 - Voto em branco");
            System.out.println("0 - Sair");
            System.out.println("Digite sua opcao de voto: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    candidato1++;
                    voto++;
                    break;
                case 2:
                    candidato2++;
                    voto++;
                    break;
                case 3:
                    candidato3++;
                    voto++;
                    break;
                case 4:
                    candidato4++;
                    voto++;
                    break;
                case 5:
                    votoNulo++;
                    voto++;
                    break;
                case 6:
                    votoEmBranco++;
                    voto++;
                    break;
                default:
                    break;
            }
        } while (opcao != 0);

        percentualVotoNulo = ((double) votoNulo / (double) (voto)) * 100;
        percentualVotoEmBranco = ((double) votoEmBranco / (double) (voto)) * 100;

        System.out.println("Votos para o candidato 1: " + candidato1);
        System.out.println("Votos para o candidato 2: " + candidato2);
        System.out.println("Votos para o candidato 3: " + candidato3);
        System.out.println("Votos para o candidato 4: " + candidato4);
        System.out.println("Votos nulos: " + votoNulo);
        System.out.println("Votos em branco: " + votoEmBranco);
        System.out.println("Percentual de votos nulos: " + df.format(percentualVotoNulo) + " %");
        System.out.println("Percentual de votos em branco: " + df.format(percentualVotoEmBranco) + " %");

    }

}
