package com.directi.training.lsp.exercise_refactored;

public class Pool {
    public void run() {
        IDuck donaldDuck = new NaturalDuck();
        IDuck electronicDuck = new ElectronicDuckAdapter(new ElectronicDuck());
        quack(donaldDuck, electronicDuck);
        swim(donaldDuck, electronicDuck);
    }

    private void quack(IDuck... ducks) {
        for (IDuck duck : ducks) {
            duck.quack();
        }
    }

    private void swim(IDuck... ducks) {
        for (IDuck duck : ducks) {
            duck.swim();
        }
    }

    public static void main(String[] args) {
        Pool pool = new Pool();
        pool.run();
    }
}
