package br.com.felipe.gerenciadorcontratosmassivo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;

public class DecoratorTest {


    @Test
    void should_combine_functions(){
        Function<Integer,Integer> inc = e-> e + 1;
        Function<Integer,Integer> doubled = e-> e * 2;
        Function<Integer, Integer> incAndDoubledFunction = inc.andThen(doubled);
        printIt(5, "Incremented and doubled", incAndDoubledFunction);
    }
    @Test
    void should_apply_brighter_filter_using_decorator_pattern(){
        CameraDecorator cameraDecorator = new CameraDecorator(Color::brighter);
        assertEquals(new Color(178,178,178), cameraDecorator.snap(new Color(125,125,125)));
    }

    @Test
    void should_apply_darker_and_brighter_filters_using_decorator_pattern(){
        CameraDecorator cameraDecorator = new CameraDecorator(Color::brighter,Color::darker);
        System.out.println(cameraDecorator.snap(new Color(125,125,125)));
        assertEquals(new Color(124,124,124), cameraDecorator.snap(new Color(125,125,125)));
    }

    private void printIt(int n, String msg, Function<Integer,Integer> func){
        System.out.println(n + " " + msg + " : " + func.apply(n));
    }


}
