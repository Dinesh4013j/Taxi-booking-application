package taxipackage;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;

//import static taxipackage.Main.taxiarr;

public class Taxi {



    public void booking(Customer customer) {
        int maxi=5;
        int ind=1;
        for (int i=0;i<5;i++) {
            int cur= Main.taxiarr[i];
            if (Math.abs(cur-customer.starting)<maxi) {
                maxi=Math.abs(cur-customer.starting);
                ind=i;
            }
        }
        System.out.println("Taxi booked "+(ind+1));
        Main.taxiarr[ind]=customer.destination;
    }
}
