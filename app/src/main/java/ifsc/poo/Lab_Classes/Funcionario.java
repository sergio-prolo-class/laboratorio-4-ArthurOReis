package ifsc.poo.Lab_Classes;

import java.util.Queue;

public class Funcionario extends Pessoa {
    protected static int proximoIdentificador = 1;
    protected final int identificador;
    protected String dataInicioContrato;

    public Funcionario(String nome, String sobrenome, String cpf, Queue<String> emails, String dataInicioContrato){
        super(nome, sobrenome, cpf, emails);
        this.dataInicioContrato = dataInicioContrato;
        this.identificador = proximoIdentificador++;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getDataInicioContrato() {
        return dataInicioContrato;
    }

    public void setDataInicioContrato(String dataInicioContrato) {
        this.dataInicioContrato = dataInicioContrato;
    }

    @Override
    public String getResumo() {
        return super.getResumo() + "\n Identificador: " + getIdentificador();
    }

}
