//This is a code written for Guessing The Number Game

package GuessNum;

import java.util.*;

public class GuessNum {

    public static void main(String[] args) {

        Random n=new Random();//To Guess The number
        int f=n.nextInt(101);
        System.out.println("Welcome to the number Guessing Game.\n");
        System.out.println("Please enter a number between 0 to 100");
        Scanner s= new Scanner(System.in);
        
        int x;
        do{
             x= s.nextInt();
        if (x==f) {
            System.out.println("You Guessed it right.");            
        }
        else if(x<f){
            System.out.println("Too Low Try Again");
        }
        else{
            System.out.println("Too High Try Again.");
        }
    }
    while(x!=f);
    //We Used DO While to make it repetitive.

    s.close();
    }
    
}

//Now Let's Run It.