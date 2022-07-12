package Lista06.A;

import java.util.ArrayList;
import java.util.List;

public class Coordenadores extends Funcionarios {


   int professoresSupervisionados = 0;

     Coordenadores(String nome, String CPF, String numeroDeRegistro, String orgaoDeLotacao, double salario, int professoresSupervisionados) {
        super(nome, CPF, numeroDeRegistro, orgaoDeLotacao, salario);
        this.professoresSupervisionados = professoresSupervisionados;
    }

    @Override
    public void aumentoSalario() {
        setSalario(getSalario() + (getSalario()* 0.05));
        System.out.println("O novo salario de " +getNome() +" e " +getSalario());

    }
    public void adicionarProfessor(){
       if (professoresSupervisionados == 5){
        System.out.println("Não podem ser adicionados mais professores, voce so pode supervisionar ate 5 professores.");
        } else {
       System.out.println("Novo professor adicionado");
        professoresSupervisionados += 1;
    }}

    public int getProfessoresSupervisionados() {
        return professoresSupervisionados;
    }

    public void setProfessoresSupervisionados(int professoresSupervisionados) {
        this.professoresSupervisionados = professoresSupervisionados;
    }
}
