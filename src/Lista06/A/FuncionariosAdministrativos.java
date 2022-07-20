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
        setSalario(getSalario() + (getSalario()* 0.1));
        System.out.println("O novo salario de " +getNome() +" e " +getSalario());
    }

    @Override
    public void reembolsoDespesas() {
        System.out.println("Lembre-se que você apenas receberá um valor de até 95% do valor");
        System.out.println("Qual o valor sobre o qual pedirá valor?");
        double pedidoDeReembolso = 1234;
        System.out.println(getNome() +" pediu reembolso de " +pedidoDeReembolso);
        double valorReembolsado = (pedidoDeReembolso * 0.95);
        System.out.println("Sera reembolsado um valor de: " +valorReembolsado);

    }

    public String getFuncaoAdministrativa() {
        return funcaoAdministrativa;
    }

    public void setFuncaoAdministrativa(String funcaoAdministrativa) {
        this.funcaoAdministrativa = funcaoAdministrativa;
    }

    public String getSenioridade() {
        return senioridade;
    }

    public void setSenioridade(String senioridade) {
        this.senioridade = senioridade;
    }
}
