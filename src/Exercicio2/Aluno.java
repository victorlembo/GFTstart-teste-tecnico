/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio2;

/**
 *
 * @author Victor
 */
public class Aluno {

    private int matricula;
    private double NtPrv1, NtPrv2, NtPrv3, frequencia;
    private String status;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getNtPrv1() {
        return NtPrv1;
    }

    public void setNtPrv1(double NtPrv1) {
        this.NtPrv1 = NtPrv1;
    }

    public double getNtPrv2() {
        return NtPrv2;
    }

    public void setNtPrv2(double NtPrv2) {
        this.NtPrv2 = NtPrv2;
    }

    public double getNtPrv3() {
        return NtPrv3;
    }

    public void setNtPrv3(double NtPrv3) {
        this.NtPrv3 = NtPrv3;
    }

    public double getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(double frequencia) {
        this.frequencia = frequencia;
    }

    public double calcMediaFinal() {
        return ((NtPrv1 + NtPrv2 + NtPrv3) / 3);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
