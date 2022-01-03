package br.com.felipe.gerenciadorcontratosmassivo;

import java.util.List;
import java.util.function.Predicate;

public final class Strategy {
    public int totalValues(final List<Integer> values, final Predicate<Integer> filter){
        return values.stream()
                  .filter(filter)
                  .mapToInt(e->e)
                  .sum();
    }
}
