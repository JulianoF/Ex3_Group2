package Main;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Keyboard {
    private Scanner scan;
    public Keyboard(){
        scan = null;
    }
    
    public void productIDInput() throws FileNotFoundException{
        
        System.out.print("Please enter the Product ID (Integer): ");
        scan = new Scanner(System.in);
        int iD = scan.nextInt();     
        CashRegister testCash = new CashRegister();
        testCash.getItem(iD);
    }
}