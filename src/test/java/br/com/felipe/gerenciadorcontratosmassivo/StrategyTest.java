package br.com.felipe.gerenciadorcontratosmassivo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StrategyTest {
    @Test
    void should_calculate_total_values(){
        Strategy strategy = new Strategy();
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int total = strategy.totalValues(numbers, e -> true);
        assertEquals(55, total);
    }

    @Test
    void should_calculate_total_even_values(){
        Strategy strategy = new Strategy();
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int total = strategy.totalValues(numbers, e -> e % 2 == 0);
        assertEquals(30, total);
    }

    @Test
    void should_calculate_total_odd_values(){
        Strategy strategy = new Strategy();
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int total = strategy.totalValues(numbers, e -> e % 2 != 0);
        assertEquals(25, total);
    }


}
