package ifsc.poo.Lab_Classes.ClassesFuncionario.ClassesTemporario;

import ifsc.poo.Lab_Classes.ClassesFuncionario.ClassesCLT.Pleno;

import java.util.Queue;

import ifsc.poo.Lab_Classes.ClassesFuncionario.Temporario;

public class Consultoria extends Temporario {
    protected int numeroRelatoriosParaEntregar;
    protected Pleno intermediario;

    public Consultoria(String nome, String sobrenome, String cpf, Queue<String> emails, String dataInicioContrato, String dataTerminoContrato, double valorTotalContrato, int numeroRelatoriosParaEntregar, Pleno intermediario) {
        super(nome, sobrenome, cpf, emails, dataInicioContrato, dataTerminoContrato, valorTotalContrato);
        this.numeroRelatoriosParaEntregar = numeroRelatoriosParaEntregar;
        this.intermediario = intermediario;
    }
    
    public int getNumeroRelatoriosParaEntregar() {
        return numeroRelatoriosParaEntregar;
    }

    public void setNumeroRelatoriosParaEntregar(int numeroRelatoriosParaEntregar) {
        this.numeroRelatoriosParaEntregar = numeroRelatoriosParaEntregar;
    }

    public Pleno getIntermediario() {
        return intermediario;
    }

    public void setIntermediario(Pleno intermediario) {
        this.intermediario = intermediario;
    }

    @Override
    public String getResumo() {
        return super.getResumo() + "\n Nº Relatórios: " + getNumeroRelatoriosParaEntregar() + "\n Intermediário (Pleno): " + (getIntermediario() != null ? getIntermediario().getResumo() : "Nenhum");
    }
    
}
