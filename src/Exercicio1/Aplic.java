/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio1;

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
        
       
        double valCarro;
        double valParcela;
        int qtdParcela;
        double precoFinal;
        int opcao, opc;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do carro: ");
        valCarro = sc.nextDouble();

        do {

            System.out.println("1 - A vista");
            System.out.println("2 - Parcelado");
            System.out.println("3 - Sair");
            System.out.println("Digite a opcao desejada: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    precoFinal = valCarro * 0.8;
                    System.out.println("Preco Final: " + precoFinal);
                    System.out.println("Quantidade Parcelas: " + precoFinal);
                    System.out.println("Valor da Parcela: " + precoFinal);
                    break;

                case 2:

                    System.out.println("1 - 6 parcelas");
                    System.out.println("2 - 12 parcelas");
                    System.out.println("3 - 18 parcelas");
                    System.out.println("4 - 24 parcelas");
                    System.out.println("5 - 30 parcelas");

                    System.out.println("Digite a opcao desejada: ");
                    opc = sc.nextInt();

                    switch (opc) {
                        case 1:
                            qtdParcela = 6;
                            precoFinal = valCarro * 1.03;
                            valParcela = precoFinal / qtdParcela;
                            System.out.println("Preco final: " + precoFinal);
                            System.out.println("Quantidade parcelas: " + qtdParcela);
                            System.out.println("Valor da Parcela: " + valParcela);
                            break;

                        case 2:
                            qtdParcela = 12;
                            precoFinal = valCarro * 1.06;
                            valParcela = precoFinal / qtdParcela;
                            System.out.println("Preco final: " + precoFinal);
                            System.out.println("Quantidade parcelas: " + qtdParcela);
                            System.out.println("Valor da Parcela: " + valParcela);
                            break;
                        case 3:
                            qtdParcela = 18;
                            precoFinal = valCarro * 1.09;
                            valParcela = precoFinal / qtdParcela;
                            System.out.println("Preco final: " + precoFinal);
                            System.out.println("Quantidade parcelas: " + qtdParcela);
                            System.out.println("Valor da Parcela: " + valParcela);
                            break;
                        case 4:
                            qtdParcela = 24;
                            precoFinal = valCarro * 1.12;
                            valParcela = precoFinal / qtdParcela;
                            System.out.println("Preco final: " + precoFinal);
                            System.out.println("Quantidade parcelas: " + qtdParcela);
                            System.out.println("Valor da Parcela: " + valParcela);
                            break;
                        case 5:
                            qtdParcela = 30;
                            precoFinal = valCarro * 1.15;
                            valParcela = precoFinal / qtdParcela;
                            System.out.println("Preco final: " + precoFinal);
                            System.out.println("Quantidade parcelas: " + qtdParcela);
                            System.out.println("Valor da Parcela: " + valParcela);
                            break;
                        default:
                            System.out.println("Opção inválida");
                            break;
                    }

            }

        } while (opcao != 3);

    }

}
