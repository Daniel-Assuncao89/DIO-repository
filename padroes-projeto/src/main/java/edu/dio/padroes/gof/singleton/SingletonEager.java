package edu.dio.padroes.gof.singleton;


/**
 * Singleton "apressado" :
 * @author daniel
 */
public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstance(){
        return instancia;
    }
}
