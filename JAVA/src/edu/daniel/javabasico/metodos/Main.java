package edu.daniel.javabasico.metodos;

public class Main {
    public static void main(String[] args) {
        Exercicio1 testador = new Exercicio1();

        testador.operacoesBasicas(4,2);
        testador.saudacao(14);
        testador.emprestimo(5000);

        testador.area(5);
        testador.area(5.0,5.0);
        testador.area(3,4,5);
        testador.area(2f,2f);
    }
}
