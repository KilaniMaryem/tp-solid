package com.directi.training.lsp.exercise;

public class ElectronicDuck extends Duck
{
    private boolean _on = false;

    @Override
    public void quack() {
        if (_on) {
            System.out.println("Electronic duck quack...");
        } else {
            System.out.println("Well, i'm off. Ian't quack!");
        }
    }

    @Override
    public void swim() {
        if (_on) {
            System.out.println("Electronic duck swim...");
        } else {
            System.out.println("Well, i'm off. Ian't swim!");
        }
    }

    public void turnOn() {
        _on = true;
    }

    public void turnOff() {
        _on = false;
    }
}
