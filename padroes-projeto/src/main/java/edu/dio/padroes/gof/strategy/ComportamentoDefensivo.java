package edu.dio.padroes.gof.strategy;

public class ComportamentoDefensivo implements Comportamento{
    @Override
    public void mover() {
        System.out.println("Movimentando Defensivamente...");
    }
}
