package org.example;
import java.util.List;
import java.util.stream.Collectors;




    public class EvenNumberFilter {

        public static List<Integer> filterEvenNumbers(List<Integer> numbers) {
            if (numbers == null) {
                throw new IllegalArgumentException("Input list cannot be null");
            }

            // Using Streams and Lambda to filter even numbers
            return numbers.stream()
                    .filter(n -> n % 2 == 0)
                    .collect(Collectors.toList());
        }
    }


