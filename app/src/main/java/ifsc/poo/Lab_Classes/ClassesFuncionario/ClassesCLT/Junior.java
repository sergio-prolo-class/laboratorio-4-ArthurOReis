package ifsc.poo.Lab_Classes.ClassesFuncionario.ClassesCLT;

import java.util.List;

import ifsc.poo.Lab_Classes.ClassesFuncionario.CLT;
import ifsc.poo.Lab_Classes.ClassesFuncionario.Estagiario;

public class Junior extends CLT {

    public Junior(String nome, String sobrenome, String cpf, String email, String dataInicioContrato, double salarioBrutoMensal, int cargaHorariaSemanal, String numeroCarteiraDeTrabalho, List<String> habilidades, List<Estagiario> estagiarios) {
        super(nome, sobrenome, cpf, email, dataInicioContrato, salarioBrutoMensal, cargaHorariaSemanal, numeroCarteiraDeTrabalho, habilidades, estagiarios);
    }
    
}
