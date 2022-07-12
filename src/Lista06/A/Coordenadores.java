package Lista06.A;

import java.util.ArrayList;
import java.util.List;

public class Coordenadores extends Funcionarios {
    List professoresSupervisionados = new ArrayList();


     Coordenadores(String nome, String CPF, String numeroDeRegistro, String orgaoDeLotacao, double salario,List professoresSupervisionados ) {
        super(nome, CPF, numeroDeRegistro, orgaoDeLotacao, salario);
        this.professoresSupervisionados = professoresSupervisionados;

    }
        Coordenadores Cordenador1 = new Coordenadores("Balungo", "4365634241", "321", "Ploc", 10000, professoresSupervisionados);
    @Override
    public void aumentoSalario() {
        setSalario(getSalario()* 0.05);

    }

    public void adicionarProfessor(){
        if (professoresSupervisionados.size() > 5){
            System.out.println("Não podem ser adicionados mais professores");
        } else {
        Professores profAdd = new Professores("Roberta", "123109872", "432", "Taubate", 123.345, "Graduacao", "Historia", 25, 2);
        professoresSupervisionados.add(profAdd);
    }}
}
