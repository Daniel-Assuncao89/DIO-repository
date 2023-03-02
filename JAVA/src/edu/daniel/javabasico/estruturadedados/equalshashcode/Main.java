package edu.daniel.javabasico.estruturadedados.equalshashcode;

import java.util.*;

public class Main {
    public static void main(String[] args) {

/*        List<Carro> listaCarros = new ArrayList<>();

        listaCarros.add(new Carro("Ford"));
        listaCarros.add(new Carro("Chevrolet"));
        listaCarros.add(new Carro("Volkswagen"));

        System.out.println(listaCarros.contains(new Carro("Ford"))); //utiliza o equals para comparar e retorna valor booleano.
        System.out.println(new Carro("Ford").hashCode());
        System.out.println(new Carro("Ford").hashCode());
        System.out.println(new Carro("Ford1").hashCode());

        Carro carro1 = new Carro("Ford");
        Carro carro2 = new Carro("Chevrolet");

        System.out.println(carro1.equals(carro2));*/

/*        Stack<Carro> stackCarros = new Stack<>();

        stackCarros.push(new Carro("Ford"));
        stackCarros.push(new Carro("Chevrolet"));
        stackCarros.push(new Carro("Fiat"));

        System.out.println(stackCarros);
        System.out.println(stackCarros.pop());
        System.out.println(stackCarros);

        System.out.println(stackCarros.peek()); //mostra sem retirar
        System.out.println(stackCarros);

        System.out.println(stackCarros.empty());*/


      /*  Queue<Carro> queueCarros = new LinkedList<>();

        queueCarros.add(new Carro("Ford"));
        queueCarros.add(new Carro("Chevrolet"));
        queueCarros.add(new Carro("Fiat"));

        System.out.println(queueCarros.add(new Carro("Peugeout")));
        System.out.println(queueCarros);

        System.out.println(queueCarros.offer(new Carro("Renault"))); // offer parecido com add, caso nao consiga adicionar ele nao vai dar erro, mas sim retornar false.
        System.out.println(queueCarros);

        System.out.println(queueCarros.peek()); // retorna o primeiro carro da fila, se estiver vazia retorna null.
        System.out.println(queueCarros);

        System.out.println(queueCarros.poll()); // retira o primeiro carro da fila, se estiver vazia retorna null.
        System.out.println(queueCarros);

        System.out.println(queueCarros.isEmpty());
        System.out.println(queueCarros.size());*/


    /*    List<Carro> listCarros = new ArrayList<>();

        listCarros.add(new Carro("Ford"));
        listCarros.add(new Carro("Chevrolet"));
        listCarros.add(new Carro("Fiat"));
        listCarros.add(new Carro("Peugeout"));

        System.out.println(listCarros.contains(new Carro("Ford")));

        System.out.println(listCarros.get(2));

        System.out.println(listCarros.indexOf(new Carro("Fiat")));

        System.out.println(listCarros.remove(2));
        System.out.println(listCarros);*/

        Set<Carro> hashSetCarros = new HashSet<>(); // não preserva a ordem de exibição

        hashSetCarros.add(new Carro("Ford"));
        hashSetCarros.add(new Carro("Chevrolet"));
        hashSetCarros.add(new Carro("Fiat"));
        hashSetCarros.add(new Carro("Peugeot"));
        hashSetCarros.add(new Carro("Zip"));
        hashSetCarros.add(new Carro("Alfa romeo"));

        System.out.println(hashSetCarros);

        Set<Carro> treeSetCarros = new TreeSet<>();

        treeSetCarros.add(new Carro("Ford"));
        treeSetCarros.add(new Carro("Chevrolet"));
        treeSetCarros.add(new Carro("Fiat"));
        treeSetCarros.add(new Carro("Peugeot"));
        treeSetCarros.add(new Carro("Zip"));
        treeSetCarros.add(new Carro("Alfa romeo"));

        System.out.println(treeSetCarros); // para mostrar a arvore precisa utilizar o implements comparable e criar o metodo compareTo()
    }
}
