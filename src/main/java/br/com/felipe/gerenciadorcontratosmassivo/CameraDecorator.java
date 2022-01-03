package br.com.felipe.gerenciadorcontratosmassivo;

import java.awt.*;
import java.util.function.Function;
import java.util.stream.Stream;

public class CameraDecorator {
    private Function<Color, Color> filter;

    /***
     * Normal style
     */
//    public CameraDecorator(Function<Color,Color>... filters){
//        filter = input-> input;
//        for (Function<Color, Color> aFilter : filters){
//            filter = filter.andThen(aFilter);
//        }
//    }

    /***
     * Using functional style
     */
//    public CameraDecorator(Function<Color,Color>... filters){
//        filter = Stream.of(filters)
//                .reduce(input->input, (aFilter, result) -> result.andThen(aFilter));
//    }

    /***
     * Using functional style
     */
    public CameraDecorator(Function<Color,Color>... filters){
        filter = Stream.of(filters)
                .reduce(Function.identity(), Function::andThen);
    }

    public Color snap(Color input){
        return filter.apply(input);
    }
}
