package ifsc.poo.Lab_Classes;

public class Funcionario extends Pessoa {
    private static int proximoIdentificador = 1;
    private final int identificador;
    private String dataInicioContrato;

    public Funcionario(String nome, String sobrenome, String cpf, String email, String dataInicioContrato){
        super(nome, sobrenome, cpf, email);
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
        return super.getResumo() + ", Identificador: " + getIdentificador();
    }

}
