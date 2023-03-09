package edu.daniel.javabasico.estruturadedados.pilha;
/* LIFO - last in first out.
* A pilha é construida com encadeamento de nós
* O que muda é a regra de manipulação que seguirá o conceito LIFO
*
* Metodos:
* Top() -  apenas retorna o elemento que está no topo da pilha
* pop() - retira o primeiro elemento do topo da pilha
* push() - acrescenta novo elemento na pilha
* isEmpty() - verifica se a referencia é null com retorno booleano
*/
public class Lifo {
    public static void main(String[] args) {

        Pilha minhaPilha = new Pilha();

        minhaPilha.push(new No(1));
        minhaPilha.push(new No(2));
        minhaPilha.push(new No(3));
        minhaPilha.push(new No(4));
        minhaPilha.push(new No(5));
        minhaPilha.push(new No(6));

        System.out.println(minhaPilha);

        System.out.println(minhaPilha.pop());
        System.out.println(minhaPilha);

        minhaPilha.push(new No(99));
        System.out.println(minhaPilha);

    }

}
