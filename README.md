# Lista06

LISTA DE EXERCÍCIOS 006A - Entregar

Modele as classes referentes aos funcionários de uma universidade, que serão os professores, coordenadores e funcionários administrativos.
Os atributos comuns de todos os funcionários são: Nome, CPF, número de registro, órgão de lotação e salário.
Os professores possuem os atributos: Nível de graduação, disciplina ministrada , quantidade de alunos e quantidade de turmas.
Os coordenadores possuem os atributos: ProfessoresSupervisionados
Os funcionários administrativos possuem os atributos: Função Administrativa e Senioridade.
Implemente, além dos getters e setters e os construtores, os seguintes métodos:
aumentoSalario: para todos menos os coordenadores aumenta o salário em 10% e para os coordenadores o aumento é de 5%.
adicionaTurma: para os professores.
adicionaProfessor (para os coordenadores): Para adicionar um professor na lista de professores supervisionados.

LEVEL UP
Crie uma classe turma, que se tornará uma caraterística dos professores por meio de composição.
Limite a quantidade de professores supervisionados na classe coordenador.

Como entregar os exercícios:
Documentar a entrega marcando no classroom e adicionar o link do repositório do GitHub contendo o código do desafio e a descrição do projeto no arquivo Readme.md, ou seja, você irá criar um repositório para essa aula e mandar o link dele, com os exercícios finalizados, via classroom.
Lembrando que essa lista tem partes A e B e a entrega deve contemplar as duas partes.
