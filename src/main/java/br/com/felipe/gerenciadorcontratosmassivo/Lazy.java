package br.com.felipe.gerenciadorcontratosmassivo;

import java.util.function.Supplier;

public final class Lazy<T> {
    private  T instance;
    private  Supplier<T> supplier;

    public Lazy(Supplier<T> supplier) {
        this.supplier = supplier;
    }

    public T get(){
        if(instance == null){
            instance = supplier.get();
            supplier = null;
        }
        return instance;
    }
}
