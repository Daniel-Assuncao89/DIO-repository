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
        Fila minhaFila = new Fila();

        minhaFila.enqueue(new No("primeiro"));
        minhaFila.enqueue(new No("segundo"));
        minhaFila.enqueue(new No("terceiro"));
        minhaFila.enqueue(new No("quarto"));

        System.out.println(minhaFila);

        System.out.println(minhaFila.dequeue());
        System.out.println(minhaFila);

        minhaFila.enqueue(new No("ultimo"));
        System.out.println(minhaFila);

        System.out.println(minhaFila.first());
        System.out.println(minhaFila);
    }
}
