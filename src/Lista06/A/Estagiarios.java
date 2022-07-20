package Lista06.A;

import java.util.ArrayList;
import java.util.HashSet;

public class Estagiarios extends Funcionarios {

    double bolsa = getSalario();



    public Estagiarios(String nome, String CPF, String numeroDeRegistro, String orgaoDeLotacao, double bolsa) {
        super(nome, CPF, numeroDeRegistro, orgaoDeLotacao, bolsa);
        this.bolsa = bolsa;

    }

    @Override
    public void aumentoSalario() {
        setBolsa(getBolsa() + (getBolsa()* 0.1));
        System.out.println("O novo salario de " +getNome() +" e " +getBolsa());

    }


    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }

}
