/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import game.Attack.*;

/**
 *
 * @author jeffrey evan
 */
public class Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Monster.Value a = new Monster.Value();
        Monster.Name b = new Monster.Name();
        Hero.Value Jeff = new Hero.Value();
        Hero.Name jeff = new Hero.Name();
        Attack.attackMethod();
    }
}
