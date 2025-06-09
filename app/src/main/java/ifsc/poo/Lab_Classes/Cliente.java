package ifsc.poo.Lab_Classes;

import java.util.Queue;

public class Cliente extends Pessoa {
    protected static int proximoId = 1;
    protected final int id;
    protected String endereco;
    protected String telefone;
    protected String genero;
    protected String dataCadastro;
    
    public Cliente(String nome, String sobrenome, String cpf, Queue<String> emails, String endereco, String telefone, String genero, String dataCadastro) {
        super(nome, sobrenome, cpf, emails);
        this.id = proximoId++;
        this.endereco = endereco;
        this.telefone = telefone;
        this.genero = genero;
        this.dataCadastro = dataCadastro;
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

    @Override
    public String getResumo() {
        return " ID: " + getId() + "\n" + super.getResumo() + "\n Endereço: " + getEndereco() + "\n Telefone: " + getTelefone() + "\n Gênero: " + getGenero() + "\n Data de Cadastro: " + getDataCadastro();
    }

}
