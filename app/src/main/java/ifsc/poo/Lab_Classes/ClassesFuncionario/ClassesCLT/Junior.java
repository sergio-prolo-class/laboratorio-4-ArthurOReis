package ifsc.poo.Lab_Classes.ClassesFuncionario.ClassesCLT;

import java.util.List;

import ifsc.poo.Lab_Classes.ClassesFuncionario.CLT;
import ifsc.poo.Lab_Classes.ClassesFuncionario.Estagiario;

public class Junior extends CLT {
    private Pleno orientador;

    public Junior(String nome, String sobrenome, String cpf, String email, String dataInicioContrato, double salarioBrutoMensal, int cargaHorariaSemanal, String numeroCarteiraDeTrabalho, List<String> habilidades, List<Estagiario> estagiarios, Pleno orientador) {
        super(nome, sobrenome, cpf, email, dataInicioContrato, salarioBrutoMensal, cargaHorariaSemanal, numeroCarteiraDeTrabalho, habilidades, estagiarios);
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
        return super.getResumo() + ", Orientador (Pleno): " + (getOrientador() != null ? getOrientador().getResumo() : "Nenhum");
    }

}
