/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.devcribs.patterns.Decorator.Weapon;

/**
 *
 * @author advirtys
 */
public abstract class Weapon {
    public String title = "";

    public String getTitle() {
        return title;
    }
    
    public abstract double cost();
}
