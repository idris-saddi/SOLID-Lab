package com.directi.training.lsp.exercise_refactored;

public class NaturalDuck implements IDuck {
    @Override
    public void quack() {
        System.out.println("Quack...");
    }

    @Override
    public void swim() {
        System.out.println("Swim...");
    }
}
