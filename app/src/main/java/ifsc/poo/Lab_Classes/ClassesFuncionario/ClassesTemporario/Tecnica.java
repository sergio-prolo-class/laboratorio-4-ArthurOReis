package ifsc.poo.Lab_Classes.ClassesFuncionario.ClassesTemporario;

import java.util.ArrayList;
import java.util.List;

import ifsc.poo.Lab_Classes.ClassesFuncionario.Temporario;

public class Tecnica extends Temporario {
    private boolean necessidadeEPIs;
    private List<String> turnosDeTrabalho; 

    public Tecnica(String nome, String sobrenome, String cpf, String email, String dataInicioContrato, String dataTerminoContrato, double valorTotalContrato, boolean necessidadeEPIs, List<String> turnosDeTrabalho) {
        super(nome, sobrenome, cpf, email, dataInicioContrato, dataTerminoContrato, valorTotalContrato);
        this.necessidadeEPIs = necessidadeEPIs;
        this.turnosDeTrabalho = new ArrayList<>(turnosDeTrabalho);
    }

    public boolean isNecessidadeEPIs() {
        return necessidadeEPIs;
    }

    public void setNecessidadeEPIs(boolean necessidadeEPIs) {
        this.necessidadeEPIs = necessidadeEPIs;
    }

    public List<String> getTurnosDeTrabalho() {
        return new ArrayList<>(turnosDeTrabalho);
    }

    public void setTurnosDeTrabalho(List<String> turnosDeTrabalho) {
        this.turnosDeTrabalho = new ArrayList<>(turnosDeTrabalho);
    }

    @Override
    public String getResumo() {
        return super.getResumo() + ", Necessidade EPIs: " + (isNecessidadeEPIs() ? "Sim" : "Não") + ", Turnos de Trabalho: " + getTurnosDeTrabalho();
    }

}
