package Tempconverter;

import java.util.Scanner;//necessary header file for operation

public class Tempconverter {//main code
    public static void main(String[] args) {
        int num,t1;//taking variable for conversion
        
        //using do while for repeatitive conversion
        do{
            
        System.out.println("Select the conversion you want to Perform:");
        System.out.println("1.Celsius to Fahrenhiet.");
        System.out.println("2.Celsius to Kelvin.");
        System.out.println("3.Fahrenhiet to Celcius.");
        System.out.println("4.Fahrenhiet to Kelvin.");
        System.out.println("5.Kelvin to Celcius.");
        System.out.println("6.Kelvin to Fahrenhiet.");
        System.out.println("0.Exit.");
        Scanner sc =new Scanner(System.in);
        num=sc.nextInt();

        switch (num) {//using switch for better understanding
            case 1:
                System.out.println("Enter Temperature (Celsius): ");
                Scanner sc1=new Scanner(System.in);
                t1=sc1.nextInt();
                System.out.println("Fahrenhiet: "+((t1*(1.8))+32));
                break;
            
            case 2:
                System.out.println("Enter Temperature (Celsius): ");
                Scanner sc2=new Scanner(System.in);
                t1=sc2.nextInt();
                System.out.println("Fahrenhiet: "+(t1+273.15));
                break;
            case 3:
                System.out.println("Enter Temperature (Fahrenhiet): ");
                Scanner sc3=new Scanner(System.in);
                t1=sc3.nextInt();
                System.out.println("Celsius: "+(t1-32)/1.8);
                break;
            case 4:
                System.out.println("Enter Temperature (Fahrenhiet): ");
                Scanner sc4=new Scanner(System.in);
                t1=sc4.nextInt();
                System.out.println("Kelvin: "+(((t1-32)/1.8)+273.15));
                break;
            case 5:
                System.out.println("Enter Temperature (Kelvin): ");
                Scanner sc5=new Scanner(System.in);
                t1=sc5.nextInt();
                System.out.println("Celsius: "+(t1-273.15));
                break;
            case 6:
                System.out.println("Enter Temperature (Kelvin): ");
                Scanner sc6=new Scanner(System.in);
                t1=sc6.nextInt();
                System.out.println("Feherenhiet: "+(((t1-273.15) * 1.8)+32));
                break;
            case 0:
                System.out.println("Exiting");
                break;
        
            default:
                break;
        }
    }
    while(num!=0);
}
}
// I am taking three type of temperature measurement you can choose as much as you like.
//now lets run it.