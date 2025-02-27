package com.directi.training.isp.exercice_refactor;

import java.util.Random;

public class Sensor {
    public void register(ProximitySensorClient client) {
        while (true) {
            if (isPersonClose()) {
                client.proximityCallback();
                break;
            }
        }
    }

    private boolean isPersonClose() {
        return new Random().nextBoolean();
    }
}