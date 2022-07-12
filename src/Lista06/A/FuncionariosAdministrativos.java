package Lista06.A;

public class FuncionariosAdministrativos extends Funcionarios{
    String funcaoAdministrativa;
    String senioridade;
    protected FuncionariosAdministrativos(String nome, String CPF, String numeroDeRegistro, String orgaoDeLotacao, double salario, String funcaoAdministrativa, String senioridade) {
        super(nome, CPF, numeroDeRegistro, orgaoDeLotacao, salario);
        this.funcaoAdministrativa = funcaoAdministrativa;
        this.senioridade = senioridade;
    }
    FuncionariosAdministrativos funcionario1 = new FuncionariosAdministrativos("Carlos", "231413212", "001", "Clopos", 12.312, "Cobrador", "Pleno");
    @Override
    public void aumentoSalario() {
        setSalario(getSalario()* 0.1);
    }

}
