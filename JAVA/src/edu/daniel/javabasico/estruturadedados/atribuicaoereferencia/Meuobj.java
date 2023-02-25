package edu.daniel.javabasico.estruturadedados.atribuicaoereferencia;

public class Meuobj {

    Integer num;

    public Meuobj(Integer num) {
        this.num = num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString(){
        return this.num.toString();
    }

    public static void main(String[] args) {
        int intA = 1;
        int intB = intA;

        System.out.println("intA=" + intA + " intB=" + intB);
        intA = 2;
        System.out.println("intA=" + intA + " intB=" + intB);

        Meuobj objA = new Meuobj(1);
        Meuobj objB = objA;

        System.out.println("objA=" + objA + " objB=" + objB);
        objA.setNum(2);
        System.out.println("objA=" + objA + " objB=" + objB);
    }
}
