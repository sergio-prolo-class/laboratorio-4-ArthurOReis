package ifsc.poo.Lab_Classes;

import java.util.Queue;
import ifsc.poo.Lab_Classes.ClassesFuncionario.ClassesCLT.Senior;

public class ClientePremium extends Cliente {
    protected String dataInicioPremium;
    protected double pagamentoMensal;
    protected Senior representante;

    public ClientePremium(String nome, String sobrenome, String cpf, Queue<String> emails, String endereco, String telefone, String genero, String dataCadastro, String dataInicioPremium, double pagamentoMensal, Senior representante) {
        super(nome, sobrenome, cpf, emails, endereco, telefone, genero, dataCadastro);
        this.dataInicioPremium = dataInicioPremium;
        this.pagamentoMensal = pagamentoMensal;
        this.representante = representante;
    }

    public String getDataInicioPremium() {
        return dataInicioPremium;
    }

    public void setDataInicioPremium(String dataInicioPremium) {
        this.dataInicioPremium = dataInicioPremium;
    }

    public double getPagamentoMensal() {
        return pagamentoMensal;
    }

    public void setPagamentoMensal(double pagamentoMensal) {
        this.pagamentoMensal = pagamentoMensal;
    }

    public Senior getRepresentante() {
        return representante;
    }

    public void setRepresentante(Senior representante) {
        this.representante = representante;
    }

    @Override
    public String getResumo() {
        return super.getResumo() + "\n Premium: Sim" + "\n Data Início Premium: " + getDataInicioPremium() + "\n Pagamento Mensal: " + getPagamentoMensal() + "\n Representante: " + (getRepresentante() != null ? getRepresentante().getResumo() : "Nenhum");
    }
}
