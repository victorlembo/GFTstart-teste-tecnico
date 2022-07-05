/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio2;

import java.text.DecimalFormat;

/**
 *
 * @author Victor Hugo
 */
public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#.##");

        int reprovados = 0;
        double reprovadosFrequencia = 0;
        double maiorNota = 0;
        double menorNota = 0;

        Aluno[] a = new Aluno[5];

        for (int i = 0; i < a.length; i++) {
            a[i] = new Aluno();
            a[i].setMatricula(i + 1);
            a[i].setNtPrv1(Math.random() * 10);
            a[i].setNtPrv2(Math.random() * 10);
            a[i].setNtPrv3(Math.random() * 10);
            a[i].setFrequencia(Math.random() * 100);

            if (a[i].calcMediaFinal() < 7) {
                reprovados++;
            } else if (a[i].getFrequencia() < 75) {
                reprovadosFrequencia++;
            }
        }
        
        System.out.println(a[1].calcMediaFinal());
        System.out.println("Alunos reprovados: " + reprovados);
        System.out.println("Alunos reprovados por frequencia: " + df.format((reprovadosFrequencia / 5) * 100) + " %" );

    }

}
