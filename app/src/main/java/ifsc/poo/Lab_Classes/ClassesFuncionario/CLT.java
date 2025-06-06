package ifsc.poo.Lab_Classes.ClassesFuncionario;

import java.util.ArrayList;
import java.util.List;

import ifsc.poo.Lab_Classes.Funcionario;

public class CLT extends Funcionario {
    private double salarioBrutoMensal;
    private int cargaHorariaSemanal;
    private String numeroCarteiraDeTrabalho;
    private List<String> habilidades;
    
    public CLT(String nome, String sobrenome, String cpf, String email, String dataInicioContrato, double salarioBrutoMensal, int cargaHorariaSemanal, String numeroCarteiraDeTrabalho, List<String> habilidades){
        super(nome, sobrenome, cpf, email, dataInicioContrato);
        this.salarioBrutoMensal = salarioBrutoMensal;
        this.cargaHorariaSemanal = cargaHorariaSemanal;
        this.numeroCarteiraDeTrabalho = numeroCarteiraDeTrabalho;
        this.habilidades = new ArrayList<>(habilidades);
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

    public String getNumeroCarteiraDeTrabalho() {
        return numeroCarteiraDeTrabalho;
    }

    public void setNumeroCarteiraDeTrabalho(String numeroCarteiraDeTrabalho) {
        this.numeroCarteiraDeTrabalho = numeroCarteiraDeTrabalho;
    }

    public List<String> getHabilidades() {
        return new ArrayList<>(habilidades);
    }

    public void setHabilidades(List<String> habilidades) {
        this.habilidades = new ArrayList<>(habilidades);
    }

}
