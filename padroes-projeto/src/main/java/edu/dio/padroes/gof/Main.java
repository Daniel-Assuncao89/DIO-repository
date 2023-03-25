package edu.dio.padroes.gof;

import edu.dio.padroes.gof.facade.Facade;
import edu.dio.padroes.gof.singleton.SingletonEager;
import edu.dio.padroes.gof.singleton.SingletonLazy;
import edu.dio.padroes.gof.singleton.SingletonLazyHolder;
import edu.dio.padroes.gof.strategy.*;

public class Main {

    public static void main(String[] args) {
        // Singleton
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);

        SingletonLazyHolder holder = SingletonLazyHolder.getInstance();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstance();
        System.out.println(holder);

        // Strategy
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);

        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        //faced

        Facade facade = new Facade();

        facade.migrarCliente("Daniel", "00000000");

    }
}
