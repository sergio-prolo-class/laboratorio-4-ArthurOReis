package ifsc.poo.Lab_Classes;

public class Cliente extends Pessoa {
    private static int proximoId = 1;
    private final int id;
    private String endereco;
    private String telefone;
    private String genero;
    private String dataCadastro;
    private String dataInicioPremium;
    private boolean premium;
    private double pagamentoMensal;
    Funcionario representante;
    
    public Cliente(String nome, String sobrenome, String cpf, String email, String endereco, String telefone, String genero, String dataCadastro, String dataInicioPremium, boolean premium, double pagamentoMensal, Funcionario representante) {
        super(nome, sobrenome, cpf, email);
        this.id = proximoId++;
        this.endereco = endereco;
        this.telefone = telefone;
        this.genero = genero;
        this.dataCadastro = dataCadastro;
        this.dataInicioPremium = dataInicioPremium;
        this.premium = premium;
        this.pagamentoMensal = pagamentoMensal;
        this.representante = representante;
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

    public Funcionario getRepresentante() {
        return representante;
    }

    public void setRepresentante(Funcionario representante) {
        this.representante = representante;
    }
}
