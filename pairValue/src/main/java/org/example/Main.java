package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("Age", 25);
        Pair<Integer, String> pair2 = new Pair<>(404, "Not Found");

        System.out.println("Pair 1: " + pair1);
        System.out.println("Pair 2: " + pair2);

        // Bonus: Using the static factory method
        Pair<String, String> setting = Pair.create("theme", "dark");
        System.out.println("Setting Pair: " + setting);
    }
}







