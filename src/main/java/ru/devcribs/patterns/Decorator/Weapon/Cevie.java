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
public class Cevie extends WeaponDecorator{
    private Weapon weapon;

    public Cevie(Weapon weapon) {
        this.weapon = weapon;
    }
    
    
    @Override
    public String getTitle() {
        return weapon.getTitle() + " цевье , накладка на газовую трубку"
                + "( с четырьмя планками Пикатини) AKL47";
    }

    @Override
    public double cost() {
        return weapon.cost() + 100;
        }
    
}
