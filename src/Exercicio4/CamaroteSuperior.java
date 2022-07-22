/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio4;

/**
 *
 * @author VictorHugo
 */
public class CamaroteSuperior extends VIP {

    private double valorAdicional2;

    public CamaroteSuperior(double valorAdicional2, double valorAdicional, double valor) {
        super(valorAdicional, valor);
        this.valorAdicional2 = valorAdicional2;
    }

    public double valCamSuperior(double v) {
        return super.valorIngressoVIP(v)+ valorAdicional2;
    }

}
