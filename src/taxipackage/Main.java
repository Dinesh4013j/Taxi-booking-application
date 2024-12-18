package taxipackage;

import java.util.Scanner;

public class Main {
    static  int  taxiarr[]=new int [5];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to taxi booking application!");
        for(int i=0;i<5;i++) {
            Main.taxiarr[i] = 1;
        }

        int choice = 1;
        while (choice == 1) {
            System.out.println("Please enter a your location");
            System.out.println(" 1-villupuram");
            System.out.println(" 2-kallakuruchi");
            System.out.println(" 3-tirukoilur");
            System.out.println(" 4-kolapparai");
            System.out.println(" 5-chennai");
            int starting=sc.nextInt();
            int ending=sc.nextInt();
            int time=sc.nextInt();

            if (starting >= 1 && starting <= 5 && ending >=1 && ending <= 5)
            {   Taxi taxi=new Taxi();
                taxi.booking(new Customer(starting,ending,time));
                choice =0;
            }
            else{
                System.out.println("we have only these points thank you ..");
            }
            System.out.println("do you want to continue?");
            System.out.println(" 1-yes");
            System.out.println(" 2-no");
            choice = sc.nextInt();
            if(choice !=1){
                System.out.println("Have a nice day");
            }

        }
    }
}