package ifsc.poo.Lab_Classes.ClassesFuncionario;

import ifsc.poo.Lab_Classes.Funcionario;

public class Temporario extends Funcionario {
    private String dataTerminoContrato;
    private double valorTotalContrato;
    
    public Temporario(String nome, String sobrenome, String cpf, String email, String dataInicioContrato, String dataTerminoContrato, double valorTotalContrato){
        super(nome, sobrenome, cpf, email, dataInicioContrato);
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

}
