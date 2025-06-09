package ifsc.poo.Lab_Classes.ClassesFuncionario.ClassesCLT;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

import ifsc.poo.Lab_Classes.ClassesFuncionario.CLT;
import ifsc.poo.Lab_Classes.ClassesFuncionario.Estagiario;

public class Senior extends CLT {
    protected double bonificacaoAnualFixa;
    protected List<Pleno> plenos;
    
    public Senior(String nome, String sobrenome, String cpf, Queue<String> emails, String dataInicioContrato, double salarioBrutoMensal, int cargaHorariaSemanal, String numeroCarteiraDeTrabalho, List<String> habilidades, List<Estagiario> estagiarios, double bonificacaoAnualFixa, List<Pleno> plenos) {
        super(nome, sobrenome, cpf, emails, dataInicioContrato, salarioBrutoMensal, cargaHorariaSemanal, numeroCarteiraDeTrabalho, habilidades, estagiarios);
        this.bonificacaoAnualFixa = bonificacaoAnualFixa;
        this.plenos = new ArrayList<>(plenos);
    }

    public double getBonificacaoAnualFixa() {
        return bonificacaoAnualFixa;
    }

    public void setBonificacaoAnualFixa(double bonificacaoAnualFixa) {
        this.bonificacaoAnualFixa = bonificacaoAnualFixa;
    }

    public List<Pleno> getPlenos() {
        return new ArrayList<>(plenos);
    }

    public void setPlenos(List<Pleno> plenos) {
        this.plenos = new ArrayList<>(plenos);
    }

    @Override
    public String getResumo() {
        return super.getResumo() + "\n Bonificação Anual Fixa: " + getBonificacaoAnualFixa() + "\n Plenos: " + getPlenos().size();
    }
    
}
