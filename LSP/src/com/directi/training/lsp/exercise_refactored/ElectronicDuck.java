// File: com/directi/training/lsp/exercise/ElectronicDuck.java
package com.directi.training.lsp.exercise_refactored;

public class ElectronicDuck {
    private boolean _on = false;

    public void turnOn() {
        _on = true;
    }

    public void turnOff() {
        _on = false;
    }

    public void quack() {
        if (_on) {
            System.out.println("Electronic duck quack...");
        } else {
            throw new RuntimeException("Can't quack when off");
        }
    }

    public void swim() {
        if (_on) {
            System.out.println("Electronic duck swim...");
        } else {
            throw new RuntimeException("Can't swim when off");
        }
    }
}
