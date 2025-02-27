package com.directi.training.lsp.exercise_refactored;

public class ElectronicDuckAdapter implements IDuck {
    private ElectronicDuck electronicDuck;

    public ElectronicDuckAdapter(ElectronicDuck electronicDuck) {
        this.electronicDuck = electronicDuck;
        // Ensure the electronic duck is turned on to meet the duck contract.
        this.electronicDuck.turnOn();
    }

    @Override
    public void quack() {
        electronicDuck.quack();
    }

    @Override
    public void swim() {
        electronicDuck.swim();
    }
}
