package ifsc.poo.Lab_Classes.ClassesFuncionario;

import ifsc.poo.Lab_Classes.Funcionario;

public class Estagiario extends Funcionario {
    private double salarioBrutoMensal;
    private int cargaHorariaSemanal;
    private String nomeDaInstituicaoDeEnsino;
    private CLT orientador;
    
    public Estagiario(String nome, String sobrenome, String cpf, String email, String dataInicioContrato, double salarioBrutoMensal, int cargaHorariaSemanal, String nomeDaInstituicaoDeEnsino, CLT orientador){
        super(nome, sobrenome, cpf, email, dataInicioContrato);
        this.salarioBrutoMensal = salarioBrutoMensal;
        this.cargaHorariaSemanal = cargaHorariaSemanal;
        this.nomeDaInstituicaoDeEnsino = nomeDaInstituicaoDeEnsino;
        this.orientador = orientador;
    }

        public double getSalarioBrutoMensal() {
        return salarioBrutoMensal;
    }

    public void setSalarioBrutoMensal(double salarioBrutoMensal) {
        this.salarioBrutoMensal = salarioBrutoMensal;
    }

    public int getCargaHorariaSemanal() {
        return cargaHorariaSemanal;
    }

    public void setCargaHorariaSemanal(int cargaHorariaSemanal) {
        this.cargaHorariaSemanal = cargaHorariaSemanal;
    }

    public String getNomeDaInstituicaoDeEnsino() {
        return nomeDaInstituicaoDeEnsino;
    }

    public void setNomeDaInstituicaoDeEnsino(String nomeDaInstituicaoDeEnsino) {
        this.nomeDaInstituicaoDeEnsino = nomeDaInstituicaoDeEnsino;
    }

    public CLT getOrientador() {
        return orientador;
    }

    public void setOrientador(CLT orientador) {
        this.orientador = orientador;
    }
}
