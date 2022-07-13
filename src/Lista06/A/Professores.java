package Lista06.A;

import java.util.ArrayList;
import java.util.List;

public class Professores extends Funcionarios {

    private final String nivelGraduação;
    private final int quantidadeAlunos;
    private final String disciplina;
    private int quantidadeTurmas;



    Professores(String nome, String CPF, String numeroDeRegistro, String orgaoDeLotacao, double salario, String nivelGraduacao, String disciplina, int quantidadeAlunos, int quantidadeTurma) {
        super(nome, CPF, numeroDeRegistro, orgaoDeLotacao, salario);
        this.nivelGraduação = nivelGraduacao;
        this.disciplina = disciplina;
        this.quantidadeAlunos = quantidadeAlunos;
        this.quantidadeTurmas = quantidadeTurma;
        ;

    }


    @Override
    public void aumentoSalario() {
        setSalario(getSalario() + (getSalario() * 0.1));
        System.out.println("Novo salario de " + getNome() + " e " + getSalario());
    }

    public void adicionarTurma() {
        setQuantidadeTurmas(getQuantidadeTurmas() + 1);
        System.out.println("Turma adicionada, agora sao " + quantidadeTurmas + " turmas");

    }

    public String getNivelGraduação() {
        return nivelGraduação;
    }

    public int getQuantidadeAlunos() {
        return quantidadeAlunos;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public int getQuantidadeTurmas() {
        return quantidadeTurmas;
    }

    public void setQuantidadeTurmas(int quantidadeTurmas) {
        this.quantidadeTurmas = quantidadeTurmas;
    }


}