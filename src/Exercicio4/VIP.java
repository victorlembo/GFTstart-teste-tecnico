/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio4;

/**
 *
 * @author vitin
 */
public class VIP extends Ingresso {

    private double valorAdicional;

    public VIP(double valorAdicional, double valor) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    public double valorIngressoVIP(double v) {
        return v + valorAdicional;
    }

}
