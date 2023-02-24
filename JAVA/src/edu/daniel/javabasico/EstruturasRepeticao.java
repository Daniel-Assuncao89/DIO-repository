package edu.daniel.javabasico;

import java.util.Scanner;

public class EstruturasRepeticao {
    public static void NomeIdade() {
        Scanner scan = new Scanner(System.in);
        String nome;
        int idade;
        while (true) {
            System.out.println("Insira seu nome");
            nome = scan.next();
            if (nome.equals("0")) break;

            System.out.println("Insira sua idade");
            idade = scan.nextInt();
        }
    }

    public static void Nota() {
        Scanner scan = new Scanner(System.in);

        int nota;
        System.out.println("Inserir uma nota entre 0-10");
        nota = scan.nextInt();

        while (nota > 10 || nota < 0) {
            System.out.println("Nota inserida é invalida, por favor inseir um valor entre 0 e 10");
            nota = scan.nextInt();
        }
    }

    public static void MaiorMedia() {
        Scanner scan = new Scanner(System.in);

        int contador = 0, soma = 0, numeros, maiorNumero = 0;

        do {
            System.out.println("Insira o valor " + contador + ":");
            numeros = scan.nextInt();
            soma += numeros;

            if (numeros > maiorNumero) {
                maiorNumero = numeros;
            }

            contador++;
        } while (contador < 5);

        System.out.println("Maior numero:" + maiorNumero);
        System.out.println("Média dos numeros:" + (soma / 5));
    }

    public static void ParImpar(){
        Scanner scan = new Scanner(System.in);
        int numeros, qtdNumeros, contadorPar = 0, contadorImpar = 0;
        System.out.println("Quantidade de numeros?");
        qtdNumeros = scan.nextInt();
        do {
            System.out.println("Inseir o valor " + qtdNumeros + ":");
            numeros = scan.nextInt();

            if(numeros % 2 == 0){
                contadorPar++;
            } else {
                contadorImpar++;
            }
            qtdNumeros--;
        } while(qtdNumeros > 0);

        System.out.println("Quantidade de numeros pares: " + contadorPar);
        System.out.println("Quantidade de numeros impares: " + contadorImpar);
    }

    public static void Tabuada(){
        Scanner scan = new Scanner(System.in);

        int numero;

        System.out.println("Numero para tabuada?");
        numero = scan.nextInt();
        System.out.println("Tabuada do numero " + numero + ":");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + "x" + numero + " = " + (numero * i));
        }
    }

}