package Lista06.A;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FuncionariosAdministrativos funcionario1 = new FuncionariosAdministrativos("Carlos", "231413212", "001", "Clopos", 12.312, "Cobrador", "Pleno");
        Professores prof1 = new Professores("Claudio", "235245t43", "098", "Lindeia", 12.983, "Pos", "Fisiologia", 76, 5);
        Professores prof2 = new Professores("Braulio", "567456563", "099", "Saphra", 12.983, "Pos", "Portugues", 87, 8);
        Professores prof3 = new Professores("Santini", "345346634", "100", "Zano", 12.983, "Pos", "Fisica", 79, 6);
        Coordenadores Coordenador1 = new Coordenadores("Balungo", "4365634241", "321", "Ploc", 10000, prof1);
        Coordenador1.professoresSupervisionados.add(prof2);
        Coordenador1.professoresSupervisionados.add(prof3);

        //Professor
        System.out.println(prof1.getNome());
        System.out.println("Salario : "  +prof1.getSalario());
        System.out.println("Recebe aumento");
        prof1.aumentoSalario();
        prof1.adicionarTurma();
        System.out.println("___________________________");
        //Coordenador
        System.out.println(Coordenador1.getNome());
        System.out.println("Salario : "  +Coordenador1.getSalario());
        System.out.println("Recebe aumento");
        Coordenador1.aumentoSalario();
        Coordenador1.adicionarProfessor();
        Coordenador1.adicionarProfessor();
        System.out.println("___________________________");
        //FuncionarioAdm
        funcionario1.getNome();
        System.out.println(funcionario1.getNome());
        System.out.println("Salario : "  +funcionario1.getSalario());
        System.out.println("Recebe aumento");
        funcionario1.aumentoSalario();


    }
}
