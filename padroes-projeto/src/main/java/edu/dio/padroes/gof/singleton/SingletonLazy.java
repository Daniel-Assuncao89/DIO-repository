package edu.dio.padroes.gof.singleton;


/**
 * Singleton "preguiçoso" :
 * @author daniel
 */
public class SingletonLazy {

    private static SingletonLazy instancia;

    private SingletonLazy(){
        super();
    }

    public static SingletonLazy getInstance(){
        if(instancia == null){
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
