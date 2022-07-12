package Lista06.A;

public class FuncionariosAdministrativos extends Funcionarios{
    String funcaoAdministrativa;
    String senioridade;
    protected FuncionariosAdministrativos(String nome, String CPF, String numeroDeRegistro, String orgaoDeLotacao, double salario, String funcaoAdministrativa, String senioridade) {
        super(nome, CPF, numeroDeRegistro, orgaoDeLotacao, salario);
        this.funcaoAdministrativa = funcaoAdministrativa;
        this.senioridade = senioridade;
    }

    @Override
    public void aumentoSalario() {

    }
    public void adicionarProfessor(){

    }
}
