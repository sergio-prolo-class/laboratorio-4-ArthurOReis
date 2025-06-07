package ifsc.poo.Lab_Classes.ClassesFuncionario.ClassesCLT;

import java.util.ArrayList;
import java.util.List;

import ifsc.poo.Lab_Classes.ClassesFuncionario.CLT;
import ifsc.poo.Lab_Classes.ClassesFuncionario.Estagiario;

public class Pleno extends CLT {
    private Senior chefe;
    private List<Junior> juniors;

    public Pleno(String nome, String sobrenome, String cpf, String email, String dataInicioContrato, double salarioBrutoMensal, int cargaHorariaSemanal, String numeroCarteiraDeTrabalho, List<String> habilidades, List<Estagiario> estagiarios, Senior chefe, List<Junior> juniors) {
        super(nome, sobrenome, cpf, email, dataInicioContrato, salarioBrutoMensal, cargaHorariaSemanal, numeroCarteiraDeTrabalho, habilidades, estagiarios);
        this.chefe = chefe;
        this.juniors = new ArrayList<>(juniors);
    }

    public Senior getChefe() {
        return chefe;
    }

    public void setChefe(Senior chefe) {
        this.chefe = chefe;
    }

    public List<Junior> getJuniors() {
        return new ArrayList<>(juniors);
    }

    public void setJuniors(List<Junior> juniors) {
        this.juniors = new ArrayList<>(juniors);
    }
    
    @Override
    public String getResumo() {
        return super.getResumo() + ", Chefe (Senior): " + (getChefe() != null ? getChefe().getResumo() : "Nenhum") + ", Juniors: " + getJuniors().size();
    }

}
