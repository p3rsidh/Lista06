package Lista06.A;

import java.util.HashSet;
import java.util.Iterator;

public class Coordenadores extends Funcionarios {

    HashSet<Professores> professoresSupervisionados = new HashSet<Professores>();

    Coordenadores(String nome, String CPF, String numeroDeRegistro, String orgaoDeLotacao, double salario, Professores professoresSupervisionados) {
        super(nome, CPF, numeroDeRegistro, orgaoDeLotacao, salario);

    }

    @Override
    public void aumentoSalario() {
        setSalario(getSalario() + (getSalario() * 0.05));
        System.out.println("O novo salario de " + getNome() + " e " + getSalario());

    }

    public void adicionarProfessor() {
        if (getProfessoresSupervisionados().size() >= 3) {
            System.out.println("Não podem ser adicionados mais professores, voce so pode supervisionar ate 4 professores.");
        } else {
            System.out.println("Novo professor adicionado");
            professoresSupervisionados.add(new Professores("Flavio", "12312441", "321", "Flanco", 312.432, "Pos", "Biologia", 7, 2));
        }
    }

    public HashSet<Professores> getProfessoresSupervisionados() {
        return professoresSupervisionados;
    }

    public void setProfessoresSupervisionados(HashSet<Professores> professoresSupervisionados) {
        this.professoresSupervisionados = professoresSupervisionados;
    }
}
