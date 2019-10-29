package org.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int random;
        int pickedNumber;
        int answer;

        Scanner keyboard;
        keyboard = new Scanner(System.in);



        random = (int) (Math.random()* 30);
        System.out.println("I am thinking of a number between 1 and 30, can you guess it?");


        pickedNumber = keyboard.nextInt();
        while (pickedNumber != random) {

            if(pickedNumber < random){
                System.out.println(pickedNumber+ " is too low");
                 pickedNumber = keyboard.nextInt();
            }
             else if (pickedNumber > random) {
                System.out.println(pickedNumber + " is too high!");
                pickedNumber = keyboard.nextInt();
            }

                if(pickedNumber == random) {
                    System.out.println("You are correct!");
                }

        }












//        pickedNumber = (int) (Math.random()*2);

 //       for(int i = 0; i <20; i++) {
 //           pickedNumber = (int) (Math.random()*30)+1;
 //           System.out.println(pickedNumber);
//
        }
    }

