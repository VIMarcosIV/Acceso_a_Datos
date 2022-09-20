package Clase_Optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<Double> result = averageScore(10.0, 3.4, 4.2);
        if (result.isPresent()) {
            System.out.println(result.get());
        } else System.out.println("Nothing");
    }

    private static Optional<Double> averageScore(Double... scores) {
        if (scores.length == 0) {
            return Optional.empty();
        } else {
            double suma = 0;
            for (Double score : scores) suma += score;
            return Optional.of(suma / scores.length);
        }
    }
}
