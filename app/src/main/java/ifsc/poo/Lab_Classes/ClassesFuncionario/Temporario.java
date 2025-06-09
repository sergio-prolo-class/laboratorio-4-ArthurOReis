package ifsc.poo.Lab_Classes.ClassesFuncionario;

import java.util.Queue;

import ifsc.poo.Lab_Classes.Funcionario;

public class Temporario extends Funcionario {
    protected String dataTerminoContrato;
    protected double valorTotalContrato;
    
    public Temporario(String nome, String sobrenome, String cpf, Queue<String> emails, String dataInicioContrato, String dataTerminoContrato, double valorTotalContrato){
        super(nome, sobrenome, cpf, emails, dataInicioContrato);
        this.dataTerminoContrato = dataTerminoContrato;
        this.valorTotalContrato = valorTotalContrato;
    }

    public String getDataTerminoContrato() {
        return dataTerminoContrato;
    }

    public void setDataTerminoContrato(String dataTerminoContrato) {
        this.dataTerminoContrato = dataTerminoContrato;
    }

    public double getValorTotalContrato() {
        return valorTotalContrato;
    }

    public void setValorTotalContrato(double valorTotalContrato) {
        this.valorTotalContrato = valorTotalContrato;
    }

    @Override
    public String getResumo() {
        return super.getResumo() + "\n Data Término Contrato: " + getDataTerminoContrato() + "\n Valor Total Contrato: " + getValorTotalContrato();
    }

}
