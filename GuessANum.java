/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessanum;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Likesh Krishna
 */
public class GuessANum {

    int theNumber;
    int max;
    Scanner scanner = new Scanner(System.in);

    public GuessANum() {//constructor
        Random rand = new Random();
        max = 100;
        theNumber = Math.abs(rand.nextInt()) % (max + 1);
    }

    public void play() {//function
        while (true) {
            int num = scanner.nextInt();
            if (num < theNumber) {
                System.out.println("number is small");
            } else if (num > theNumber) {
                System.out.println("number is large");
            } else {
                System.out.println("thats the number");
                break;
            }
        }
    }


public static void main(String[] args) {
        GuessANum game = new GuessANum();
        System.out.println("lets start the game");
        game.play();
        // TODO code application logic here
    }
    
}
