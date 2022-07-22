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
public class CamaroteInferior extends VIP {

    private String localizacao;

    public CamaroteInferior(String localizacao, double valorAdicional, double valor) {
        super(valorAdicional, valor);
        this.localizacao = localizacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void imprimeLoc() {
        System.out.println("Local: " + localizacao);
    }

}
