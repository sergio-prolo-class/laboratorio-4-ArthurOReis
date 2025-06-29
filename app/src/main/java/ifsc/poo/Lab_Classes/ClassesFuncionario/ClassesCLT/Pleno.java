package ifsc.poo.Lab_Classes.ClassesFuncionario.ClassesCLT;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

import ifsc.poo.Lab_Classes.ClassesFuncionario.CLT;
import ifsc.poo.Lab_Classes.ClassesFuncionario.Estagiario;

public class Pleno extends CLT {
    protected Senior chefe;
    protected List<Junior> juniors;

    public Pleno(String nome, String sobrenome, String cpf, Queue<String> emails, String dataInicioContrato, double salarioBrutoMensal, int cargaHorariaSemanal, String numeroCarteiraDeTrabalho, List<String> habilidades, List<Estagiario> estagiarios, Senior chefe, List<Junior> juniors) {
        super(nome, sobrenome, cpf, emails, dataInicioContrato, salarioBrutoMensal, cargaHorariaSemanal, numeroCarteiraDeTrabalho, habilidades, estagiarios);
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
        return super.getResumo() + "\n Chefe (Senior): " + (getChefe() != null ? getChefe().getResumo() : "Nenhum") + "\n Juniors: " + getJuniors().size();
    }

}
