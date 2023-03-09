package edu.daniel.javabasico.estruturadedados.listaduplamenteencadeada;

public class Main {
    public static void main(String[] args) {

        ListaDuplamenteEncadeada<String> duplamenteEncadeada = new ListaDuplamenteEncadeada<>();

        duplamenteEncadeada.add("c1");
        duplamenteEncadeada.add("c2");
        duplamenteEncadeada.add("c3");
        duplamenteEncadeada.add("c4");
        duplamenteEncadeada.add("c5");
        duplamenteEncadeada.add("c6");
        duplamenteEncadeada.add("c7");

        System.out.println(duplamenteEncadeada);

        duplamenteEncadeada.remove(3);
        System.out.println(duplamenteEncadeada);

        duplamenteEncadeada.add(3, "99");
        System.out.println(duplamenteEncadeada);

        System.out.println(duplamenteEncadeada.get(3));
    }
}
