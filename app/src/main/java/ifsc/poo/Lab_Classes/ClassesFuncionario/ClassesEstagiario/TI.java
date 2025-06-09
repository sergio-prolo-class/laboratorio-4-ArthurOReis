package ifsc.poo.Lab_Classes.ClassesFuncionario.ClassesEstagiario;

import java.util.Queue;

import ifsc.poo.Lab_Classes.ClassesFuncionario.CLT;
import ifsc.poo.Lab_Classes.ClassesFuncionario.Estagiario;

public class TI extends Estagiario {
    protected String numeroDaSerieComputador;
    protected boolean atuacaoRemotaPresenca;

    public TI(String nome, String sobrenome, String cpf, Queue<String> emails, String dataInicioContrato, double salarioBrutoMensal, int cargaHorariaSemanal, String nomeDaInstituicaoDeEnsino, boolean obrigatorio, CLT orientador, String numeroDaSerieComputador, boolean atuacaoRemotaPresenca){
        super(nome, sobrenome, cpf, emails, dataInicioContrato, salarioBrutoMensal, cargaHorariaSemanal, nomeDaInstituicaoDeEnsino, obrigatorio, orientador);
        this.numeroDaSerieComputador = numeroDaSerieComputador;
        this.atuacaoRemotaPresenca = atuacaoRemotaPresenca;
    }

    public String getNumeroDaSerieComputador() {
        return numeroDaSerieComputador;
    }

    public void setNumeroDaSerieComputador(String numeroDaSerieComputador) {
        this.numeroDaSerieComputador = numeroDaSerieComputador;
    }

    public boolean isAtuacaoRemotaPresenca() {
        return atuacaoRemotaPresenca;
    }

    public void setAtuacaoRemotaPresenca(boolean atuacaoRemotaPresenca) {
        this.atuacaoRemotaPresenca = atuacaoRemotaPresenca;
    }

    @Override
    public String getResumo() {
        return super.getResumo() + "\n Nº Série Computador: " + getNumeroDaSerieComputador() + "\n Atuação Remota/Presencial: " + (isAtuacaoRemotaPresenca() ? "Sim" : "Não");
    }

}
