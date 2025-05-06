package org.example;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.List;

public class CSVStreamProcessor {

    public static double calculateAverageAge(String csvFilePath) throws IOException {
        try (Stream<String> lines = Files.lines(Paths.get(csvFilePath))) {
            List<Integer> validAges = lines
                    .skip(1) // skip header
                    .map(line -> {
                        String[] parts = line.split(",");
                        if (parts.length < 2) {
                            return null;
                        }
                        try {
                            return Integer.parseInt(parts[1].trim());
                        } catch (NumberFormatException e) {
                            return null;
                        }
                    })
                    .filter(age -> age != null)
                    .collect(Collectors.toList());

            if (validAges.isEmpty()) {
                return 0.0;
            }

            return validAges.stream()
                    .mapToInt(Integer::intValue)
                    .average()
                    .orElse(0.0);
        }
    }

    public static void main(String[] args) {
        String filePath = "people.csv"; // Adjust path if needed

        try {
            double averageAge = calculateAverageAge("D:/Anne project/java project/java_repo/CSV_Using_Streams/src/main/java/org/example/people.csv");
            System.out.println("Average Age: " + String.format("%.2f", averageAge));
        } catch (IOException e) {
            System.err.println("Error reading the CSV file: " + e.getMessage());
        }
    }
}
