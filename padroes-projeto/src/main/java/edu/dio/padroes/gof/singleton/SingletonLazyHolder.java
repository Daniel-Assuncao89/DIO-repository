package edu.dio.padroes.gof.singleton;


/**
 * Singleton "Lazy Holder".
 * @author daniel
 */
public class SingletonLazyHolder {

    private static class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getInstance(){

        return InstanceHolder.instancia;
    }
}
