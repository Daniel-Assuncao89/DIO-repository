package edu.daniel.javabasico.metodos;

public class Exercicio1 {

    public void operacoesBasicas(double valor1, double valor2){
        double soma = valor1 + valor2;
        double subtracao = valor1 - valor2;
        double multiplicacao = valor1 * valor2;
        double divisao = valor1 / valor2;

        System.out.println("Soma: " + soma);
        System.out.println("Subtracao: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
    }

    public void saudacao(int tempo){
        if(tempo > 23 || tempo < 0){
            throw new RuntimeException("Hora invalida");
        }else if(tempo > 0 && tempo < 12){
            System.out.println("Bom dia");
        }else if(tempo > 12 && tempo < 18){
            System.out.println("Boa tarde");
        }else if(tempo > 18 && tempo < 24){
            System.out.println("Boa noite");
        }
    }

    public void emprestimo(double valor){
        double taxa;
        if(valor > 0 && valor < 10000){
            taxa = 0.2;
        }else if(valor > 10000 && valor < 20000){
            taxa = 0.4;
        }else if(valor > 20000 && valor < 30000){
            taxa = 0.6;
        }else {
            taxa = 0.8;
        }

        System.out.println("Valor do emprestimo:" + valor + "\nValor da taxa de juros: " + (valor * taxa));
    }
}
