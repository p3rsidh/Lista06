package Lista06.A;

import java.util.ArrayList;
import java.util.List;

public class Professores extends Funcionarios {

    private final String nivelGraduação;
    private final int quantidadeAlunos;
    private final String disciplina;
    private int quantidadeTurmas;

    ArrayList<Estagiarios> estagiariosSupervisionados = new ArrayList<>();
    int limiteSupervisionados;


    Professores(String nome, String CPF, String numeroDeRegistro, String orgaoDeLotacao, double salario, String nivelGraduacao, String disciplina, int quantidadeAlunos, int quantidadeTurma) {
        super(nome, CPF, numeroDeRegistro, orgaoDeLotacao, salario);
        this.nivelGraduação = nivelGraduacao;
        this.disciplina = disciplina;
        this.quantidadeAlunos = quantidadeAlunos;
        this.quantidadeTurmas = quantidadeTurma;


    }


    @Override
    public void aumentoSalario() {
        setSalario(getSalario() + (getSalario() * 0.1));
        System.out.println("Novo salario de " + getNome() + " e " + getSalario());
    }

    @Override
    public void reembolsoDespesas() {
        System.out.println("Lembre-se que você apenas receberá um valor de até 95% do valor");
        System.out.println("Qual o valor sobre o qual pedirá valor?");
        double pedidoDeReembolso = 6456;
        System.out.println(getNome() +" pediu reembolso de " +pedidoDeReembolso);
        double valorReembolsado = (pedidoDeReembolso * 0.95);
        System.out.println("Sera reembolsado um valor de: " +valorReembolsado);

    }

    public void adicionarTurma() {
        setQuantidadeTurmas(getQuantidadeTurmas() + 1);
        System.out.println("Turma adicionada, agora sao " + quantidadeTurmas + " turmas");

    }
    void adicionarEstagiario(){
        if(estagiariosSupervisionados.size() < 3){
            System.out.println("Estagiario adicionado");
            estagiariosSupervisionados.add(new Estagiarios("Livio", "4234235", "2342342", "Mina", 100));
        } else {
            System.out.println("Pedido rejeitado");
            System.out.println("Não podem ser adicionados mais do que 3 estagiarios supervisionados");
        }

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