//package com.company;
import java.util.Scanner;
import java.util.Random;
 class Game{
     int computer;

     public Game(){
         Random rand = new Random();
         computer = rand.nextInt(100);
         System.out.println("Guess the number from 1 to 100");
     }
     public int computerNo(){return computer;}
 }
 public class task1 {
     static int takeUserInput(){
         int user;
         System.out.println("Enter ");
         Scanner sc = new Scanner(System.in);
         user = sc.nextInt();
         return user;
     }

     static void iscorrectNumber(int i,int j){
         if(i==j){
             System.out.println("correct No. Guess");
         }
         else if(i>j){
             System.out.println("Your No. is greater than computer number");
         }
         else{
             System.out.println("Your no. is smaller than computer number");
         }
     }
     public static void main(String[] args){
         int user=0,computer=0,itteration=0;
         Game g= new Game();
         do{
             user= takeUserInput();
             computer=g.computerNo();

             iscorrectNumber(user, computer);
             itteration++;
         } while(user!=computer);
         System.out.println("you Guess no. in "+ itteration+" ITTERATION");
     }
 }
