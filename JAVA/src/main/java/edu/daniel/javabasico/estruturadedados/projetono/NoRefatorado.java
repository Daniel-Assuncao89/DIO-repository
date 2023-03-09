package edu.daniel.javabasico.estruturadedados.projetono;

// classe Nó refatorada para utilização de generics

public class NoRefatorado<T> {

    private T conteudo;
    private NoRefatorado<T> proximoNo;

    public NoRefatorado(T conteudo) {
        this.proximoNo = null;
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoRefatorado<T> getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(NoRefatorado<T> proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "conteudo='" + conteudo + '\'' +
                '}';
    }

    public static void main(String[] args) {

        NoRefatorado<String> no1 = new NoRefatorado<>("Conteúdo nó 1");

        NoRefatorado<String> no2 = new NoRefatorado<>("Conteúdo nó 2");
        no1.setProximoNo(no2);

        NoRefatorado<String> no3 = new NoRefatorado<>("Conteúdo nó 3");
        no2.setProximoNo(no3);

        NoRefatorado<String> no4 = new NoRefatorado<>("Conteúdo nó 4");
        no3.setProximoNo(no4);

        //no1 -> no2 -> no3 -> no4 -> null

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no2);

        System.out.println("--------------------");

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());

    }
}
