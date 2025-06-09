package ifsc.poo.Lab_Classes;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Pessoa {
    protected String nome;
    protected String sobrenome;
    protected String cpf;
    protected Queue<String> emails;

    public Pessoa(String nome, String sobrenome, String cpf, Queue<String> emails){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.emails = new LinkedList<>(emails);
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
    
    public Queue<String> getEmails(){
        return this.emails;
    }

    public void addEmails(String... emails){
        this.emails.addAll(Arrays.asList(emails));
    }
    
    public void removeEmails(String... emails){
        this.emails.removeAll(Arrays.asList(emails));
    }

    public String getResumo() {
        return " Nome: " + getNome() + "\n Sobrenome: " + getSobrenome() + "\n CPF: " + getCPF() + "\n Emails: " + getEmails();
    }

}
