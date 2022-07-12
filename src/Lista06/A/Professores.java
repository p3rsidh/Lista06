package Lista06.A;

public class Professores extends Funcionarios {

    private final String nivelGraduação;
    private final int quantidadeAlunos;
    private final String disciplina;
    private final int quantidadeTurmas;

    Professores(String nome, String CPF, String numeroDeRegistro, String orgaoDeLotacao, double salario, String nivelGraduacao, String disciplina, int quantidadeAlunos, int quantidadeTurma) {
        super(nome, CPF, numeroDeRegistro, orgaoDeLotacao, salario);
        this.nivelGraduação = nivelGraduacao;
        this.disciplina = disciplina;
        this.quantidadeAlunos = quantidadeAlunos;
        this.quantidadeTurmas = quantidadeTurma;

     }


    @Override
    public void aumentoSalario() {

    }
    public void adicionarTurma(){

    }

}
