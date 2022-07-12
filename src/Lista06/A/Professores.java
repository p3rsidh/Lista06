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
    Professores prof1 = new Professores("Claudio", "235245t43","098", "Lindeia", 12.983, "Pos", "Fisiologia", 76, 5);

    @Override
    public void aumentoSalario() {
        setSalario(getSalario()* 0.1);
    }
    public void adicionarTurma(){
        prof1.quantidadeTurmas =+ 1;

    }

}
