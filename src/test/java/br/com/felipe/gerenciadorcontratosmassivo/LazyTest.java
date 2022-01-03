package br.com.felipe.gerenciadorcontratosmassivo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LazyTest {

    @Test
    void should_execute_compute_method(){
        int x = 14;
        var temp = new Lazy<>(() -> compute(x));
        String result;
        if(x > 5 && temp.get() > 7)
            result = "Path 1 " + temp.get();
        else
            result = "Path 2";

        Assertions.assertEquals("Path 1 " + temp.get(), result);
    }

    @Test
    void should_not_execute_compute_method(){
        int x = 1;
        var temp = new Lazy<>(() -> compute(x));
        String result;
        if(x > 5 && temp.get() > 7)
            result = "Path 1 " + temp.get();
        else
            result = "Path 2";

        Assertions.assertEquals("Path 2", result);
    }

    @Test
    void test(){
        int x = 1;
        var temp = new Lazy<>(() -> compute(x));
        System.out.println("here...");
        if(x > 5 && temp.get() > 7)
            System.out.println("Path 1 " + temp.get());
        else
            System.out.println("Path 2");

    }

    private int compute(int n){
        System.out.println("called compute method...");
        return n*2;
    }
}
