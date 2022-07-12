package Lista06.A;

import java.util.ArrayList;
import java.util.List;

public class Coordenadores extends Funcionarios {
    List professoresSupervisionados = new ArrayList();

     Coordenadores(String nome, String CPF, String numeroDeRegistro, String orgaoDeLotacao, double salario,List professoresSupervisionados ) {
        super(nome, CPF, numeroDeRegistro, orgaoDeLotacao, salario);
        this.professoresSupervisionados = professoresSupervisionados;

    }

    @Override
    public void aumentoSalario() {

    }
}
