package ifsc.poo.Lab_Classes.ClassesFuncionario.ClassesEstagiario;

import ifsc.poo.Lab_Classes.ClassesFuncionario.CLT;
import ifsc.poo.Lab_Classes.ClassesFuncionario.Estagiario;

public class Administracao extends Estagiario {
    protected String setorAtual;
    protected String descricaoTarefaPrincipal;

    public Administracao(String nome, String sobrenome, String cpf, String email, String dataInicioContrato, double salarioBrutoMensal, int cargaHorariaSemanal, String nomeDaInstituicaoDeEnsino, boolean obrigatorio, CLT orientador, String setorAtual, String descricaoTarefaPrincipal){
        super(nome, sobrenome, cpf, email, dataInicioContrato, salarioBrutoMensal, cargaHorariaSemanal, nomeDaInstituicaoDeEnsino, obrigatorio, orientador);
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

    @Override
    public String getResumo() {
        return super.getResumo() + "\n Setor Atual: " + getSetorAtual() + "\n Tarefa Principal: " + getDescricaoTarefaPrincipal();
    }
    
}
