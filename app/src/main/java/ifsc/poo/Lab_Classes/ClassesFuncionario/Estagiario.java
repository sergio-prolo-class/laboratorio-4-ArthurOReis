package ifsc.poo.Lab_Classes.ClassesFuncionario;

import ifsc.poo.Lab_Classes.Funcionario;

public class Estagiario extends Funcionario {
    protected double salarioBrutoMensal;
    protected int cargaHorariaSemanal;
    protected String nomeDaInstituicaoDeEnsino;
    protected boolean obrigatorio;
    protected CLT orientador;
    
    public Estagiario(String nome, String sobrenome, String cpf, String email, String dataInicioContrato, double salarioBrutoMensal, int cargaHorariaSemanal, String nomeDaInstituicaoDeEnsino, boolean obrigatorio, CLT orientador){
        super(nome, sobrenome, cpf, email, dataInicioContrato);
        this.salarioBrutoMensal = salarioBrutoMensal;
        this.cargaHorariaSemanal = cargaHorariaSemanal;
        this.nomeDaInstituicaoDeEnsino = nomeDaInstituicaoDeEnsino;
        this.obrigatorio = obrigatorio;
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


    public boolean isObrigatorio() {
        return obrigatorio;
    }
    
    public void setObrigatorio(boolean obrigatorio) {
        this.obrigatorio = obrigatorio;
    }

    public CLT getOrientador() {
        return orientador;
    }

    public void setOrientador(CLT orientador) {
        this.orientador = orientador;
    }

    @Override
    public String getResumo() {
        return super.getResumo() + "\n Salário Bruto Mensal: " + getSalarioBrutoMensal() + "\n Carga Horária Semanal: " + getCargaHorariaSemanal() + "\n Instituição de Ensino: " + getNomeDaInstituicaoDeEnsino() + "\n Obrigatório: " + isObrigatorio() + "\n Orientador (CLT): " + (getOrientador() != null ? getOrientador().getResumo() : "Nenhum");
    }

}
