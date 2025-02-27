package com.directi.training.isp.exercice_refactor;

import java.util.TimerTask;

public class Timer {
    public void register(long timeOut, TimerClient client) {
        java.util.Timer timerUtility = new java.util.Timer();
        timerUtility.schedule(new TimerTask() {
            @Override
            public void run() {
                client.timeOutCallback();
            }
        }, timeOut);
    }
}