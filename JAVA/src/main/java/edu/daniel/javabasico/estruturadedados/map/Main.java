package edu.daniel.javabasico.estruturadedados.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //   Key,   value
        Map<String, String> aluno = new HashMap<>();

        aluno.put("Nome", "Joao");
        aluno.put("Idade", "17");
        aluno.put("Media", "8.5");
        aluno.put("Turma", "3a");


        System.out.println(aluno);

        System.out.println(aluno.keySet()); // retorna o grupo de chaves
        System.out.println(aluno.values()); // retorna o grupo de valores

        List<Map<String, String>> listaAlunos = new ArrayList<>(); //Cria uma lista com ExemploMap

        listaAlunos.add(aluno);

        Map<String, String> aluno2 = new HashMap<>();

        aluno2.put("Nome", "Maria");
        aluno2.put("Idade", "18");
        aluno2.put("Media", "8.9");
        aluno2.put("Turma", "3b");

        listaAlunos.add(aluno2);

        System.out.println(listaAlunos);

        System.out.println(aluno.containsKey("Nome"));
    }
}
