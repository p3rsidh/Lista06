package Lista06.A;

import java.util.ArrayList;
import java.util.HashSet;

public class Estagiarios implements AtualizacaoDeValoresAReceber{


    String nome, CPF, numeroDeRegistro, orgaoDeLotacao;
    double bolsa;

    public Estagiarios(String nome, String CPF, String numeroDeRegistro, String orgaoDeLotacao, double bolsa) {
        this.nome = nome;
        this.CPF = CPF;
        this.numeroDeRegistro = numeroDeRegistro;
        this.orgaoDeLotacao = orgaoDeLotacao;
        this.bolsa = bolsa;
    }

    @Override
    public void reembolsoDespesas() {
        System.out.println("Lembre-se que você apenas receberá um valor de até 85% do valor");
        System.out.println("Qual o valor sobre o qual pedirá valor?");
        double pedidoDeReembolso = 389;
        System.out.println(getNome() +" pediu reembolso de " +pedidoDeReembolso);
        double valorReembolsado = (pedidoDeReembolso * 0.85);
        System.out.println("Sera reembolsado um valor de: " +valorReembolsado);

    }

    void trocaValorDaBolsa(){
        System.out.println("A bolsa terá o seu valor alterado");
        System.out.println("Valor antigo: " +getBolsa());
        setBolsa(getBolsa() + getBolsa()* 0.5);
        System.out.println("0 novo valor da bolsa é de: " +getBolsa());

    }

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNumeroDeRegistro() {
        return numeroDeRegistro;
    }

    public void setNumeroDeRegistro(String numeroDeRegistro) {
        this.numeroDeRegistro = numeroDeRegistro;
    }

    public String getOrgaoDeLotacao() {
        return orgaoDeLotacao;
    }

    public void setOrgaoDeLotacao(String orgaoDeLotacao) {
        this.orgaoDeLotacao = orgaoDeLotacao;
    }
}
