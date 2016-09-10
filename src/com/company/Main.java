package com.company;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int counter = 0;
        int limit = 100;
        String progressBar[];
        progressBar = new String[]{"[", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "]"};
        while (counter <= limit) {
            printProgressBar(counter, progressBar);
            Thread.sleep(100);
            counter++;
        }
    }

    private static void printProgressBar(int counter, String[] progressBar) {
        if (counter % 10 == 0 && counter >= 10) {
            int i = counter / 10;
            progressBar[i] = "|";
        }
        for (int j = 0; j < 12; j++) {
            System.out.print(progressBar[j]);
        }
        System.out.println(counter +"%");
    }

}

