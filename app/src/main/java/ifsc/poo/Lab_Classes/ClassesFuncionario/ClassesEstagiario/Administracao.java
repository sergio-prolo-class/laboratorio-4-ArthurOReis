package ifsc.poo.Lab_Classes.ClassesFuncionario.ClassesEstagiario;

import ifsc.poo.Lab_Classes.ClassesFuncionario.CLT;
import ifsc.poo.Lab_Classes.ClassesFuncionario.Estagiario;

public class Administracao extends Estagiario {
    private String setorAtual;
    private String descricaoTarefaPrincipal;

    public Administracao(String nome, String sobrenome, String cpf, String email, String dataInicioContrato, double salarioBrutoMensal, int cargaHorariaSemanal, String nomeDaInstituicaoDeEnsino, CLT orientador, String setorAtual, String descricaoTarefaPrincipal){
        super(nomeDaInstituicaoDeEnsino, nomeDaInstituicaoDeEnsino, nomeDaInstituicaoDeEnsino, nomeDaInstituicaoDeEnsino, nomeDaInstituicaoDeEnsino, cargaHorariaSemanal, cargaHorariaSemanal, nomeDaInstituicaoDeEnsino, orientador);
        this.setorAtual = setorAtual;
        this.descricaoTarefaPrincipal = descricaoTarefaPrincipal;
    }
    
    public String getSetorAtual() {
        return setorAtual;
    }

    public void setSetorAtual(String setorAtual) {
        this.setorAtual = setorAtual;
    }

    public String getDescricaoTarefaPrincipal() {
        return descricaoTarefaPrincipal;
    }

    public void setDescricaoTarefaPrincipal(String descricaoTarefaPrincipal) {
        this.descricaoTarefaPrincipal = descricaoTarefaPrincipal;
    }
    
}
