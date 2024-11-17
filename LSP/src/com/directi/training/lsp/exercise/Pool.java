package com.directi.training.lsp.exercise;

public class Pool
{
    public void run() {
        Duck donaldDuck = new Duck();
        Duck electronicDuck = new ElectronicDuck();
        
       
        quack(donaldDuck, electronicDuck);
        swim(donaldDuck, electronicDuck);
    }

    private void quack(Duck... ducks) {
        for (Duck duck : ducks) {
            duck.quack();
        }
    }

    private void swim(Duck... ducks) {
        for (Duck duck : ducks) {
            duck.swim();
        }
    }

    public static void main(String[] args) {
        Pool pool = new Pool();
        pool.run();
    }
}
