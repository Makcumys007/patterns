/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.devcribs.patterns.Observer.Math;

/**
 *
 * @author advirtys
 */
public class MathDiv implements Observer {
    private MathData math;
    private int a, b;

    public MathDiv(MathData math) {
        this.math = math;
        math.registerObserver(this);
    }
    

    @Override
    public void update(int a, int b) {
        int c = a / b;
        System.out.println("Диление числа " + a + " и " + b + " = " + c);
    }
    
    
    
}
