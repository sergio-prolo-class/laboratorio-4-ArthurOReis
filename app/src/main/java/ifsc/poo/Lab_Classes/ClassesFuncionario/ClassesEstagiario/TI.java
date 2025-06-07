package ifsc.poo.Lab_Classes.ClassesFuncionario.ClassesEstagiario;

import ifsc.poo.Lab_Classes.ClassesFuncionario.CLT;
import ifsc.poo.Lab_Classes.ClassesFuncionario.Estagiario;

public class TI extends Estagiario {
    private String numeroDaSerieComputador;
    private boolean atuacaoRemotaPresenca;

    public TI(String nome, String sobrenome, String cpf, String email, String dataInicioContrato, double salarioBrutoMensal, int cargaHorariaSemanal, String nomeDaInstituicaoDeEnsino, CLT orientador, String numeroDaSerieComputador, boolean atuacaoRemotaPresenca){
        super(nomeDaInstituicaoDeEnsino, nomeDaInstituicaoDeEnsino, nomeDaInstituicaoDeEnsino, nomeDaInstituicaoDeEnsino, nomeDaInstituicaoDeEnsino, cargaHorariaSemanal, cargaHorariaSemanal, nomeDaInstituicaoDeEnsino, orientador);
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
}
