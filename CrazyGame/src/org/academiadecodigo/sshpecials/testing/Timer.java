package org.academiadecodigo.sshpecials.testing;

public class Timer {

    private long startTime;
    private long elapsedTime = System.currentTimeMillis() - startTime;
    private long elapsedSeconds = elapsedTime / 1000;
    private long secondsDisplay = elapsedSeconds % 60;
    long elapsedMinutes = elapsedSeconds / 60;

    public Timer() {

        long startTime = System.currentTimeMillis();

    }

    public long getElapsedTimeSeconds() {
        return (System.currentTimeMillis() - startTime) / 1000;

    }
    public void showElapsedTimeSeconds() {
        System.out.println((System.currentTimeMillis() - startTime) / 1000);
    }



}
