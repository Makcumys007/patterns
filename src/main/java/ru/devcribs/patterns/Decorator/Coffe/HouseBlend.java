/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.devcribs.patterns.Decorator.Coffe;

/**
 *
 * @author advirtys
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }
    

    @Override
    public double cost() {
        return .99;
    }
    
}
