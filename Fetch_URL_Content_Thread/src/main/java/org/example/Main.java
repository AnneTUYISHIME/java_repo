package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> urls = Arrays.asList(
                "https://www.example.com",
                "https://www.wikipedia.org",
                "https://www.google.com"
        );

        int count = 1;
        for (String url : urls) {
            URLFetcherThread fetcher = new URLFetcherThread(url);
            Thread thread = new Thread(fetcher);
            thread.setName("FetcherThread-" + count++);
            thread.start();
        }

        System.out.println("Main thread continues processing...");
    }
}
