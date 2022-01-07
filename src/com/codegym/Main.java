package com.codegym;

public class Main {

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        long sum = 0;

        stopWatch.start();
        for (int i = 0; i < 999999999; i++) {
            sum += i;
        }
        stopWatch.stop();
        System.out.println("Thời gian chạy là " + stopWatch.getElapsedTime() + "ms");
    }
}
