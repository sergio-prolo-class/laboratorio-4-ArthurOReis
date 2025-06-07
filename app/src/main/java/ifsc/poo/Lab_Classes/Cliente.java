package ifsc.poo.Lab_Classes;

import ifsc.poo.Lab_Classes.ClassesFuncionario.ClassesCLT.Senior;

public class Cliente extends Pessoa {
    protected static int proximoId = 1;
    protected final int id;
    protected String endereco;
    protected String telefone;
    protected String genero;
    protected String dataCadastro;
    protected String dataInicioPremium;
    protected boolean premium;
    protected double pagamentoMensal;
    protected Senior representante;
    
    public Cliente(String nome, String sobrenome, String cpf, String email, String endereco, String telefone, String genero, String dataCadastro, String dataInicioPremium, boolean premium, double pagamentoMensal, Senior representante) {
        super(nome, sobrenome, cpf, email);
        this.id = proximoId++;
        this.endereco = endereco;
        this.telefone = telefone;
        this.genero = genero;
        this.dataCadastro = dataCadastro;
        this.premium = premium;
        if (premium) {
            this.dataInicioPremium = dataInicioPremium;
            this.pagamentoMensal = pagamentoMensal;
            this.representante = representante;
        } else {
            this.dataInicioPremium = null;
            this.pagamentoMensal = 0;
            this.representante = null;
        }
    }

    public int getId() {
        return id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getDataInicioPremium() {
        return dataInicioPremium;
    }

    public void setDataInicioPremium(String dataInicioPremium) {
        this.dataInicioPremium = dataInicioPremium;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
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
        String resumo = " ID: " + getId() + "\n" + super.getResumo() + "\n Endereço: " + getEndereco() + "\n Telefone: " + getTelefone() + "\n Gênero: " + getGenero() + "\n Data de Cadastro: " + getDataCadastro();
        if (isPremium()) {
            resumo += "\n Premium: Sim" + "\n Data Início Premium: " + getDataInicioPremium() + "\n Pagamento Mensal: " + getPagamentoMensal() + "\n Representante: " + (getRepresentante() != null ? getRepresentante().getResumo() : "Nenhum");
        } else {
            resumo += "\n Premium: Não";
        }
        return resumo;
    }

}
