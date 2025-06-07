package ifsc.poo.Lab_Classes.ClassesFuncionario.ClassesCLT;

import java.util.ArrayList;
import java.util.List;

import ifsc.poo.Lab_Classes.ClassesFuncionario.CLT;
import ifsc.poo.Lab_Classes.ClassesFuncionario.Estagiario;

public class Senior extends CLT {
    private double bonificacaoAnualFixa;
    private List<Pleno> plenos;
    
    public Senior(String nome, String sobrenome, String cpf, String email, String dataInicioContrato, double salarioBrutoMensal, int cargaHorariaSemanal, String numeroCarteiraDeTrabalho, List<String> habilidades, List<Estagiario> estagiarios, double bonificacaoAnualFixa, List<Pleno> plenos) {
        super(nome, sobrenome, cpf, email, dataInicioContrato, salarioBrutoMensal, cargaHorariaSemanal, numeroCarteiraDeTrabalho, habilidades, estagiarios);
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
    
}
