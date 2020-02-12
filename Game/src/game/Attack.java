/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import game.Hero.*;
import game.Monster.*;
import java.util.Random;

/**
 *
 * @author jeffrey evan
 */
public class Attack {
    static void attackMethod () {
        Random generator = new Random();
        boolean attack = generator.nextBoolean();
        if (attack) {
            System.out.println("You attack");
            int accuracy = generator.nextInt(100);
            Monster.Value a = new Monster.Value();
            Hero.Value Jeff = new Hero.Value();
            if (accuracy >= a.monsterValue[3]){
                System.out.println(Jeff.heroValue[2]);
                a.monsterValue[0] = a.monsterValue[0] - Jeff.heroValue[2];
                System.out.println(a.monsterValue[0]);
            } else {
                System.out.println("You missed");
            }
        } else {
            System.out.println("You are attacked");
            int accuracy = generator.nextInt(100);
            Monster.Value a = new Monster.Value();
            Hero.Value Jeff = new Hero.Value();
            if (accuracy >= Jeff.heroValue[3]){
                System.out.println(a.monsterValue[2]);
                Jeff.heroValue[0] = Jeff.heroValue[0] - a.monsterValue[2];
                System.out.println(Jeff.heroValue[0]);
            } else {
                System.out.println("You dodge");
            }
        }
    }
}