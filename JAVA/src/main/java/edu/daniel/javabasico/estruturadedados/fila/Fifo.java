package edu.daniel.javabasico.estruturadedados.fila;
/*
* First in First out.
*
* Metodos:
* enqueue() - Acrescenta no fim da fila
* dequeue() - O primeiro da fila é retirado
* isEmprty()
 */
public class Fifo {
    public static void main(String[] args) {
        Fila<String> minhaFila = new Fila<>();

        minhaFila.enqueue("primeiro");
        minhaFila.enqueue("segundo");
        minhaFila.enqueue("terceiro");
        minhaFila.enqueue("quarto");

        System.out.println(minhaFila);

        System.out.println(minhaFila.dequeue());
        System.out.println(minhaFila);

        minhaFila.enqueue("ultimo");
        System.out.println(minhaFila);

        System.out.println(minhaFila.first());
        System.out.println(minhaFila);
    }
}
