package edu.daniel.javabasico;

import java.util.Random;
import java.util.Scanner;

public class ExercicioArray {
    public static void OrdemInversa() {
        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Inserir valor " + (i + 1));
            numeros[i] = scan.nextInt();
        }

        for (int i = numeros.length - 1; i > 0; i--) { // O -1 se fez necessario pelo tamanho recebido em "numeros.length"
            System.out.println(numeros[i]);
        }
    }
    public static void Consoantes() {
        Scanner scan = new Scanner(System.in);
        String letra;
        String[] consoantes = new String[6];
        int qtdConsoante = 0;

        for (int i = 0; i < consoantes.length; i++) {
            System.out.println("Preencha a letra " + i + ":");
            letra = scan.next();

            if ( !(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u")) ) {
                consoantes[i] = letra;
                qtdConsoante++;
            }
        }

        for (String consoante : consoantes) {
            if( consoante != null)
                System.out.print(consoante + " ");
        }
        System.out.println("Quantidade de consoantes: " + qtdConsoante);
    }
    public static void NumerosAleatorios(){
        Random random = new Random();
        int[] numeros = new int[20];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100);
        }
        System.out.println("Numeros sorteados: ");
        for(int numero : numeros){
            System.out.print(numero + ", ");
        }

        System.out.println("Sucessores:");
        for(int numero : numeros){
            System.out.print( (numero + 1) + ", ");
        }

    }
    public static void ArrayMultidimensional(){
        Random random = new Random();
        int[][] arrayMultidimensional = new int[4][4];
        int menorNumero = 100, linha = 0, coluna = 0;

        for (int i = 0; i < arrayMultidimensional.length; i++) {
            for (int j = 0; j < arrayMultidimensional[i].length; j++) {
                arrayMultidimensional[i][j] = random.nextInt(9);
                System.out.print("" + arrayMultidimensional[i][j] + "|");


                if(arrayMultidimensional[i][j] < menorNumero){
                    menorNumero = arrayMultidimensional[i][j];
                    linha = i + 1;
                    coluna = j + 1;
                } else if ( (i  == 3) && (j == 3 )){
                    System.out.println("Menor numero: " + menorNumero + ". Localizado na linha e coluna: " + linha + "," + coluna);
                } else if (j == 3){
                    System.out.println("");
                }

            }
        }
    }
    
}
