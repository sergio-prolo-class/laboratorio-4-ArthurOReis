package ifsc.poo.Lab_Classes.ClassesFuncionario.ClassesCLT;

import java.util.List;
import java.util.Queue;

import ifsc.poo.Lab_Classes.ClassesFuncionario.CLT;
import ifsc.poo.Lab_Classes.ClassesFuncionario.Estagiario;

public class Junior extends CLT {
    protected Pleno orientador;

    public Junior(String nome, String sobrenome, String cpf, Queue<String> emails, String dataInicioContrato, double salarioBrutoMensal, int cargaHorariaSemanal, String numeroCarteiraDeTrabalho, List<String> habilidades, List<Estagiario> estagiarios, Pleno orientador) {
        super(nome, sobrenome, cpf, emails, dataInicioContrato, salarioBrutoMensal, cargaHorariaSemanal, numeroCarteiraDeTrabalho, habilidades, estagiarios);
        this.orientador = orientador;
    }

    public Pleno getOrientador() {
        return orientador;
    }

    public void setOrientador(Pleno orientador) {
        this.orientador = orientador;
    }
    
    @Override
    public String getResumo() {
        return super.getResumo() + "\n Orientador (Pleno): " + (getOrientador() != null ? getOrientador().getResumo() : "Nenhum");
    }

}
