//This is the program to print a pyramid

package Pyramid;

public class pyramid {
    public static void main(String[] args) {
        System.out.println("Pyramid of Num");

        int a,b,c=10;//c is used for no of lines
        for(a=1;a<=c;a++){
            for(int space=1;space<=c-a;space++){//space too create shape
                System.out.print(" ");
            }
            for(b=1;b<=a;b++){//main info of pyramid
               System.out.print(b);
            }
            for(int j=a-1;j>=1;j--){//2nd main
                System.out.print(j);
            }
            System.out.println();
                          
            }
        }
    }
    //lets run it.