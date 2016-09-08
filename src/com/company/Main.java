package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        int counter = 0;
        int limit = 100;
        String progressBar = "";
        while(counter<=limit){
            String progressLabel = "[";
            if (counter % 10 == 0 && counter >= 10){
                progressBar +="|";
            }
            progressLabel += progressBar;
            int spaceNum = (limit-counter)/10;
            for (int cursor = 0; cursor < spaceNum ; cursor++) {
                progressLabel +="*";
            }
            progressLabel += "]";
            Thread.sleep(100);
            if( counter % 10 == 0) {
                System.out.println(progressLabel + "" + counter + "%");
            }
            counter=counter+1;
        }

    }
}

