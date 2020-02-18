/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper;

import java.util.Scanner;
import minesweeper.Function.*;
/**
 *
 * @author jeffrey evan
 */
public class Minesweeper extends Function {
    public static void main(String[] args) {
        Minesweeper obj = new Minesweeper();
        obj.plotBoard();
        obj.calculateCounts();
        int r, c;
        obj.displayFlagMatrix();
        while(true){
            System.out.println("===============");
            Scanner input = new Scanner(System.in);
            System.out.println("enter row");
            r = input.nextInt();
            System.out.println("enter col");
            c = input.nextInt();
            if (obj.play(r, c)){
                System.out.println("You Lose");
                break;
            }
            System.out.println("ok");
            if (obj.checkGameOver()){
                obj.displayFlagMatrix();
                System.out.println("You Win Game");
                break;
            }
            obj.displayFlagMatrix();
        }
    }
}