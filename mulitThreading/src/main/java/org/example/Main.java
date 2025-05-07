package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class DownloadTask extends Thread {
    private String fileName;

    public DownloadTask(String fileName) {
        this.fileName = fileName;
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Downloading " + fileName + " - part " + i);
            try {
                Thread.sleep(60000); // Simulate time delay
            } catch (InterruptedException e) {
                System.out.println("Download interrupted for " + fileName);
            }
        }
        System.out.println(fileName + " download complete!");
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DownloadTask file1 = new DownloadTask("File_A");
        DownloadTask file2 = new DownloadTask("File_B");
        DownloadTask file3 = new DownloadTask("File_C");

        // Start all downloads (threads run in parallel)
        file1.start();
        file2.start();
        file3.start();

        // Wait for all downloads to finish
        file1.join();
        file2.join();
        file3.join();

        System.out.println("All downloads finished. Ready to install!");
    }
}


