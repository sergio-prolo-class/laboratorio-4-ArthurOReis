package ifsc.poo.Lab_Classes;

public class Pessoa {
    protected String nome;
    protected String sobrenome;
    protected String cpf;
    protected String email;

    public Pessoa(String nome, String sobrenome, String cpf, String email){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.email = email;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getSobrenome(){
        return this.sobrenome;
    }

    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    
    public String getCPF(){
        return this.cpf;
    }

    public void setCPF(String cpf){
        this.cpf = cpf;
    }
    
    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getResumo() {
        return " Nome: " + getNome() + "\n Sobrenome: " + getSobrenome() + "\n CPF: " + getCPF() + "\n Email: " + getEmail();
    }

}
