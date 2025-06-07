package ifsc.poo.Lab_Classes.ClassesFuncionario.ClassesTemporario;

import ifsc.poo.Lab_Classes.ClassesFuncionario.ClassesCLT.Pleno;
import ifsc.poo.Lab_Classes.ClassesFuncionario.Temporario;

public class Consultoria extends Temporario {
    private int numeroRelatoriosParaEntregar;
    private Pleno intermediario;

    public Consultoria(String nome, String sobrenome, String cpf, String email, String dataInicioContrato, String dataTerminoContrato, double valorTotalContrato, int numeroRelatoriosParaEntregar, Pleno intermediario) {
        super(nome, sobrenome, cpf, email, dataInicioContrato, dataTerminoContrato, valorTotalContrato);
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
        return super.getResumo() + ", Nº Relatórios: " + getNumeroRelatoriosParaEntregar() + ", Intermediário (Pleno): " + (getIntermediario() != null ? getIntermediario().getResumo() : "Nenhum");
    }
    
}
